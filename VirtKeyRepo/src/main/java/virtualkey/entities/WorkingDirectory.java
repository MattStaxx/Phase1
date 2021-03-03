package virtualkey.entities;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

// This class retrieves and stores a file system location as a Path variable for use in conjunction with the FileBuild class
// Note: In future implementations, this class would accept user input to create new and additional directories, as well 
// as navigation within the file system.
public class WorkingDirectory {

	String wholeFileAdd;
	private Path absPath = FileSystems.getDefault().getPath("src/main/resources");
	
	// retrieveFiles()  method creates a DirectoryStream object to print out the files found in the initialized file
	// system path, this stream is then output through a REGEX statement that reduces the file location down to 
	// only the the file name and extension, I/O exception handling is also provided, although unlikely to be needed.
	public void retrieveFiles() {

		try {
			DirectoryStream<Path> strm = Files.newDirectoryStream(absPath);
			for(Path files : strm) {
				wholeFileAdd = files.toString();
				System.out.println(wholeFileAdd.replaceAll("^.*[\\/\\\\]", ""));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// getAbsPath() method provides a way for other classes to access the "hard-coded" file system address to be 
	// used by this application
	public Path getAbsPath() {
		
		return absPath;
	}
}

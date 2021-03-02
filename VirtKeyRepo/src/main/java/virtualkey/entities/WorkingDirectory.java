package virtualkey.entities;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

import org.apache.commons.io.FilenameUtils;

public class WorkingDirectory {

	String wholeFileAdd;
	private Path absPath = FileSystems.getDefault().getPath("src/main/resources");
	
	public void retrieveFiles() {

		try {
			DirectoryStream<Path> strm = Files.newDirectoryStream(absPath);
			for(Path files : strm) {
				wholeFileAdd = files.toString();
				//System.out.println(FilenameUtils.getName(wholeFileAdd));
				System.out.println(wholeFileAdd.replaceAll("^.*[\\/\\\\]", ""));
				//setFile(wholeFileAdd.replaceAll("^.*[\\/\\\\]", ""));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Path getAbsPath() {
		
		return absPath;
	}
}

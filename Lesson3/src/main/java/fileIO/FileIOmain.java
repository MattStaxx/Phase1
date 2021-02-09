package fileIO;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Scanner;

/*
 * author @Matthew Stallman
 */

public class FileIOmain {

	public static void main(String[] args) throws IOException {
		
		int entry;
		String fileName = "TestFile.txt";
		FileManipulation fileEx = new FileManipulation();
		Path pwd = FileSystems.getDefault().getPath(".").toAbsolutePath();
		Scanner in = new Scanner(System.in);
		
		// Introduction with present working directory
		System.out.println("*********************");
		System.out.println(pwd);
		System.out.println("*********************\n");
		
		// Initial file creation and reading of that file
		fileEx.createFile(fileName);
		fileEx.readFileStreams(fileName);
		
		// User prompt for deleting
		System.out.print("\nPRESS '1' to delete " + fileEx.getMyFile() + " PRESS any other key to continue without deleting >> ");
		entry = in.nextInt();
		if(entry == 1) {
			fileEx.deleteFileIfExists(fileName);
		}
		else {
			System.out.print("");
		}
		
		// User prompt for writing
		System.out.print("\nPRESS '1' to write to " + fileEx.getMyFile() 
						+ " PRESS any other key to continue without writing, writing to an existing file will append an '!' to the file >> ");
		entry = in.nextInt();
		if(entry == 1) {
			fileEx.writeFileStreams("Stream Write", fileName);
			System.out.print("After write operation ");
			fileEx.readFileStreams(fileName);
		}
		else {
			System.out.println("***  No write operation performed  ***");
			fileEx.readFileStreams(fileName);
		}
		// Final read after various operations
		
		// Close Scanner tool
		in.close();
	}
}
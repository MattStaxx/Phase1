package virtualkey.entities;

import java.nio.file.Path;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.util.Scanner;

public class FileBuild {

	WorkingDirectory wd = new WorkingDirectory();
	Scanner in = new Scanner(System.in);
    
	public void buildFile() {

		try {
			System.out.print("Enter a file name to add >> ");
			String fileName = in.nextLine();
			Path file = wd.getAbsPath().resolve(fileName);
			Files.createFile(file).toAbsolutePath();
			System.out.println("File created: " + file.getFileName() + " ...in directory: " + wd.getAbsPath());
		} catch(FileAlreadyExistsException fax) {
			System.err.println("File already exists with that name...");
		} catch(NoSuchFileException nsf) {
			System.err.println("Invalid file name...try again");
		} catch(IOException e) {
			e.printStackTrace();
		} catch(Exception e) {
			System.err.println("Unknown error, try again...");
		}
	}
	
	public void deleteFile() { // delete whole directory/all files??
		
		try {
			System.out.print("Enter a file name to delete >> ");
			String fileName = in.nextLine();
			Path file = wd.getAbsPath().resolve(fileName);
			if(Files.deleteIfExists(file) == true) {
				System.out.println("File deleted: " + file.getFileName() + " ...from directory: " + wd.getAbsPath());
			} else {
				System.err.println("ERROR: FILE NOT FOUND...NO FILES DELETED");
			}
		} catch(FileNotFoundException fnf) {
			System.err.println("ERROR: " + fnf.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		} catch(Exception e) {
			System.err.println("Unknown error, try again...");
		}
	}
	
	public void searchFile() {
		
		try {
			System.out.print("Enter a file name to search >> ");
			String fileName = in.nextLine();
			Path file =  wd.getAbsPath().resolve(fileName);
			if(Files.exists(file) == true) {
				System.out.println(file.getFileName() + " <-- file FOUND in directory --> " + wd.getAbsPath());
			} else {
				System.out.println(file.getFileName() + " <-- file NOT FOUND in directory --> " + wd.getAbsPath());
			}
		} catch(Exception e) {
			System.err.println("Unknown error, try again...");
		}
	}
}
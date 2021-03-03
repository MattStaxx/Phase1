package virtualkey.entities;

import java.nio.file.Path;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import virtualkey.userinput.UserInput;

// This class facilitates and stores data relevant to the construction, destruction and searching.
public class FileBuild {

	UserInput ui = new UserInput();
	WorkingDirectory wd = new WorkingDirectory();
	Scanner in = new Scanner(System.in);
    
	// buildFile() method accepts user input as a stream, retrieves a path within the file system, appends that String
	// to the Path retrieved, creates a file at the retrieved location with the file name set to the String that the 
	// user provided. Also provides exception handling in the context of file management exceptions
	// Note: The regex provides a check of the user input to determine if the input is only composed of letters and/or 
	// 		 numbers, has a '.' and an extension that is at least two characters long. Future updates shall bring this 
	//       restriction completely inline with NTFS standards regarding filename composition.
	public void buildFile() {

		
		try {
			String regex = "(\\w+)\\.(\\w{2,})";
			System.out.print("Enter a file name to add >> ");
			String fileName = ui.getUserFile();
			if(fileName.matches(regex) == false) {
				System.out.println("\nFile name must be composed of only letters and/or numbers, include \none '.' and have an "
									+ "extension with at least two word characters...\n...please enter a valid file name...");
				buildFile();
			} else {
				Path file = wd.getAbsPath().resolve(fileName);
				Files.createFile(file).toAbsolutePath();
				System.out.println("File created: " + file.getFileName() + " ...in directory: " + wd.getAbsPath());
			}
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
	
	// deleteFile() method accepts user input as a String, appends that String to the Path value retrieved from the 
	// WorkingDirectory class, then checks for the existence of the specified file with the deleteIfExists() method, here, 
	// a return value of true carries out the delete operation as well as a delete confirmation message, 
	// while a return value of false results in no changes being made as well as a FNF message. Also included is 
	// exception handling for relevant exceptions possible when accessing files
	public void deleteFile() {
		
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
	
	// searchFile() method accepts user input as a String, appends that String to the Path value retrieved from the 
	// WorkingDirectory class, then checks the existence of a file at that location using the exists() method, here, 
	// a return value of true provides a file found message, while a return value of false provides an FNF message.
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
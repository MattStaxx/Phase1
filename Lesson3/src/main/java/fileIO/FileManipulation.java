package fileIO;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileManipulation {
	
	private File myFile;
	private String textToWrite;
	
	// Method to retrieve file name
	public File getMyFile() {
		
		return myFile;
	}

	// Method to set text sent from main
	public void setTextToWrite(String ttw) {
		
		textToWrite = ttw;
	}
	
	// Method to retrieve text 
	public String getTextToWrite() {
		
		return textToWrite;
	}
	
	// Constructor to create file object
	public File createFile(String fileName) {
		
		try {
			myFile = new File(fileName);
			if(myFile.exists()) {
				System.out.println("***  " + fileName + " already exists  ***");
				return (myFile);
			}
			myFile.createNewFile();
			System.out.println("***  " + fileName + " created  ***");
			
		} catch(Exception ex) {
			System.err.println(ex.getMessage());
		}
		return myFile;
	}
	
	// Method to delete file
	public boolean deleteFileIfExists(String fileName) {
		
		boolean status = false;
		
		try {
			myFile = new File(fileName);
			if(myFile.exists()) {
				status = myFile.delete();
				System.out.println("Deleting " + fileName);
				if(status == true) {
					System.out.println("Delete successful!");
					return status;
				}
				else {
					System.out.println("");
				}
				return status;
			}
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		}
		return status;
	}
	
	// Method to write to the file stream
	public boolean writeFileStreams(String textToWrite, String fileName) throws IOException {
		try {
			
			// Checking to see if doesn't exist, in order to avoid FileNotFound Exception
			if(Files.notExists(Paths.get(fileName)) == true) {
				System.out.println("No file to write to, creating new file...");
				createFile(fileName);
			}
			// Read file to an byte array in order to determine if the file has any contents
			byte[] data = Files.readAllBytes(Paths.get(fileName));
			if(data.length > 0) {
				System.out.println("File already exists...appending to " + myFile);
				try {
					Files.write(Paths.get(fileName), " ! ".getBytes(), StandardOpenOption.APPEND);
				} catch (IOException e) {
					e.printStackTrace();
				}
				// Writing to a file after verifying file existence and content 
			} else {
				System.out.println("Writing to " + myFile + "...");
				try(PrintWriter pw = new PrintWriter(Files.newBufferedWriter(Paths.get(fileName)))) {
					Stream.of(textToWrite).forEach(pw::print);
				} catch(IOException ex) {
					System.out.println(ex.getMessage());
				}
				return false;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return true;
	}
	
	// Method to read from the file stream
	public boolean readFileStreams(String fileName) {
		try {
			Stream<String> str = Files.lines(Paths.get(fileName));
										 
			for(String line : str.collect(Collectors.toList())) {
				System.out.println("File contents of " + FileSystems.getDefault().getPath(fileName).toAbsolutePath()
									+ " is: " + line);
			}
			str.close();
 		} catch (IOException ioe) {
 			System.err.println(ioe.getMessage());
 			return false;
		}	
		return true;
	}
}
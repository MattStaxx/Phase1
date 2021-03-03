package virtualkey.screens;

import virtualkey.entities.WorkingDirectory;

public class DisplayFiles {

	WorkingDirectory wd = new WorkingDirectory();
	
	// display() method facilitates output of the list of files at several different points in the application 
	public void display() {
		
		System.out.println("\nContents of pwd:");
		wd.retrieveFiles();
	}
}

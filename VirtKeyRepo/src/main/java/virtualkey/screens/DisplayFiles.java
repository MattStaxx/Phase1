package virtualkey.screens;

import virtualkey.entities.WorkingDirectory;

public class DisplayFiles {

	WorkingDirectory wd = new WorkingDirectory();
	
	public void display() { // omit directory structure from output
		
		System.out.println("\nContents of pwd:");
		wd.retrieveFiles();
	}
}

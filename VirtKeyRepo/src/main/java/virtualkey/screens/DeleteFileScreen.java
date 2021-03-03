package virtualkey.screens;

import java.util.ArrayList;

import virtualkey.entities.FileBuild;
import virtualkey.userinput.UserInput;

public class DeleteFileScreen implements Screen {
	
	FileBuild fb = new FileBuild();
	DisplayFiles dis = new DisplayFiles();
	private ArrayList<String> options = new ArrayList<String>();
	FileManagementScreen fms = new FileManagementScreen();
	UserInput ui = new UserInput();

	// Constructor that adds String elements to an ArrayList, these elements each represent an application functionality
    // an ArrayList is used here for scalability and ease of code management, if application options were to change.
	// the clear() method empties the ArrayList so that when called multiple times, the List will always contain only one 
	// set of options
	public DeleteFileScreen() {

		options.clear();
		options.add("1. Delete a File");
		options.add("2. Return to main menu");
	}

	// Method to be used with the Screen interface, and provide DeleteFileScreen-unique prompt dialogue.
	@Override
	public void show() {
		
		System.out.println("\n--Delete File Menu--\n");
    	dis.display();
    	System.out.println("\nSelect an option from the choices below...");
    	options.forEach(System.out::println);
	}

	// activate() method "resets" the deleteFileNavi() selection loop without ending the loop, 
    // as well as refreshes the relevant screen header.
	public void activate() {

		show();
		deleteFileNavi(ui.getUserInput());
	}

	// deleteFileNavi() method to run a switch statement used to determine what actions to take based on user input
	public void deleteFileNavi(int option) {
		
		switch(option) {
		case 1: // Option to confirm delete file selection
			fb.deleteFile();
			activate();
			break;
		case 2: //  Option return to main menu
			System.out.println("Returning to menu...");
			fms.activate();
			break;
		default: // Functionality to maintain the loop if unexpected user-entry occurs
			System.out.println("Invalid Option...");
			activate();
			break;
		}
	}
}
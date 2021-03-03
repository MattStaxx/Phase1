package virtualkey.screens;

import java.util.ArrayList;

import virtualkey.userinput.UserInput;

public class FileManagementScreen implements Screen {

	UserInput ui = new UserInput();
    private ArrayList<String> options = new ArrayList<String>();

    // Constructor that adds String elements to an ArrayList, these elements each represent an application functionality
    // an ArrayList is used here for scalability and ease of code management, if application options were to change.
	public FileManagementScreen() {
    	
        options.add("1. Display Files");
        options.add("2. Add a File");
        options.add("3. Delete a File");
        options.add("4. Search a File");
        options.add("5. Quit");
    }

	// Method to be used with the Screen interface, and provide FileManagementScreen-unique prompt dialogue.
    @Override
    public void show() {
    	
    	System.out.println("\n--Main Menu--\n");
        for (String s : options)  {
            System.out.println(s);
        }
    }

    // activate() method "resets" the navigationOption selection loop without ending the loop.
	public void activate() {

		show();
		navigateOption(ui.getUserInput());
	}

	// navigateOption() method to run a switch statement used to determine what actions to take based on user input
    public void navigateOption(int option) {

    	AddFileScreen afs = new AddFileScreen();
    	DeleteFileScreen dfs = new DeleteFileScreen();
    	SearchFileScreen sfs = new SearchFileScreen();
    	DisplayFiles dis = new DisplayFiles();
    	
		switch(option) {
        	case 1: // Option to select "list" files functionality
        		dis.display();
        		activate();
        		break;
        	case 2: // Option to select "add" file functionality
        		afs.activate();
        		break;
        	case 3: // Option to select "delete" file functionality
        		dfs.activate();
        		break;
        	case 4: // Option to select "search" file functionality
        		sfs.activate();
        		break;
        	case 5: // Option to select "quit" application functionality
        		System.out.println("Quitting file management...");
        		break;
        	default: // Functionality to maintain the loop if unexpected user-entry occurs
        		System.out.println("Invalid Option");
        		activate();
        		break;
		}
    }
}
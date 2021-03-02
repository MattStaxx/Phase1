package virtualkey.screens;

import java.util.ArrayList;

import virtualkey.userinput.UserInput;

public class FileManagementScreen implements Screen { // removed extends UserInput

	UserInput ui = new UserInput();
    private ArrayList<String> options = new ArrayList<String>();

	public FileManagementScreen() {
    	
        options.add("1. Display Files");
        options.add("2. Add a File");
        options.add("3. Delete a File");
        options.add("4. Search a File");
        options.add("5. Quit");
    }

    @Override
    public void show() {
    	
    	System.out.println("\n--Main Menu--\n");
        for (String s : options)  {
            System.out.println(s);
        }
    }

	public void activate() {

		show();
		navigateOption(ui.getUserInput());
	}

    public void navigateOption(int option) {

    	AddFileScreen afs = new AddFileScreen();
    	DeleteFileScreen dfs = new DeleteFileScreen();
    	SearchFileScreen sfs = new SearchFileScreen();
    	DisplayFiles dis = new DisplayFiles();
    	
		switch(option) {
        	case 1:
        		dis.display();
        		activate();
        		break;
        	case 2:
        		afs.activate();
        		break;
        	case 3:
        		dfs.activate();
        		break;
        	case 4:
        		sfs.activate();
        		break;
        	case 5:
        		System.out.println("Quitting file management...");
        		break;
        	default:
        		System.out.println("Invalid Option");
        		activate();
        		break;
		}
    }
}
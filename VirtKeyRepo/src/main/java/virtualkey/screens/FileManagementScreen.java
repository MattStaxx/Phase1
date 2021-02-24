package virtualkey.screens;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import virtualkey.entities.Files;

public class FileManagementScreen implements Screen {

	int selectedOption;
    private static final int QUIT = 5;
    private ArrayList<String> options = new ArrayList<String>();

	public FileManagementScreen() {
    	
        options.add("1. Add a File");
        options.add("2. Delete a File");
        options.add("3. Search a File");
        options.add("4. Display Files");
        options.add("5. Quit");
    }

    @Override
    public void show() {
    	
        for (String s : options)  {
            System.out.println(s);
        }
    }
    
    public void getUserInput() {
    	
        while((selectedOption = this.getOption()) != QUIT) {
            this.navigateOption(selectedOption);
        }
    }

    private int getOption() {

        int returnOption = 0;
        Scanner in = new Scanner(System.in);

        show();
        try {
            returnOption = in.nextInt();
        } catch(InputMismatchException ex) {
        	}
        return returnOption;
    }
    
    public void navigateOption(int option) {

    	Files f = new Files();
    	AddFileScreen afs = new AddFileScreen();
    	DeleteFileScreen dfs = new DeleteFileScreen();
    	SearchFileScreen sfs = new SearchFileScreen(f.getFileList());
    	
        switch(option) {
            case 1:
                afs.getUserInput();
                break;
            case 2:
                dfs.getUserInput();
                break;
            case 3:
            	sfs.getUserInput();
            	break;
            case 4:
            	System.out.println(f.getFileList());
            	break;
            case 5:
            	System.out.println("Quitting file management...");
            	selectedOption = 5;
            	break;
            default:
                System.out.println("Invalid Option");
                break;
        }
    }
}

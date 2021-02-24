package virtualkey.screens;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import virtualkey.entities.Files;

public class AddFileScreen implements Screen {

    int selectedOption;
    private static final int QUIT = 2;
	static Files f = new Files();
	private static ArrayList<String> files = f.getFileList();
	private static ArrayList<String> options = new ArrayList<String>();
	Scanner in = new Scanner(System.in);

	public AddFileScreen() {
		
		options.add("1. Add File");
		options.add("2. Return to main menu");
	}
    @Override
    public void show() {
    	
    	System.out.println("Files listed below:");
		for(String x : files) {
    			System.out.println(x);
		}
    	System.out.println("\nSelect an option from the choices below...");
    	for(String x : options) {
        	System.out.println(x);
    	}
    }
    
	public void addFile() {

		f.buildFile();
    }
	
	public void getUserInput() {
        
        while((selectedOption = this.getOption()) != QUIT) {
            this.addFileNavi(selectedOption);
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

	public void addFileNavi(int option) {
		
		switch(option) {
		case 1:
			addFile();
			break;
		case 2:
			System.out.println("Returning to menu...");
			selectedOption = QUIT;
		default:
			System.out.println("Invalid Option...");
		}
	}
}

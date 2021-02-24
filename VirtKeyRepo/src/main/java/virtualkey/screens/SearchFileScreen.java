package virtualkey.screens;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import virtualkey.entities.Files;

public class SearchFileScreen implements Screen {

	String file;
	private int selectedOption;
	private static final int QUIT = 2;
	private static ArrayList<String> fileList = new ArrayList<String>();
	Files f = new Files();
	Scanner in = new Scanner(System.in);
	
	public SearchFileScreen(ArrayList<String> list) {
		
		SearchFileScreen.fileList = list;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
	public String searchFile(ArrayList<String> list) {
		
		System.out.println("Enter file name to search for >> ");
		file = in.nextLine();
		if(fileList.contains(file)) {
			System.out.println(file + " found.");
		} else {
			System.out.println(file + " not found.");
		}
		return file;
	}
	public void getUserInput() {
        
        while((selectedOption = this.getOption()) != QUIT) {
            this.searchFileNavi(selectedOption);
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

	public void searchFileNavi(int option) {
		
		switch(option) {
		case 1:
			searchFile(f.getFileList());
			break;
		case 2:
			System.out.println("Returning to menu...");
			selectedOption = QUIT;
		default:
			System.out.println("Invalid Option...");
		}
	}
}

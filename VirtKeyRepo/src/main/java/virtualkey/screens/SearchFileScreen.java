package virtualkey.screens;

import java.util.ArrayList;
import virtualkey.entities.Files;
import virtualkey.userinput.UserInput;

public class SearchFileScreen implements Screen {
	
	static Files f = new Files();
	private static ArrayList<String> files = f.getFileList();
	private static ArrayList<String> options = new ArrayList<String>();

	UserInput ui = new UserInput();
	FileManagementScreen fms = new FileManagementScreen();
	
	public SearchFileScreen() {
		
		options.add("1. Search a File");
		options.add("2. Return to main menu");
	}

	@Override
	public void show() {
		// TODO: configure to use DisplayFiles class
		System.out.println("\n--Search File Menu--\n");
    	System.out.println("Current files listed below:");
    	files.sort(String.CASE_INSENSITIVE_ORDER);
    	files.forEach(System.out::println);
    	System.out.println("\nSelect an option from the choices below...");
    	options.forEach(System.out::println);
	}

	public void activate() {

		show();
		searchFileNavi(ui.getUserInput());
	}
	
	public void searchFile() {
		
		f.searchFile();
	}

	public void searchFileNavi(int option) {
		
		switch(option) {
		case 1:
			searchFile();
			activate();
			break;
		case 2:
			System.out.println("Returning to menu...");
			fms.activate();
			break;
		default:
			System.out.println("Invalid Option...");
			activate();
			break;
		}
	}
}
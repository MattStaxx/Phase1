package virtualkey.screens;

import java.util.ArrayList;
import virtualkey.entities.FileBuild;
import virtualkey.userinput.UserInput;

public class SearchFileScreen implements Screen {
	
	FileBuild fb = new FileBuild();
	DisplayFiles dis = new DisplayFiles();
	UserInput ui = new UserInput();
	FileManagementScreen fms = new FileManagementScreen();
	private static ArrayList<String> options = new ArrayList<String>();

	public SearchFileScreen() {
		
		options.clear();
		options.add("1. Search a File");
		options.add("2. Return to main menu");
	}

	@Override
	public void show() {

		System.out.println("\n--Search File Menu--\n");
    	dis.display();
    	System.out.println("\nSelect an option from the choices below...");
    	options.forEach(System.out::println);
	}

	public void activate() {

		show();
		searchFileNavi(ui.getUserInput());
	}

	public void searchFileNavi(int option) {
		
		switch(option) {
		case 1:
			fb.searchFile();
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
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

	public DeleteFileScreen() {

		options.clear();
		options.add("1. Delete a File");
		options.add("2. Return to main menu");
	}

	@Override
	public void show() {
		
		System.out.println("\n--Delete File Menu--\n");
    	dis.display();
    	System.out.println("\nSelect an option from the choices below...");
    	options.forEach(System.out::println);
	}
	
	public void activate() {

		show();
		deleteFileNavi(ui.getUserInput());
	}

	public void deleteFileNavi(int option) {
		
		switch(option) {
		case 1:
			fb.deleteFile();
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
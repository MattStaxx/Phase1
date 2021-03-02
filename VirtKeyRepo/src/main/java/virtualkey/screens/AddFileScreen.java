package virtualkey.screens;

import java.util.ArrayList;

import virtualkey.entities.FileBuild;
import virtualkey.userinput.UserInput;

public class AddFileScreen implements Screen {
    
	FileBuild fb = new FileBuild();
	DisplayFiles dis = new DisplayFiles();
	private ArrayList<String> options = new ArrayList<String>();
	FileManagementScreen fms = new FileManagementScreen();
	UserInput ui = new UserInput();

	public AddFileScreen() {

		options.clear();
		options.add("1. Add File");
		options.add("2. Return to main menu");
	}
	
    @Override
    public void show() {
    	
    	System.out.println("\n--Add File Menu--\n");
    	dis.display();
    	System.out.println("\nSelect an option from the choices below...");
    	options.forEach(System.out::println);
    }

	public void activate() {

		show();
		addFileNavi(ui.getUserInput());
	}
	
	public void addFileNavi(int option) {
		
		switch(option) {
		case 1:
			fb.buildFile();
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
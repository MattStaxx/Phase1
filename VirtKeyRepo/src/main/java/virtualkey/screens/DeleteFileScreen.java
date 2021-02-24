package virtualkey.screens;

import java.util.ArrayList;
import virtualkey.entities.Files;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DeleteFileScreen implements Screen {

	private int selectedOption;
	private static final int QUIT = 2;
	Files f = new Files();
	ArrayList<String> fileList = new ArrayList<String>();

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
	public void deleteFile() {
		
		fileList = f.getFileList();
		fileList.clear();
		System.out.println("Deleted List" + f.getFileList());
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
			deleteFile();
			break;
		case 2:
			System.out.println("Returning to menu...");
			selectedOption = QUIT;
		default:
			System.out.println("Invalid Option...");
		}
	}
}

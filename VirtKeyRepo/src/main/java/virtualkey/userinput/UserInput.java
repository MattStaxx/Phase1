package virtualkey.userinput;

import java.util.InputMismatchException;
import java.util.Scanner;

// This class facilitates user entry in the various navigation contexts
public class UserInput {

	private int navigateOption;
	private String userFile;

	public int getUserInput() {
        
        navigateOption = getOption();
		return navigateOption;
    }
    
	private int getOption() {

		int returnOption = 0;
		Scanner in = new Scanner(System.in);
		try {
			System.out.print("Enter your choice >> ");
			returnOption = in.nextInt();
		} catch(InputMismatchException ex) {
    		}
		return returnOption;
	}

	public String getUserFile() {
		
		userFile = getFileInput();
		return userFile;
	}
	
	public String getFileInput() {

		String fileIn = "";
		Scanner in = new Scanner(System.in);
		try {
			fileIn = in.nextLine();
		} catch(InputMismatchException ex) {
    		}
		return fileIn;
	}
}
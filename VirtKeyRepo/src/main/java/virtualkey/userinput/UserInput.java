package virtualkey.userinput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {

	private int navigateOption;

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
}
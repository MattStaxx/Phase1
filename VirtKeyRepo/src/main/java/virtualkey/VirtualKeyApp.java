package virtualkey;

import virtualkey.screens.FileManagementScreen;
import virtualkey.screens.WelcomeScreen;

public class VirtualKeyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WelcomeScreen ws = new WelcomeScreen();
		ws.show();
		FileManagementScreen fms = new FileManagementScreen();
		fms.getUserInput();
		
		
	}
}

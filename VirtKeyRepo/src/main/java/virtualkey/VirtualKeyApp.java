package virtualkey;

import virtualkey.screens.FileManagementScreen;
import virtualkey.screens.WelcomeScreen;

public class VirtualKeyApp {

	static WelcomeScreen ws = new WelcomeScreen();
	static FileManagementScreen fms = new FileManagementScreen();
	
	public static void main(String[] args) {

		ws.show();
		fms.activate();
	}
}
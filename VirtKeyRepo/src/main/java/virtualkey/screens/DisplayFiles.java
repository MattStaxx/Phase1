package virtualkey.screens;

import java.util.ArrayList;

import virtualkey.entities.Files;

public class DisplayFiles {

	Files f = new Files();
	ArrayList<String> fileList = f.getFileList();
	
	public void display() {
		// TODO: display formatting
		fileList.forEach(System.out::println);
	}
}

package virtualkey.entities;

import java.util.ArrayList;
import java.util.Scanner;

public class Files {

	private String file;
	private static ArrayList<String> fileList = new ArrayList<String>();
    Scanner in = new Scanner(System.in);

    public Files() {
    	
    }
    public Files(ArrayList<String> fileList) {
    	
    	Files.fileList = fileList;
    }
    
	public ArrayList<String> getFileList() {
		
		return fileList;
	}

	public void buildFile() {

		System.out.print("Enter file name to add >> ");
		fileList.add(getInputString());
        System.out.println("You are adding a file named: " + file);
	}
	
	public String getInputString() {
		
		file = in.nextLine();
        return (file);
    }
}

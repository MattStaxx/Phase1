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

	public String getInputString() {
		
		file = in.nextLine();
        return (file);
    }
	
	public ArrayList<String> getFileList() {
		
		return fileList;
	}

	public void buildFile() {

		System.out.print("Enter file name to add >> ");
		fileList.add(getInputString());
        System.out.println("You are adding a file named: " + file);
	}
	
	public void deleteFile() {
		//TODO: display formatting
		fileList = getFileList();
		fileList.clear();
		System.out.println("Deleted List" + getFileList());
	}
	
	public void searchFile() {
		//TODO: display formatting
		System.out.println("Enter file name to search for >> ");
		String file = getInputString();
		if(fileList.contains(file)) {
			System.out.println(file + " found.");
		} else {
			System.out.println(file + " not found.");
		}
	}
}
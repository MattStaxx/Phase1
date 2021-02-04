package com.emailvalidate;

import java.util.ArrayList;
//import java.util.Scanner;

public class EmailSearch {
	
	// array "mock database" of email IDs
	ArrayList<String> em = new ArrayList<String>();

	public void setEm(ArrayList<String> e) {
		em = e;
	}

	public ArrayList<String> getEm() {
		return em;
	}
	
	// comparing user input to each array element for a match
	public boolean searchEmail(String emailToSearch) {
		for(String email : em) {
			if(email.equals(emailToSearch)) {
				return true;
			}
		}
		return false;
	}
	
	// display the email array for user
	public void displayEmails() {
		System.out.print("");
		for(int x = 0; x < em.size(); x++)
			System.out.println(em.get(x));
	}
}

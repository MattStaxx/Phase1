package com.emailvalidate;

public class EmailSearch {
	
	// array "mock database" of email IDs
	String[] emails = {"aragorn@strider.net", "gandalf96@gmail.com", "frodo.baggins@hotmail.com", 
						"le9olas@rivendell.rd", "saruman.theWhite@meMail.me" };
	
	// comparing user input to each array element for a match
	public boolean searchEmail(String emailToSearch) {
		
		for(String email : emails) {
			if(email.equals(emailToSearch)) {
				return true;
			}
		}
		return false;
	}
	
	// display the email array for user
	public void displayEmails() {
		for(int x = 0; x < emails.length; x++)
			System.out.println(emails[x]);
	}
}

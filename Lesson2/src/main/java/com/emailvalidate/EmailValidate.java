package com.emailvalidate;

import java.util.ArrayList;
import java.util.Scanner;

public class EmailValidate {

	public static void main(String[] args) {
		
		// variables and objects
		String em;
		final int YES = 1;
		final int LIST_SIZE = 1;
		EmailSearch emSear = new EmailSearch();
		EmailValidator emVali = new EmailValidator();
		ArrayList<String> al = new ArrayList<String>();
		Scanner in = new Scanner(System.in);

		// populate initial and display ArrayList of email IDs
		System.out.println("The list of email IDs: ");
		System.out.println();
		al.add("aragorn@strider.net");
		al.add("gandalf96@gmail.com");
		al.add("frodo.baggins@hotmail.com");
		al.add("le9olas@rivendell.rd");
		al.add("saruman.theWhite@meMail.me");
		emSear.setEm(al);
		emSear.displayEmails();
		
		// present user with input function and send that input to search and validate methods
		for(int x = 0; x < LIST_SIZE; x++) {
			System.out.print("\nEnter your ID to check it against the list >> ");
			em = in.nextLine();
			emSear.searchEmail(em);
			System.out.println();
			System.out.println(emSear.searchEmail(em) ? em + " << was found on the list! " : em + " << that email ID was not found on the list!");
			System.out.print(emVali.validate(em) ?  em + " << is a Valid ID format\n" : em + " << is not a Valid ID format\n");

			// provide user ability to add validated ID to the list of IDs
			if(emVali.validate(em) == true && !emSear.searchEmail(em)) {
				System.out.print("\nWould you like to add that ID to the list? ENTER 1 to add to the list >> ");
				if(in.nextInt() == YES) {
					in.nextLine();
					al.add(em);
					emSear.setEm(al);
				}
				else {
					System.out.println("Invalid Input...try again...");
				}
			}
			// display resulting ID list
			System.out.println();
			System.out.println("...the current email list...\n");
			emSear.displayEmails();
		}
		// close scanner tool
		in.close();
	}
}

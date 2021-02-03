package com.emailvalidate;

import java.util.Scanner;

public class EmailValidate {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String email = new String();
		EmailSearch emSear = new EmailSearch();
		EmailValidator emVali = new EmailValidator();

		System.out.println("The list of email IDs: ");
		emSear.displayEmails();
		
		System.out.print("\nEnter your ID to check it against the list >> ");
		email = in.nextLine();
		emSear.searchEmail(email);
		System.out.print(emSear.searchEmail(email) ? "Found it!\n" : "Email ID not found!\n");
		System.out.print(email);
		System.out.println(emVali.validate(email) ?  " is a Valid ID format" : " is not a Valid ID format");

		in.close();
	}
}

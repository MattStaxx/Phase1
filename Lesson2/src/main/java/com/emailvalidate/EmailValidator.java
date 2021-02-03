package com.emailvalidate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
	
	// regular expression to determine validity of email format
	final String regex = "\\w+\\@\\w+\\.\\w+";
	final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
	
	// validate that user input is a valid email format
	public boolean validate (String stringToValidate) {
		Matcher matcher = pattern.matcher(stringToValidate);
		return matcher.find();
	}
}

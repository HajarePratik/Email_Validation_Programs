package com.bridgelabz.email_programs;
import java.util.regex.Pattern;


public class EmailProgram 
{

	// this method for uc2 test case 
	public boolean validedemail(String email) 
	{
		return Pattern.matches("^@[a-zA-Z0-9.]+$", email);
	}
			

}

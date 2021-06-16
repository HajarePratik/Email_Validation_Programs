package com.bridgelabz.email_programs;
import java.util.regex.Pattern;


public class EmailProgram 
{

	// this method for uc3 test case 
	public boolean validedemail(String email) 
	{
		return Pattern.matches("^([.a-zA-Z]{2,4})$", email);
	}
			

}

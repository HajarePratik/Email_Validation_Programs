package com.bridgelabz.email_programs;

import static org.junit.Assert.*;

import org.junit.Test;


public class EmailProgramTest {

	
	// UC2 To check email is valid or not
	@Test
	public void EmailValidationItShouldReturnValidOrNot()
	{
		EmailProgram email = new EmailProgram();
		assertTrue(email.validedemail("@bridgelabz."));
		assertTrue(email.validedemail("@bridgelabz"));
		assertTrue(email.validedemail("@bridgelabz123"));
		assertTrue(email.validedemail("@123bridgelabz"));
	}
	
	
}

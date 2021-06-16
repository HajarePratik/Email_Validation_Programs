package com.bridgelabz.email_programs;

import static org.junit.Assert.*;

import org.junit.Test;


public class EmailProgramTest {

	
	// UC3 To check email is valid or not.
	@Test
	public void EmailValidationItShouldReturnValidOrNot()
	{
		EmailProgram email = new EmailProgram();
		assertTrue(email.validedemail(".co"));
		assertTrue(email.validedemail(".in"));
		assertTrue(email.validedemail(".com"));
	}
	
	
}

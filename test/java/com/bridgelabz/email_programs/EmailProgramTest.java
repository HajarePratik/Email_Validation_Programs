package com.bridgelabz.email_programs;

import static org.junit.Assert.*;

import org.junit.Test;


public class EmailProgramTest {

	
	// UC4 To check email is valid or not
	@Test
	public void EmailValidationItShouldReturnValidOrNot()
	{
		EmailProgram email = new EmailProgram();
		assertTrue(email.validedemail("abc.xyz"));
		assertTrue(email.validedemail("pratik.in"));
		assertTrue(email.validedemail("a.com"));
	}
	
	
}

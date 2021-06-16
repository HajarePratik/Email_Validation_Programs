package com.bridgelabz.email_programs;

import static org.junit.Assert.*;

import org.junit.Test;


public class EmailProgramTest {

	
	// UC1 To check email is valid or not
	@Test
	public void EmailValidationItShouldReturnValidOrNot()
	{
		EmailProgram email = new EmailProgram();
		assertTrue(email.validedemail("abc.123"));
		assertTrue(email.validedemail("pratik.0907"));
	}
	
	
}

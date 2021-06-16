package com.bridgelabz.email_programs;

import static org.junit.Assert.*;

import org.junit.Test;


public class EmailProgramTest {

	
	// UC5 To check email is valid or not
	@Test
	public void EmailValidationItShouldReturnValidOrNot()
	{
		EmailProgram email = new EmailProgram();
		assertTrue(email.validedemail("abc.xyz@bridgelabz.co.in"));
		assertTrue(email.validedemail("pratik.0907@bridgelabz.co"));
		assertTrue(email.validedemail("pratik@bridgelabz.co.in"));
	}
	
	
}

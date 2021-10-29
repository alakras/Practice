package chap11_Introducing_Exception;

import static org.junit.Assert.assertEquals;

import org.junit.Assert.*;

import org.junit.Test;

/* you can not put code between try, catch and finally blocks as these three blocks form one unit
 * you can have multiple catch blocks for a try block but its obvisious that only one catch block will get executed
 * */


public class ExceptionsExampleTest {

	@Test
	public void throwNullPointerException() {
		Integer age = null;
		String ageAsString;

		try {
			ageAsString = age.toString();

		} catch (NullPointerException e) {
			age = 18;
			ageAsString = age.toString();
		}
		String yourAge = "You are " + ageAsString + " years old";
		assertEquals("You are 18 years old", yourAge);
	}

}

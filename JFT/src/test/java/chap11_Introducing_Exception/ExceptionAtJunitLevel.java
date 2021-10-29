package chap11_Introducing_Exception;

import static org.junit.Assert.assertEquals;

import org.junit.Assert.*;
/* we can tell @Test annotation to except an exception of a particular class to be thrown
 * here if an mentioned exception class is thrown thrown then test methods is passed
 * if exception is not thrown then test case fails
 * we need to be very careful while using this method as exception can be thrown because of any line in method, may be sometime by the line from which you least expect 
 */
import org.junit.Test;

public class ExceptionAtJunitLevel {

	@Test(expected = NullPointerException.class)

	public void nullPointerExceptionExpected() {
		Integer age = null;
		age.toString();

	}

}

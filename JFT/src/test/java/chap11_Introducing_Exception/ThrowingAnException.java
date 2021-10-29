package chap11_Introducing_Exception;

import static org.junit.Assert.assertEquals;

import org.junit.Assert.*;

import org.junit.Test;


/*we throw exception purposefully so that person who is using our code can avoid or handle it, in below example person using this method
 * should either ensure that he has avoided to have i < 7 or he can catch the exception and deal with it
 * 
 *  Mostly i think we will not be required to throw the exception while dealing with automation code, i think we would be required to
 * catch the exception thrown by webdriver, the exceptions like NoElementFoundException etc
 * from java for tester book : Throwing exceptions in your abstraction layers is a useful way to keep the code simple
and clean, and help avoid making simple errors in your @Test methods.
 * so it is evident from above statement that we will never be required to throw the exception in our 'test' code. It can be there in 
 * our abstraction layer, which will help the person who is using that abstraction layer and if the condition occurs to throw that exception
 * then it will be helpful to him to debug the code
 * 
 * If you see below here we can use instances of any checked exception (either IllegalArgument or NullPointer) and it will work
 * In book also it is written (in next chapter-13 that writer has to rarerly needed to define his own exception
 */

public class ThrowingAnException {
	@Test
	
	public void throwexception() {
		int i = 6;
		if (i<8) {
		//throw new NullPointerException("value of i should be greater than 7");
		throw new IllegalArgumentException("value of i should be greater than 7");
		}
	}
	
}

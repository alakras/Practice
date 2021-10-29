package chap13_MoreOnException;

import org.junit.Test;

/*
 * so far whatever exceptions we saw 'NullPointer','IllegelArgument' or 'ElementNotFound' all these are unchecked exception.
 *  * An Unchecked exception is one that can be thrown, by a method, without having to
declare that the exception will be thrown
checked exception are the one which has to be declared as as in below test 'cE' we had to declare that 'throws SetPassword' where as
you might have observed that in unchecked excption like 'NullPointer' we don't need to declare it
try changing value we passed to pwd() from 6 to 9.. it will not throw the exception
observe two keywords that we used throw and throws
 */
public class checkedException {

	public static void pwd(int i) throws SetPassword {
		
		if (i<8) 
			throw new SetPassword("sdfdf");
		
	}


@Test

public void cE() throws SetPassword{
		pwd(6);
		
	}
}


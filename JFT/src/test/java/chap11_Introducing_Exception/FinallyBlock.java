package chap11_Introducing_Exception;
import static org.junit.Assert.assertEquals;
import org.junit.Assert.*;
import org.junit.Test;

public class FinallyBlock {

	@Test
	/* Finally block will get executed compulsarily either exceptions occurs in try block or not, its going to get executed
	 * check it by commenting line of 14 and 15 where i is assigned to null and 10
	 * remember that as per book, finally is used to when we want to rethrow the exception (in catch block) but before loosing the control
	 * we want to execute code in finally block ( to tidy up resources) check the example given in book on page number,  
	 *  */
	public void finallyBlock() {
		
	Integer i = null;
		//Integer i = 10;
		try {
					
			i.toString();
			
		}
	catch(NullPointerException e) {
		System.out.println("Exception has occured in try block");
					
	}
		finally{
			System.out.println("This line is geting prineted before lossing control becasue of exception in try block or there is no exeption");
		}
	}
	
	
	
}

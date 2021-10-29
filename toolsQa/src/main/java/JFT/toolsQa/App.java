package JFT.toolsQa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 

/**
 * Hello world!
 *
 */
public class App 
{
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\JavaForTester\\toolsQa\\chromedriver.exe") ;
	static WebDriver driver = new ChromeDriver();
	
	
    public static void main( String[] args )
    {
    	//System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\JavaForTester\\toolsQa\\chromedriver.exe") ;
    	
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\jgm\\lakras\\chromedriver.exe") ;
    	driver.get("http://www.google.com");
    }
}

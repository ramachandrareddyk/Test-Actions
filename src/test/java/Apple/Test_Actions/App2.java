/**
 * 
 */
package Apple.Test_Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author ADMIN
 *
 */
public class App2 {
	public WebDriver driver;
	public String ExpectedTitle="Google";
	@BeforeTest
	public void setup() {
		
	ChromeOptions options= new ChromeOptions();
	
	driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.google.com");
	}
	
	@Test
	public void test1() {
		
		String Actualtitle=driver.getTitle();
		System.out.println(Actualtitle);
		Assert.assertEquals(Actualtitle, ExpectedTitle);
	}
	
	
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}
}

package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Fblogin {
	ChromeDriver driver;
	String baseurl="https://www.facebook.com";
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.getClass();
}

	@Parameters({"username","password"})
	
	@Test
	public void test( String username, String password)
	{
        driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		//System.out.println("value=" +username);
		//System.out.println("value=" +password);


	}

}

package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pagepkg.FBloginpage;


public class FBlogintest {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void test()
	{
		FBloginpage ob=new FBloginpage(driver);
		ob.setvalues("abc@gmail.com", "abc123");
		//ob.loginclick();
		ob.createclick();
		String exp="Facebook";
		String actualtitle=driver.getTitle();
		Assert.assertEquals(actualtitle,exp);
		System.out.println("test1");
		
		
		ob.signupclick();
		
	}

}

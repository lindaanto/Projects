package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {
	ChromeDriver driver;
	
	String baseurl="https://www.facebook.com";
	@Before
	public void setUp()
	{
		 driver=new ChromeDriver();
		 driver.get(baseurl);
		 
	}
	@Test
	public void test()
	{
		
		String exp="Facebook";
		String actualtitle=driver.getTitle();
		if(actualtitle.equals(exp))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
   @After
   public void tearDown()
   {
	   driver.quit();
   }
}

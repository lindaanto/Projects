package junitpkg;

import org.junit.After;
import org.junit.Before;

import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instaxpathpgm {
	ChromeDriver driver;
	String baseurl="https://www.instagram.com";
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}

	@Test
	public void instalogin() throws InterruptedException
	{
		Thread.sleep(3000);;
		driver.findElement(By.xpath("//form[@id='loginForm']/div/div[1]/div/label/input")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//form[@id='loginForm']/div/div[2]/div/label/input")).sendKeys("fgf");
		
		WebElement login=driver.findElement(By.xpath("//form[@id='loginForm']/div/div[2]/div/label/input"));
		login.sendKeys("fgf");
		login.submit();
		
	}

	 @After
	   public void tearDown()
	   {
		   driver.quit();
	   }
}

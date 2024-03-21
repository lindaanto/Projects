package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazone {
	ChromeDriver driver;
	String baseurl="https://www.amazon.in";
	@Before
	
		public void setUp()
		{
		driver=new ChromeDriver();
		driver.get(baseurl);
	    driver.manage().window().maximize();// window maximaize
		}
	@Test
	public void search()throws InterruptedException
	{
		Thread.sleep(8000);
		WebElement search=driver.findElement(By.xpath("//form[@id='nav-search-bar-form']/div[2]/div/input"));
		search.sendKeys("mobiles");//search
		search.submit();
		
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[15]")).click();
		driver.findElement(By.xpath("//div[@id='nav-tools']/a[2]/div/span")).click();
		driver.navigate().back(); //back
		driver.findElement(By.xpath("//div[@id='nav-tools']/a[4]")).click();
		driver.findElement(By.xpath("//div[@id='nav-main']/div/a/i")).click();
		
		

		
		
	}
	
@After
public void tearDown()
{
	   driver.quit();
}
    	
    	
}    	
    	
    	
    	
    	
    	
    	
    	
    	
  
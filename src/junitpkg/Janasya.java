package junitpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Janasya {
	ChromeDriver driver;
	String baseurl="https://www.janasya.com";
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		  driver.manage().window().maximize();
	}

	@Test
	public void linkcount() throws InterruptedException
	{
		Thread.sleep(3000);
		
		String exp="Bloom In Love with Janasya";
		String actualtitle=driver.getTitle();
		if(actualtitle.equals(exp))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		driver.findElement(By.xpath("//div[@id='HeaderNavigation']/nav/ul[1]/li/a")).click();
		
		driver.findElement(By.xpath("//*[@id='halo-sidebar']/div[2]/div[1]/div[1]/h3")).click();
		
		driver.findElement(By.xpath("//*[@id='halo-sidebar']/div[2]/div[1]/div[2]/div/ul/li[1]/a")).click();
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("sarees",Keys.ENTER);
		
		List <WebElement> linklist=driver.findElements(By.tagName("a"));
        System.out.println(linklist.size());
        for(WebElement ele:linklist)
         {
        	
        	String link=ele.getAttribute("href");
        	String linktext=ele.getText();
    	 System.out.println(link+ "-------------" +linktext);
    	 }
	
	}

}


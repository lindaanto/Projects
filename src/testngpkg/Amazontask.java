package testngpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazontask {
	ChromeDriver driver;
    String baseurl="https://www.amazon.in/";

@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
	driver.manage().window().maximize();
}
@Test
	public void task()
	{
	WebElement search=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
	search.sendKeys("mobile phones");
	search.submit();
	
	String exp="Amazon.in";
	String actualtitle=driver.getTitle();
	if(actualtitle.equals(exp))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
	
	  driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
	  String parentWindow =driver.getWindowHandle(); 
	  driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
	  Set<String>allWindowHandles =driver.getWindowHandles();
	  
	  for(String handle : allWindowHandles) {
		  
		  if(!handle.equalsIgnoreCase(parentWindow))
		  {
			  
			  driver.switchTo().window(handle);
			  driver.findElement(By.xpath("/html/body/div[2]/div/div[5]/div[3]/div[1]/div[3]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[37]/div[1]/span/span/span/input")).click();
		      driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[4]/div[1]/span[1]")).click();
			  driver.close();
		  
		  }
		  driver.switchTo().window(parentWindow);
	}

}
}

package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Automationtask1 {
	ChromeDriver driver;
    String baseurl="https://automationexercise.com/login";

@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
}
@Test
	public void signin()
	{
		 driver.findElement(By.name("email")).sendKeys("lindait13@gmail.com");
		driver.findElement(By.name("password")).sendKeys("hello741");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();
	String exp="https://automationexercise.com/login";
	String act=driver.getCurrentUrl();
	
	if(exp.equals(act))
		
	{
		System.out.println("url verified");
	}
	else 
	{
		System.out.println("not verified");
	}
}
}
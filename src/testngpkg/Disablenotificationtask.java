package testngpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Disablenotificationtask {
	WebDriver driver;
   
@BeforeTest
public void setup()
{
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications");
	driver=new ChromeDriver(options);
	driver.manage().window().maximize();
	
	}
@Test
	public void task()
	{
      driver.get("https://www.justdial.com/");
    }
}
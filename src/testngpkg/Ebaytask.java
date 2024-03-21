package testngpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ebaytask {
	ChromeDriver driver;
    String baseurl="https://www.ebay.com/";

@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
	}
@Test
	public void task()
	{
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // load aavn
			WebDriverWait wait=new WebDriverWait (driver,Duration.ofSeconds(30));
	WebElement 	Electronics=	driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/a"));
	Actions act=new Actions (driver);
	act.moveToElement(Electronics).perform();
	driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a")).click();


			
		}

	}
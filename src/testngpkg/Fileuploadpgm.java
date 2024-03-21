package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploadpgm {
	ChromeDriver driver;
    String baseurl="https://demo.guru99.com/test/upload/";

@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
}
@Test
public void uploadfile()
		{
			WebElement upload=driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"));
		    upload.sendKeys("C:\\Users\\PRINCE\\Desktop\\Linda\\Payment sec");
	    
	        WebElement check=driver.findElement(By.xpath("//*[@id=\"terms\"]"));
	        check.click();
	        
	        WebElement submit=driver.findElement(By.xpath("//*[@id=\"submitbutton\"]"));
	        submit.click();
	        System.out.println("File is Uploaded Successfully");
	        }
	
}
	 


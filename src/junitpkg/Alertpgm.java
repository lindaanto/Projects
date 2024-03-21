package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpgm {
	ChromeDriver driver;
	String baseurl="file:///C:/Users/PRINCE/Desktop/alert.html";
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}

	@Test
	public void alertlogin()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a=driver.switchTo().alert();		
		String alerttext=a.getText();
		//System.out.println("alerttext="+alerttext);
		a.accept();
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("anju");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("raj");
		driver.findElement(By.xpath("/html/body/input[4]")).click();
	}
	

}

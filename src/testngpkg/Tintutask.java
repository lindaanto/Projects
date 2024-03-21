package testngpkg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Tintutask {
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
		 
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
		driver.findElement(By.name("name")).sendKeys("anu");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys("annayit11@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
		driver.findElement(By.xpath("//*[@id=\"id_gender2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Welcome741");
		
		WebElement day=driver.findElement(By.xpath("//*[@id=\"days\"]"));
		Select daydetails=new Select(day);
		daydetails.selectByValue("11");
		
		WebElement month=driver.findElement(By.xpath("//*[@id=\"months\"]"));
		Select monthinfo=new Select(month);
		monthinfo.selectByValue("2");
		
		
		WebElement year=driver.findElement(By.xpath("//*[@id=\"years\"]"));
		Select yearinfo=new Select(year);
		yearinfo.selectByValue("2021");
		//driver.navigate().refresh();
		
		WebElement first=driver.findElement(By.xpath("//*[@id=\"newsletter\"]"));
		first.click();
	   
	     WebElement second=driver.findElement(By.xpath("//*[@id=\"optin\"]"));
	     second.click();
	   
		
		driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("anna");
		driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("ni");
		driver.findElement(By.xpath("//*[@id=\"company\"]")).sendKeys("cognizant");
		driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("Manyatha tech park");
		driver.findElement(By.xpath("//*[@id=\"address2\"]")).sendKeys("Bangalore");
		WebElement country=driver.findElement(By.xpath("//*[@id=\"country\"]"));
		Select countryinfo=new Select(country);
		countryinfo.selectByValue("India");
	    driver.findElement(By.xpath("//*[@id=\"state\"]")).sendKeys("Karnataka");
		driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//*[@id=\"zipcode\"]")).sendKeys("560043");
	    driver.findElement(By.xpath("//*[@id=\"mobile_number\"]")).sendKeys("7591973699");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button")).click();
	}
}



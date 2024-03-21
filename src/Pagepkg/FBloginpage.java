package Pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FBloginpage {
	WebDriver driver;
	
	By fbemail=By.id("email");
	By fbpassword=By.id("pass");
	By fblogin=By.name("login");
	By fbcreate=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	By fbsignup=By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div[2]/div/div/span/a");
	
	
	
	public FBloginpage(WebDriver driver)
	{
		this.driver=driver;
	}
   public void setvalues(String email,String password)
   {
	driver.findElement(fbemail).sendKeys(email);
	driver.findElement(fbpassword).sendKeys(password);
   }
  
   public void loginclick()
   {
	   driver.findElement(fblogin).click();
   }
   public void createclick()
   {
	   driver.findElement(fbcreate).click();
   }
   public void signupclick()
   {
	   driver.findElement(fbsignup).click();
   }
   public String titleverify()
   {
	   String actualtitle=driver.getTitle();
	   return actualtitle;
   }
   }

  
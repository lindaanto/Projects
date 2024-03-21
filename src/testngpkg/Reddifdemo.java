package testngpkg;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Reddifdemo {
	String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get(baseurl);
	}
@Test(groups= {"smoke"})
 public void titleveerification()
{
	String exp="Rediff.com";
	String actualtitle=driver.getTitle();
	if(actualtitle.equals(exp))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
}

@Test(groups= {"regression"})
public void logodispaly()
{
	boolean logo=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
	if(logo)
	{
		System.out.println("Logo is present");
	}
	else
	{
		System.out.println("Logo is not present");
	}
}
@Test(groups= {"smoke"})
public void contentverify()
{
	String src=driver.getPageSource();
	if(src.contains("Full Name"))
	{
		System.out.println("Full name label is present");
	}
	else
	{
		System.out.println("Full name label is not present");
	}
	}
@Test(groups= {"sanity"})
public void buttonenable()
{
	boolean buttonenable=driver.findElement(By.xpath("//*[@id=\"Register\"]")).isEnabled();
	if(buttonenable)
	{
		System.out.println("Create button is enabled");
	}
	else
	{
		System.out.println("Create button is not enabled");
	}
}
@Test(groups= {"sanity"})
public void buttontextverification()
{
	String buttontext=driver.findElement(By.xpath("//*[@id=\"Register\"]")).getAttribute("value");
	if(buttontext.equals("Create my account >>"))
	{
		System.out.println("PASS");
	}
	else
		System.out.println("FAIL");
}
}






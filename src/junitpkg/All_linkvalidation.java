package junitpkg;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_linkvalidation {
	
	

	String baseurl="https://www.google.com";
	ChromeDriver driver;
	@Before
	public void setUp()
	
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		
	}
	
	@Test
	public void linkvalidation()
	
	{
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println("total link count= "+li.size());
		
		for(WebElement ele:li)
		{
			String link=ele.getAttribute("href");
			verify(link);
			
		}
		
	}

	private void verify(String link) {
		try
		{
			URL u=new URL(link);
			HttpURLConnection con=(HttpURLConnection)u.openConnection();
			con.connect();
			if(con.getResponseCode()==200)
			{
				System.out.println("Responds cose is 200----Successful");
			}
			else if(con.getResponseCode()==400)
			{
				System.out.println("Responds code is 404------Broken link");
				
			}
			else
			{
				System.out.println("Not expected");
			}
		}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		
		
}
	
	



package junitpkg;

import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Test;

public class Linkvalidation {
	
	String link="https://www.google.com";
	
	@Test
	public void test()
	{
		try
		{
			URL u=new URL(link);
			HttpURLConnection con=(HttpURLConnection)u.openConnection();
			int code=con.getResponseCode();
			System.out.println(code);
			if(code==200)
			{
				System.out.println("Responds code is 200-Successful");
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
			


 
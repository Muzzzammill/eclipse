package kp_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import kp_page.kerala_test;

public class passing_values {

	WebDriver driver;
	
	@BeforeTest
	public void web()
	{
		driver = new ChromeDriver();
	}
	@BeforeMethod
	public void geturl() 
	{
		driver.get("https://keralaproperty.in/member/login/");
	}
	@Test
	public void testing1()
	
	{
		kerala_test ob =new kerala_test (driver);
		
		ob.sendvalues("muzammil", "17652d76");
		ob.loginpage();
	}
}

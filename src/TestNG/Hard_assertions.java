package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Hard_assertions {

	ChromeDriver driver;
	
	@BeforeTest
	public void test0 ()
	{
		driver = new ChromeDriver();
	}
	@BeforeMethod
	public void b ()
	{
		driver.get("https://keralaproperty.in/");
	}
	
	@Test
	public void c()
	{
		String actual = driver.getTitle();
		String expected = "www.facebook.com";
		
		
		Assert.assertEquals(actual, expected,"title verified");
		System.out.println("title");
	}
	
	@Test
	public void test1()
	{
		WebElement mi = driver.findElement(By.xpath(" /html/body/div[3]/div/div/div/div[1]/form/div/input[2]"));
		boolean searchenable = mi.isEnabled();
		Assert.assertTrue(searchenable, "it is not enabled");
	}
	
}

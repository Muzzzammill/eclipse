package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {
ChromeDriver driver;

@BeforeTest
public void a()
{
	driver = new ChromeDriver();
}
@BeforeMethod
public void b()
{
	driver.get(" https://keralaproperty.in/");
}
@Test
public void c()
{
	 SoftAssert soft = new SoftAssert();
	 String title = driver.getTitle();
	 
	 soft.assertEquals (title, "google","title is not matching");
	 
	 soft.assertTrue(driver.findElement(By.xpath("/html/body/header/div[1]/div/a[1]")).isDisplayed(),"login button not displayed");
	 System.out.println("test execution continues");
	 soft.assertAll();
}
}


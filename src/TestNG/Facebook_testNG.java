package TestNG;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Facebook_testNG {
	
	ChromeDriver driver;
@BeforeTest
public void a()
{
 driver=new ChromeDriver();
}
@BeforeMethod
public void b() 
{
	driver.get("https://www.facebook.com/");
	
}
@Test
public void screeshot()
{
File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

}
@Test
public void title()
{
	
}
@Test
public void links()
{
	
}
}

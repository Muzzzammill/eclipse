package TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Disable_notifications {

	ChromeDriver driver;
	
	@BeforeTest
	public void a ()
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver =new ChromeDriver(option);
	}
	
	@BeforeMethod
	public void b()
	{
	driver.get("https://www.justdial.com/");
}
	@Test
	public void c()
	{
		
	}
}

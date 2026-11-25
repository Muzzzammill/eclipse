package Junitfirst;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	ChromeDriver driver;
	
	@Before
	public void a()
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//input[@name='ulogin']")).sendKeys("muzammil",Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='upass']")).sendKeys("12345",Keys.ENTER);
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}
}

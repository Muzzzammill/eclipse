package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rightclick {
	ChromeDriver driver;
	
	@BeforeTest
	public void a ()
	{
		driver = new ChromeDriver();
	}
	@BeforeMethod
	public void b ()
	{
		driver.get(" https://demo.guru99.com/test/simple_context_menu.html");
	}
	
	@Test
public void c()
{
	WebElement a = driver.findElement(By.xpath("/html/body/span"));
	Actions act =new Actions(driver);
	act.contextClick(a);
	act.perform();
	driver.findElement(By.xpath("/html/body/ul/li[1]")).click();
	driver.switchTo().alert().accept();
	
	WebElement b = driver.findElement(By.xpath("/html/body/button"));
	Actions axe = new Actions(driver);
	axe.doubleClick(b);
	axe.perform();
	driver.switchTo().alert().accept();
	
}
	
	
}

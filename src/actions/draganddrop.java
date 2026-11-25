package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class draganddrop {

	ChromeDriver driver;
	
	@BeforeTest
	public void a() 
	{
		driver= new ChromeDriver();	
	}
	
	@BeforeMethod
	public void b()
	{
		driver.get("https://webdriveruniversity.com/Actions/index.html");
	}
	
	@Test
	public void c()
	{
		WebElement m = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]"));
		WebElement u= driver.findElement(By.xpath(" /html/body/div/div[2]/div/div[2]"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(m, u);
		act.perform();
		
		
		String actual =driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/p")).getText();
		String expected ="Dropped!";	
		
		
		if (actual.equalsIgnoreCase(expected))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
}

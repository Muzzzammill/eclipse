package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class mousehover {

	ChromeDriver driver;
	
	@BeforeTest
	public void a () 
	{
		driver = new ChromeDriver ();
	}
	@BeforeMethod
	public void b ()
	{
		driver.manage().window().maximize();
		driver.get(" https://www.ebay.com/");
		driver.navigate().to(" https://www.ebay.com/ ");
	}
	
	@Test
	public void c () 
	{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement mouse = driver.findElement(By.xpath(" /html/body/main/div[1]/div/div[1]/div/div/ul/li[4]/a")); 
		Actions act =new Actions(driver);
		act.moveToElement(mouse).perform();        /// to bring mouse to the particular element
		
		
//  	WebDriverWait wait  = new WebDriverWait(driver,Duration.ofSeconds(30));
//		wait.until(ExpectedCondition.visibilityOfElementLocated(By.xpath(" /html/body/main/div[1]/div/div[1]/div/div/ul/li[4]/div[2]/div[1]/nav[1]/ul/li[1]/a")));
		 /// explicit wait
		
		 
	driver.findElement(By.xpath(" /html/body/main/div[1]/div/div[1]/div/div/ul/li[4]/div[2]/div[1]/nav[1]/ul/li[1]/a")).click();  
		
	}
}

package task;

import java.io.File;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class task1 {

	WebDriver driver;
	
	@BeforeTest
	public void driver()
	{
		driver = new ChromeDriver();
		
	}

	@BeforeMethod
	public void geturl()
	{
		driver.get("https://rishiherbalindia.linker.store/");
	}

	@Test
	public void start() throws Exception
	{
		driver.manage().window().maximize();
		//title verification
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[2]/a")).click();
		String actualtitle=driver.getTitle();
		String expectedtitle="Herbal Products | Rishi Herbal India";
		
		if(actualtitle.equals(expectedtitle))
		{
			System.out.println("title is valid");
		}
		else
		{
			System.out.println("not valid title");
		}
		
		//screenshot
		driver.findElement(By.id("outOfStockFilter")).click();
		driver.findElement(By.name("query")).sendKeys("super health");
		WebElement baby=driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[6]/a"));
		File babyss=baby.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(babyss,new File("./screenshottask1//baby.png"));
		
		//drop down
		WebElement az =driver.findElement(By.xpath("//*[@id=\"input-sort\"]"));
		Select asc = new Select(az);
		asc.selectByValue("alphabet-asc");
		
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[4]/a")).click();
		
		//scroll by content
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()",driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/a")));
	}
}

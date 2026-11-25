package TestNG;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Ninja {
	
ChromeDriver driver;

@Before
public void a ()
{
	driver = new ChromeDriver();
	driver.get(" https://tutorialsninja.com/demo/");
}

@Test
public void b() throws IOException {
	
	driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a")).click();
	driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[1]/a")).click();
	
	driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset[1]/div[2]/div/input ")).sendKeys("MUZAMMIL ");
	driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset[1]/div[3]/div/input ")).sendKeys("A.L ");
	driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset[1]/div[4]/div/input ")).sendKeys("muzamnidln81@gmail.com");
	driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset[1]/div[5]/div/input")).sendKeys("9526300189 ");
	driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset[2]/div[1]/div/input")).sendKeys("413641367");
	driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset[2]/div[2]/div/input")).sendKeys("413641367");
	driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/input[1]")).click();
	
	WebElement ss = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset[1]/div[4]/div/input"));
	File src = ss.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src, new File("./screenshot/neww.png"));
	

	
	driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/input[2]")).click();
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/a")).click();
	driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a")).click();
	driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[5]/a")).click();
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/a")).click();
	
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,10000)",""); 
	
	WebElement ww = driver.findElement(By.xpath("/html/body/footer/div/div/div[2]/ul/li[3]/a"));
	File urc  =ww.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(urc, new File("./screenshot/neww2.png"));
	
	driver.findElement(By.xpath("/html/body/footer/div/div/div[2]/ul/li[1]/a")).click();
	
	driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset/div[1]/div/input")).sendKeys("muzammil");
	driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset/div[2]/div/input ")).sendKeys("muzammilalal4133@gmail.com");
	driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset/div[3]/div/textarea")).sendKeys(" for testing purpose ");
	
	driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/input")).click();
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/a")).click();
	 
}
}

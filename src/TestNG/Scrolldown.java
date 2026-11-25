package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Scrolldown {
ChromeDriver driver;

@BeforeTest
public void a()
{
	driver=new ChromeDriver();
	
}
@BeforeMethod
public void b()
{
	driver.get(" https://keralaproperty.in/");
	
}
@Test
public void c()
{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	//js.executeScript("window.scrollBy(0,10000)","");                                                                         /// using pixel size
	//js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("/html/body/footer/div/ul/li[3]/a ")));    /// scroll by using xpath
	//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");                                                       /// scroll by height
	
	js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[1]/form/div[1]/input")));
	
	WebElement mu = driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[1]/form/div[1]/input"));                     // to store
	mu.sendKeys("muzammil");                                                                                                   // to give a value
}
} 

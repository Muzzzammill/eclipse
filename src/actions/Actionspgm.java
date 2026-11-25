package actions;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Actionspgm {
	
	 ChromeDriver driver;
	 @BeforeTest
	 public void a() {
		 
		 driver=new ChromeDriver();
	 }
	 
	 @BeforeMethod
	 public void b()
	 {
		 driver.get(" https://register.rediff.com/register/register.php?FormName=user_details");
	 }
	
	 @Test
	 public void c()
	 {
		WebElement firstname= driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[2]/input"));
		firstname.sendKeys("muzammil");
		
		WebElement secondname =	driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[3]/div/input"));
		Actions act = new Actions (driver);
		
		
		act.keyDown(firstname,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
		act.keyDown(firstname,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
		act.keyDown(secondname,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
		
		act.perform();
	 }
}

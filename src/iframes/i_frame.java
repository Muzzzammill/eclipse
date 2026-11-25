package iframes;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class i_frame {
	
	@Test
	public void a ()
	{
	ChromeDriver  driver = new ChromeDriver();
	driver.manage().window().minimize();
	
	driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe");        
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement frame1 = driver.findElement(By.id("iframeResult"));						 //// switch to first iframe	
	driver.switchTo().frame(frame1);
	
	WebElement innerFrame = driver.findElement(By.tagName("iframe"));					//// switch to inner frame	
	driver.switchTo().frame(innerFrame);
	
	WebElement text = driver.findElement(By.tagName("h1"));								//// access to h1
	System.out.println(text.getText());
	
	driver.switchTo().defaultContent();													//// come back to main page
	
	}
	
}


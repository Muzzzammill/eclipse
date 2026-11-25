package pgmalert;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpgm {
			ChromeDriver driver;
			
			@Before
			public void a() {
				driver = new ChromeDriver();
				driver.get(" file:///C:/Users/91952/Documents/alert.html");		
				}
			
			@Test
			public void b() {
			 driver.findElement(By.xpath("/html/body/input[1]")).click();
			 
			 Alert a=driver.switchTo().alert();
			 a.getText();
			 String actual=a.getText();
			 String expected="muzammil";
		
			 if(actual.equals(expected))
			 {
				 System.out.println("true");
			 }
			 else
			 {
				 System.out.println("false");
			 }
			 driver.switchTo().alert().accept();    //// to get alert box
			 driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("muzammil");
			 driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("41364136");
			 driver.findElement(By.xpath("/html/body/input[4]")).click();
//			 driver.quit();
			}

}

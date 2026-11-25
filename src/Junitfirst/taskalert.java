package Junitfirst;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class taskalert {

	 ChromeDriver driver;
	@Before
	public void a()
	{
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	}
	@Test
	public void b()
	{
		driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[1]/button")).click();
		 Alert a=driver.switchTo().alert();
		 a.getText();
		
		 String actual=a.getText();
		 String expected="I am a JS Alert";
	
		 if(actual.equals(expected))
		 {
			 System.out.println("true");
		 }
		 else
		 {
			 System.out.println("false");
		 }
		 a.accept();
		
	}
	
//	@Test
//	public void b ()
	{
		
	}
}

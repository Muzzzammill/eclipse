package TestNG;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Window_handles {

	ChromeDriver driver;
	@BeforeTest
	public void a()
	{
		driver = new ChromeDriver();
	}
	@BeforeMethod
	public void b() 
	{
		driver.get("https://demo.guru99.com/popup.php");
	}

	@Test
	
			{
				String ParentWindow= driver.getWindowHandle();
				System.out.println("parent window "+ driver.getTitle());
				driver.findElement(By.xpath("/html/body/p[1]/a")).click();
				
				
				Set<String> allwindowHandles = driver.getWindowHandles();
				
				for(String handle : allwindowHandles)
				{
					System.out.println(handle);
					
					if(!handle.equalsIgnoreCase(ParentWindow))
					{
						driver.switchTo().window(handle) ;
						driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("hello@gmail");
						driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input")).click();
						driver.close();
					}
					driver.switchTo().window(ParentWindow) ;
				}
				
			

	}
	
	
}

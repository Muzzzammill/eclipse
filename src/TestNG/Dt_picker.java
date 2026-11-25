package TestNG;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dt_picker {
	ChromeDriver driver;
	
	@BeforeTest
	
	public void a ()
	{
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
	}
	
	@Test
	public void b ()
	{
		driver.findElement(By.xpath("//*[@id=\"datepicker1\"]")).click();
		
		while(true)
		{
			WebElement mu = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div"));
			String month=mu.getText();
			
			if(month.contains("April"))
			{
			    System.out.println(month);
			    break;
			}
			else
			{
				driver.findElement(By.xpath(" //*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
			}
		}
			
			List<WebElement> alldates =driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td/a"));
			for (WebElement dateelement: alldates)
			{
				String date = dateelement.getText();
				if(date.equals("29"))
				{
					dateelement.click();
					break;
				}
				
			}	
			}

}

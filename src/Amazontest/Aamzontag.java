package Amazontest;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aamzontag {

	ChromeDriver driver;
	
	@Before
	public void tag()
	{
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void tags()
	{
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println(li.size());
		for( WebElement a : li)
		
		{
			String link=a.getAttribute("href");
			String text=a.getText();
					System.out.println(link+"-----"+text);
		}
	}
	

	
}

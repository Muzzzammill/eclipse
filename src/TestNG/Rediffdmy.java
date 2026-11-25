package TestNG;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediffdmy {

	ChromeDriver driver;

	@Before
	public void a()
	{
		
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
}
	@Test
	public void b() 
	{
		WebElement day  = driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[1]"));
		Select day1=new Select(day); 
		day1.selectByValue("01");
		System.out.println(day1.getOptions().size());
		
		
		WebElement month = driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[2]"));
		Select month1=new Select(month);
		month1.selectByIndex(07);
		System.out.println(month1.getOptions().size());
		
		WebElement year = driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[3]"));
		Select year1=new Select(year);
		year1.selectByVisibleText("2004");
		System.out.println(year1.getOptions().size());
	}
	
	
	}

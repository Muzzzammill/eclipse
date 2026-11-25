package Junitfirst;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {
ChromeDriver driver;

@Before
public void a()
{
	
	driver=new ChromeDriver();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	////driver.manage().window().maximize(); 
}

@Test
public void b()
{
	driver.findElement(By.xpath("//form[@name='register_mail']/div/div[2]/input")).sendKeys("muzammil");
	driver.findElement(By.xpath("//form[@name='register_mail']/div/div[3]/div/input")).sendKeys("muzammil2234");
	driver.findElement(By.xpath("//input[@class='btn_checkavail button']")).click();
	driver.findElement(By.xpath("//input[@id='newpasswd']")).sendKeys("muzammil4136");
	driver.findElement(By.xpath("//form [@name='register_mail']/div/div[7]/div/input")).sendKeys("muzammil12234");
	driver.findElement(By.xpath("//form[@name='register_mail']/div/div[8]/select")).sendKeys("10");
	driver.findElement(By.xpath("//form[@name='register_mail']/div/div[8]/select[2]")).sendKeys("12");
	driver.findElement(By.xpath("//form[@name='register_mail']/div/div[8]/select[3]")).sendKeys("2004");
}
}

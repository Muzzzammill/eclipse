package Amazontest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon1 {
FirefoxDriver driver;
@Before
public void a()
{
	driver= new FirefoxDriver();
	driver.get("https://www.amazon.in/");

}
@Test
public void b ()
{
	driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobile",Keys.ENTER);
}}
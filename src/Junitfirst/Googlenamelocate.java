package Junitfirst;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlenamelocate {

ChromeDriver Driver;

@Before
  public void setup()
  {
	Driver =new ChromeDriver();
	Driver.get("https://www.google.com");
  }

@Test
public void test()
{
	Driver.findElement(By.name("q")).sendKeys("tiger",Keys.ENTER);
	//Driver.findElement(By.name("btnK")).click();
}
}
 
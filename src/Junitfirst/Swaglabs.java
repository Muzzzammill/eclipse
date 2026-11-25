package Junitfirst;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swaglabs {

	 ChromeDriver Driver;
@Before
public void first() {
	Driver = new ChromeDriver();
		Driver.get("https://www.saucedemo.com/");
}
@Test
public void testing() {
	 Driver.findElement(By.id("user-name")).sendKeys("l",Keys.ENTER);
	 Driver.findElement(By.id("password")).sendKeys("12345678",Keys.ENTER);
	 Driver.findElement(By.xpath("//input[@class='submit-button btn_action']")).click();
	}



}

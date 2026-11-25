package Junitfirst;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id_check {

ChromeDriver Driver;

@Before
	public void browser() {
	
Driver=new ChromeDriver();
Driver.get("https://keralaproperty.in/");
//Driver.get("https://keralaproperty.in/member/login/");
}
@Test
public void testing() {
	Driver.findElement(By.className("login")).click();
	Driver.findElement(By.id("ulogin")).sendKeys("muzammil",Keys.ENTER);
	Driver.findElement(By.id("upass")).sendKeys("12345",Keys.ENTER);
	Driver.findElement(By.id("sub_logbtn")).click();
	
}}

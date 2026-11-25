package Junitfirst;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redifftextcheck {
  ChromeDriver driver;
  
  @Before
  public void a() {
	  driver=new ChromeDriver();
	  driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	  
  }
 @Test
 public void b() {
	 driver.findElement(By.xpath(" /html/body/div[2]/div[2]/form/div/div[20]/input"));
	String a =driver.findElement(By.xpath("//input[@value='Create my account']")).getAttribute("value");
	 String actual= a;
	 System.out.println(a);
 }
} 
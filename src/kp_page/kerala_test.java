package kp_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class kerala_test {

	WebDriver driver;
	
	By kpname = By.name("ulogin");
	By kppass = By.id("upass");
	By kplogin = By.id("sub_logbtn");
	
	public kerala_test(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void sendvalues (String email,String password)
	{
		driver.findElement(kpname).clear();
		driver.findElement(kpname).sendKeys(email);
		driver.findElement(kppass).clear();
		driver.findElement(kppass).sendKeys(password);
		
		
	}
	public void loginpage ()
	{
		driver.findElement(kplogin).click();
	}
}

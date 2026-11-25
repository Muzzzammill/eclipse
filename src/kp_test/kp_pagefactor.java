package kp_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kp_pagefactor {
	
	WebDriver driver;
	@FindBy (name="ulogin") WebElement kpnamee;
	@FindBy (name="upass") WebElement kppass;
	@FindBy (id="sub_logbtn") WebElement kploginn;
	
	public  kp_pagefactor (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setvalues (String email,String password)
	{
		kpnamee.sendKeys("muzammil");
		kppass.sendKeys("1223456");
	}
	public void login ()
	{
		kploginn.click();
	}
	
}

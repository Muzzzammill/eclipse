package kp_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import kp_test.kp_pagefactor;

public class pagefactor {

	WebDriver driver;
	@BeforeTest
	public void web()
	{
		driver = new ChromeDriver();
	}
	@BeforeMethod
	public void geturl()
	{
		driver.get("https://keralaproperty.in/member/login/");
	}
	@Test
	public void test()
	{
		kp_pagefactor  ob = new kp_pagefactor(driver);
		ob.setvalues("muzammil", "akjcbwei");
	}
}

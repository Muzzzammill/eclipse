package seleniumbasics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_basics {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.chrome.com");
	driver.close();
}
}

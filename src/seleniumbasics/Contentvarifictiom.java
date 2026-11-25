package seleniumbasics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Contentvarifictiom {
	public static void main(String[] args) {
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://www.google.com");
		 driver.getPageSource();
		 String b=driver.getPageSource();
		 String a ="ਪੰਜਾਬੀ";
				 if(b.contains(a))
				 {
					 System.out.println("pass");
				 }
				 else {
					 System.out.println("fail");
				 }
		 
}
}
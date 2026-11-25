package seleniumbasics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Get_title {
public static void main(String[] args) {
	 ChromeDriver driver=new ChromeDriver();
	 driver.get("https://www.chrome.com");
	 String actualtitle=driver.getTitle();
	 
	 System.out.println(actualtitle);
	 
	 String expectedtitle="Google Chrome - The Fast & Secure Web Browser Built to be Yours";
	 
	 if(actualtitle.equals(expectedtitle))
	 {
		 System.out.println("pass");
	 }
	 else {
		 System.out.println("fail");
	 }
}
}
 
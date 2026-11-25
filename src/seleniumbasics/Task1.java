package seleniumbasics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.cakehut.in/");
		String actualtitle= driver.getTitle();
		System.out.println(actualtitle);
		String expected="Cake Hut, Cake shop : Birthday cakes,anniversary cakes cochin,custom cakes";
		
		if(actualtitle.equals(expected))
		{
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
			
	driver.get("https://www.cakehut.in/x-mas-new-year-cakes");
	driver.getPageSource();
	String p= driver.getPageSource();
	String q =("priceee");
	
	if (p.contains(q))
	{
		System.out.println("page contains price");
	}
	else {
		System.out.println("page doesnot contain price");
	}
		
	}

}

package link_testing;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlelink {
	
	ChromeDriver driver;
	String baseurl="https://www.google.com";
	@Before
	public void a() {
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	
	@Test
	public void b() throws Exception {
		
		URL ob = new URL (baseurl);
		HttpURLConnection con=(HttpURLConnection) ob.openConnection();
		
		con.connect();
		
		driver.findElement(By.tagName(a));

		
	}

} 

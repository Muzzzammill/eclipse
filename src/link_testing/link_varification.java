package link_testing;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class link_varification {

	ChromeDriver driver;
	String baseurl="https://www.google.com";  /// to call the link (baseurl)
	
	@Before
	public void a ()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
			
	}
	@Test
	public void b() throws Exception
	{
		URL ob = new URL(baseurl);
		HttpURLConnection con=(HttpURLConnection) ob.openConnection();
		
		con.connect();
	
		if(con.getResponseCode()==404)
		{
			System.out.println("it is a valid url");
		}
		else {
			System.out.println("it is not a valid link");
		}
	}
}

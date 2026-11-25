
package exam_page;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Ep{

    WebDriver driver;
    String parentwindow;

    public Ep(WebDriver driver) {
        this.driver = driver;
    }

public void cookie()
{
	driver.findElement(By.xpath("/html/body/div[1]/div[7]/div/div/div[3]/button")).click();
}
   
    public void newtab() {

        parentwindow = driver.getWindowHandle();

        driver.findElement(By.xpath("/html/body/footer/div[2]/div[5]/div[4]/a/icon")).click();
    }

    public void newwindow()
    {

        Set<String> windows = driver.getWindowHandles();

        for (String window : windows) {

            if (!window.equals(parentwindow)) {
                driver.switchTo().window(window);
                
                break;
            }
        }
    }

    
    public void title() 
    	{
        String actual = driver.getTitle();
        String expected = "Tools QA";
        
        if (expected.equals(actual))
        {
            System.out.println("Title verified");
        } 
        else
        {
            System.out.println("Title not valid");
        }
    	}

   
    public void urlverify() 
    {
        String actual = driver.getCurrentUrl();
        String expected = "https://www.toolsqa.com/";
        Assert.assertEquals(actual, expected);
    }

    
    public void backtowindow() 
    {
        driver.switchTo().window(parentwindow);
    }

  
    public void enroll() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div[2]/div[4]/div[1]/a" )).click();

        driver.findElement(By.id("first-name")).sendKeys("muzammil");

        driver.findElement(By.id("last-name")).sendKeys("a.l");

        driver.findElement(By.id("email")).sendKeys("muzammil@gmail.com");

        driver.findElement(By.id("city")).sendKeys("Thrissur");

        WebElement country = driver.findElement(By.id("country"));

        Select cou = new Select(country);
        cou.selectByValue("1");

        driver.findElement(By.id("message")).sendKeys("hello  world");
        Thread.sleep(15000);
        driver.findElement(By.xpath("//*[@id='enroll-form']/button")).click();
    }  
    
        public void ss() throws IOException 
        
        {
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileHandler.copy(src, new File("./screenshot/id.png"));
        }
  
    }



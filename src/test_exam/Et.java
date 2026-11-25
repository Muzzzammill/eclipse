
package test_exam;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import exam_page.Ep;

public class Et {

    WebDriver driver;

    @BeforeTest
    public void a()
    {
        driver = new ChromeDriver();
    }

    @BeforeMethod
    public void geturl() {
        driver.get("https://www.toolsqa.com/");
    }

    @Test
    public void test() throws IOException, InterruptedException {

        Ep ob = new Ep(driver);
        
//        ob.cookie();
//        ob.newwindow();
//        ob.title();
   //  ob.urlverify();
//     ob.backtowindow();
//        ob.enroll();
     ob.ss();
    }
}

package TestNGClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SecondTest {
	
	public String baseUrl = "https://www.javatpoint.com/";
    String driverPath = "C:\\Users\\rupal.garg\\Desktop\\drivers\\chromedriver.exe";
    public WebDriver driver ;
    
    @BeforeTest
    public void launchBrowser() {
    	System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.get(baseUrl);
    }

    @Test
    public void verifyHomepageTitle() {
        String expectedTitle = "Tutorials List - Javatpoint";
//    	String expectedTitle = "Tutorials List";
    	String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }
    @AfterTest
    public void terminateBrowser(){
        driver.close();
    }

}

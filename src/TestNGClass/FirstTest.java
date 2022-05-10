package TestNGClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {
	
	public String baseUrl = "https://www.javatpoint.com/";
    String driverPath = "C:\\browserdrivers\\chromedriver.exe";
    public WebDriver driver ;

    @Test
    public void verifyHomepageTitle() {
          
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.get(baseUrl);
        String expectedTitle = "Tutorials List - Javatpoint";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        driver.close();
    }

}

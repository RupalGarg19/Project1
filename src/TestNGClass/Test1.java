package TestNGClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
	WebDriver driver;
	
	@BeforeMethod
	public void f1() {
		  System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");		
		  driver = new ChromeDriver();
	}
	
	@Test
	public void f() {
		driver.get("http://www.google.com");
		System.out.print("HI!!");
	}
	
	@AfterMethod
	public void f2() {
		driver.close();
	}
}

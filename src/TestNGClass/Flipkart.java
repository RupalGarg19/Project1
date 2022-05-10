package TestNGClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Flipkart {
	public static WebDriver driver = new ChromeDriver();
		String username = ""; 
		String password = "";

		@SuppressWarnings("deprecation")
		@BeforeClass
		public void init() {
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.navigate().to("https://www.flipkart.com");
		}

		@Test
		public void login() {
			driver.findElement(By.partialLinkText("Login")).click();
			driver.findElement(By.cssSelector(".fk-input.login-form-input.user-email")).sendKeys(username);
			driver.findElement(By.cssSelector(".fk-input.login-form-input.user-pwd")).sendKeys(password);
			driver.findElement(By.cssSelector(".submit-btn.login-btn.btn")).click();
		}

		@Test
		public void searchAndSelectProduct() {
			driver.findElement(By.id("fk-top-search-box")).sendKeys("moto g3");
			driver.findElement(By.cssSelector("search-bar-submit.fk-font-13.fk-font-bold")).click();
			
			String css = ".gd-row.browse-grid-row:nth-of-type(1) > div:nth-child(1)>div>div:nth-child(2)>div>a";
			driver.findElement(By.cssSelector(css)).click();
		}

		@Test
		public void buyAndRemoveFromCart() {
			driver.findElement(By.cssSelector(".btn-express-checkout.btn-big.current")).click();
			driver.findElement(By.cssSelector(".remove.fk-inline-block")).click();
			Alert a = driver.switchTo().alert();
			a.accept();
		}

		@Test
		public void logout() {
			Actions s = new Actions(driver);
			WebElement user = driver.findElement(By.partialLinkText(username));
			s.moveToElement(user).build().perform();
			driver.findElement(By.linkText("Logout")).click();
		}

		@AfterClass
		public void quit() {
			driver.close();
		}

}

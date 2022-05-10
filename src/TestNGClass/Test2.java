package TestNGClass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Test2 {
	WebDriver driver;

	@Test(priority = 1,description = "yes")
	public void bf1() {
		System.out.print("BYE!!");
	}
	
	@Test(priority = 2,description = "no")
	public void af() {
		System.out.print("HI!!");
	}

}

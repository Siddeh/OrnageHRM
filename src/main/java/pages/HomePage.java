package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	By homePageUserName = By.xpath("//p[normalize-space()='Time at Work']");

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	//get the welcome text or username from home page
	public String getHomePageUserName() {
		return driver.findElement(homePageUserName).getText();
	}
}

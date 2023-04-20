package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	@FindBy(xpath ="//p[normalize-space()='Time at Work']")
	WebElement homePageUserName;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//get the welcome text or username from home page
	public String getHomePageUserName() {
		return homePageUserName.getText();
	}
}

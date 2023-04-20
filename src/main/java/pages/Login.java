package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	WebDriver driver;
	
	By user = By.xpath("//input[@placeholder='Username']");
	By password = By.xpath("//input[@placeholder='Password']");
	By message = By.xpath("//h5[normalize-space()='Login']");
	By login = By.xpath("//button[normalize-space()='Login']");
	
	public Login(WebDriver driver) {
		this.driver = driver;
	}
	
	//set user name in textbox
	public void setUserName(String strUserName) {
		driver.findElement(user).sendKeys(strUserName);
	}
	
	//set password in password textbox
	public void setPassword(String strPassword) {
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys(strPassword);
	}
	
	//click on login button
	public void clickLogin() {
		driver.findElement(login).click();
	}
	
	//get the message of login page
	public String getLoginMessage() {
		return driver.findElement(message).getText();
	}
	
	//This POM method will be exposed in the test case to login to application
	public void loginToApplication(String strUserName, String strPassword) {
		//Fill User Name
		this.setUserName(strUserName);
		//Fill password
		this.setPassword(strPassword);
		//Click Login Button
		this.clickLogin();
	}
	
	
}

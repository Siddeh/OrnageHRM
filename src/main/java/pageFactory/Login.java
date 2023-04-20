package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	WebDriver driver;
	//All webELements are identified by @FindBy Annotation
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="signon")
	WebElement login;
	
	@FindBy(xpath="//p[contains(text(),'Please enter')]")
	WebElement message;
	
	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); //initElements will create the webelements
	}
	
	//set user name in textbox
	public void setUserName(String strUserName) {
		username.sendKeys(strUserName);
	}
	
	//set password in password textbox
	public void setPassword(String strPassword) {
		password.clear();
		password.sendKeys(strPassword);
	}
	
	//click on login button
	public void clickLogin() {
		login.click();
	}
	
	//get the message of login page
	public String getLoginMessage() {
		return message.getText();
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

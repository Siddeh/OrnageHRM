package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.Login;

public class TestLogin {
	
	WebDriver driver;
	Login objLogin;
	HomePage objHomePage;
	
	@BeforeTest
	public void setup() {
		//System.setProperty("wendriver.chrome.driver", "C:/Software/drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\003MQ6744\\Desktop\\FullStackTesting\\Selenium\\Soft\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test
	public void test_Home_Page_Appear_Correct() {
		objLogin = new Login(driver);
		//Verify the login page message
		String loginPageMessage = objLogin.getLoginMessage();
		System.out.println(loginPageMessage);
		Assert.assertTrue(loginPageMessage.contains("Login"));
		
		//To login to application
		objLogin.loginToApplication("Admin", "admin123");
		// go to next page
		
		objHomePage = new HomePage(driver);
		// verify home page
		Assert.assertTrue(objHomePage.getHomePageUserName().contains("Time at Work"));
		
}
}
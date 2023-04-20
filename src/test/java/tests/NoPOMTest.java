package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NoPOMTest {

	@Test
	public void test_Home_Page_Appear_Correct() {
		System.setProperty("webdriver.chrome.driver", "C:/Software/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://petstore.octoperf.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Enter the Store")).click();
		driver.findElement(By.partialLinkText("Sign")).click();
		driver.findElement(By.xpath("//input[contains(@id,'ripe')]")).sendKeys("j2ee");
		driver.findElement(By.name("signon")).click();
		
		String homeText = driver.findElement(By.xpath("//div[@id='WelcomeContent']")).getText();
		Assert.assertTrue(homeText.contains("Welcome"));
		
	}
}

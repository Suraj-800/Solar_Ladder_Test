package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Resource.Base;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobject.CreatePage;
import pageobject.LoginPage;
import pageobject.MovingPage;
import pageobject.ProjectPage;

public class LoginTest extends Base {
	
	
	@Test
	public void login() throws IOException, InterruptedException{
		
//		WebDriver driver = initializeBrowser();
		
//		driver.get("https://unergia-saas-staging-solarladder.vercel.app/login");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver(options);
		driver.get("https://unergia-saas-staging-solarladder.vercel.app/dashboard?tab=crm");
		driver.manage().window().maximize();
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.emailid().sendKeys("solarladdertest787@yopmail.com");
		loginpage.passwordfeild().sendKeys("password");
		loginpage.Loginbutton().click();
		
		Thread.sleep(6000);
	
		ProjectPage projectpage=new ProjectPage(driver);
		projectpage.Addproject().click();
		
		Thread.sleep(5000);
		
		CreatePage createpage = new CreatePage(driver);
		createpage.projectsize().sendKeys("10");
		createpage.customername().sendKeys("suraj");
		createpage.mobileno().sendKeys("9764310464");
		createpage.location().sendKeys("pune");
		createpage.addingproject().click();
		Thread.sleep(50000);
		
		MovingPage move=new MovingPage(driver);
		WebElement enquirybox=move.enquirypage();
		WebElement sitevisitbox=move.sitevisit();
		Actions actions=new Actions(driver);
		actions.dragAndDrop(enquirybox, sitevisitbox).perform();
}
	
	
	
}
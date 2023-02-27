package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectPage {
	
	WebDriver driver;
	
	public ProjectPage(WebDriver driver) {
	
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
	}	

	
	
	@FindBy(xpath="//span[@class='MuiButton-label'][contains(.,'Project')]")
	WebElement Addproject;
	
	public WebElement Addproject() {
		
		return Addproject;
	
	
	
	}
	
	
}

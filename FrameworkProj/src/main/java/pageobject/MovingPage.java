package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MovingPage {
	
      WebDriver driver;
	
	public MovingPage(WebDriver driver) {
	
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
	@FindBy(xpath ="(//section[@title='Enquiry']//div)[4]") 
	WebElement enquirypage;
	
	public WebElement enquirypage() {
	
		return enquirypage;
	}	
	
	@FindBy(xpath="(//div[contains(@class,'smooth-dnd-container vertical')])[2]")
	WebElement sitevisit;
	
	public WebElement sitevisit() {
		
		return sitevisit;
	}
	
	
	
}
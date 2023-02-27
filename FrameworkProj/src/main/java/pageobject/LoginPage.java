package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver ,this);
	}
		@FindBy(name="email")
		WebElement emailid;
		
		@FindBy(name="password")
		WebElement passwordfeild;
		
		@FindBy(css="button[type='submit']")
		WebElement Loginbutton;
		
		public WebElement emailid() {
			
			return emailid;
	}
	     public WebElement passwordfeild() {
	    	 
	    	 return passwordfeild;
	     }
	     
	     public WebElement Loginbutton() {
	    	 
	    	 return Loginbutton;
	    	 
	     	 
	     }
	

}

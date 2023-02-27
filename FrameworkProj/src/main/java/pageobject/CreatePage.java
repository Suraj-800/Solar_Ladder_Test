package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatePage {

		
		WebDriver driver;
		
		
		
		public CreatePage(WebDriver driver) {
			super();
			this.driver = driver;
			PageFactory.initElements(driver,this);
		}

		
		@FindBy(name="projectSize")
		WebElement projectsize;
		
         public WebElement projectsize() {
			
			return projectsize;
	}
         @FindBy(name="customerName")
 		WebElement customername;
 		
          public WebElement customername() {
 			
 			return customername;
          }	
          @FindBy(xpath = "//input[@value='+91']")
 	 		WebElement mobileno;
 	 		
 	          public WebElement mobileno() {
 	 			
 	 			return mobileno;
 	          }	
 	         @FindBy(name="location")
 			WebElement location;
 			
 	         public WebElement location() {
 				
 				return location;
 			
 	}
 	        @FindBy(xpath = "//span[contains(.,'Add Project')]")
 	        WebElement addingproject;
 	        public WebElement addingproject() {
				
				return addingproject;
	}
}


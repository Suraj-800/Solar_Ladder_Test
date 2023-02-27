package Resource;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
public WebDriver initializeBrowser() throws IOException{
		
		
		WebDriver driver = null;
		Properties prop = new Properties();
		String propPath = System.getProperty("user.dir")+"\\src\\main\\java\\resource\\data.properties";
		FileInputStream fis = new FileInputStream(propPath);
		prop.load(fis);
		
		String browserName = prop.getProperty("browser");
		
		
		if(browserName.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}else if(browserName.equalsIgnoreCase("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}else if(browserName.equalsIgnoreCase("ie")) {
			
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;
		
	}

}


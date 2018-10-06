package com.qa.support;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Utils {
	
	

public static WebDriver getdriver(String browsername) {
		
		WebDriver driver=null;	
		/*Properties prop=new Properties();
		browsername=prop.getProperty("browser");*/
		
		switch(browsername.toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			/*System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();*/
			System.setProperty("webdriver.gecko.driver","C:\\drivers\\geckodriver.exe");
			driver= new FirefoxDriver();
			break;
		case "ie":
			System.setProperty("webdriver.ie.driver", "C:\\drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			break;	
		default:
			System.out.println(" Current support is on FF,IE and CHROME");
			break;
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		return driver;	
		
	}


	
		
	}
	

	
	
	
	
	
	
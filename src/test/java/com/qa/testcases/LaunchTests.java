package com.qa.testcases;

import org.openqa.selenium.WebDriver;
import com.qa.support.PropReader;
import com.qa.support.Utils;

public class LaunchTests extends PropReader{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		System.out.println("----------------Tests started---------------");
		PropReader reader=new PropReader();
		WebDriver driver = Utils.getdriver("chrome");
		driver.get(reader.getKey("URL"));
	
		//HomePage.launch();
		System.out.println("----------------Tests Passed----------------");

	}

}

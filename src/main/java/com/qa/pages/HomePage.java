package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.support.PropReader;
import com.qa.support.Utils;

public class HomePage {
	
	@FindBy(className = "desktop-searchBar")
	static WebElement searchbox;
	@FindBy(xpath = "//a[@class='desktop-submit']")
	static WebElement search_btn;
	
	static WebDriver driver=null;
	static PropReader reader=null;

	public static void launch()
	{
		System.out.println("-------------Executing Launch Method---------------");
		driver = Utils.getdriver("firefox");
		reader=new PropReader();
		searchbox.sendKeys("T-shirts");
		search_btn.click();
		driver.close();
		
	}

}

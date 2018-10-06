package com.qa.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Actions act =new Actions(driver);
		WebElement ele =driver.findElement(By.xpath("//text()[.='TVs & Appliances']/ancestor::span[1]"));
		act.moveToElement(ele).perform();
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		
		for(WebElement link:links)
		{
			System.out.println("Links under TV's and Appliances is:::"+link.getText());
		}
		
		

	}

}

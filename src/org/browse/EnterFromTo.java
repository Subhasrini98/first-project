package org.browse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterFromTo {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\SelelinumDay1\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/ ");
		
		WebElement e = driver.findElement(By.id("src"));
		
		e.sendKeys("chennai");
		
		WebElement e1 = driver.findElement(By.id("dest"));
		
		e1.sendKeys("Madurai");
		
	}

}

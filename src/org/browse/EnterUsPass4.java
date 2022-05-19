package org.browse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterUsPass4 {
	
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\SelelinumDay1\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		
		WebElement e = driver.findElement(By.id("username"));
		e.sendKeys("Vijai02");
		
		WebElement e1 = driver.findElement(By.id("password"));
		e1.sendKeys("Vi12345");
		
		
	}

}

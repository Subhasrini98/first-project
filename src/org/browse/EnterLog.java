package org.browse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterLog {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\SelelinumDay1\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/login");
		
		WebElement e2 = driver.findElement(By.id("userName"));
		
		e2.sendKeys("subha98srini@gmail.com");
		
		
		
		//WebElement e3 = driver.findElement(By.id("j_password"));
		
		//e3.sendKeys("subha");
		
	}

}

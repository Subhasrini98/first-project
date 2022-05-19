package org.browse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterUsPass1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\SelelinumDay1\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		
		Thread.sleep(4000);
		
		WebElement e2 = driver.findElement(By.xpath("//input[@type='text']"));
	
		e2.sendKeys("subha_srini");
		
		WebElement e5 = driver.findElement(By.name("password"));
		
		e5.sendKeys("Vi12345");
	}

}

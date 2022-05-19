package org.browse;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterIdPassword {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\SelelinumDay1\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement e = driver.findElement(By.id("email"));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].value='subha'",e);
		
		//e.sendKeys("vijai@gmail.com");
		
		WebElement e1 = driver.findElement(By.id("pass"));
		e1.sendKeys("vijai12");
		
		WebElement e2 = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		j.executeScript("arguments[0].click()",e2);
		//e2.click();
		
	}

}

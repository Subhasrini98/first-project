package org.browse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EntercosId {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\SelelinumDay1\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://netbanking.hdfcbank.com/");
		driver.manage().window().maximize();
		
		List<WebElement> e1 = driver.findElements(By.tagName("frame"));
		int s = e1.size();
		System.out.println(s);
		
		//driver.switchTo().frame(0);
		//driver.switchTo().frame(1);

		WebElement e2 = driver.findElement(By.xpath("//frame [@marginwidth='0']"));
		driver.switchTo().frame(e2);
		
		WebElement e = driver.findElement(By.xpath("//input[@type='text']"));
		
		e.sendKeys("subha@gmail.com");
		
		
	}
	
	

}

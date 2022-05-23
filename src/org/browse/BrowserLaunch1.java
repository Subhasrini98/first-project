package org.browse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\SelelinumDay1\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		String t = driver.getTitle();
		System.out.println(t);
		
		String t2 = driver.getCurrentUrl();
		System.out.println(t2);
		
		System.out.println("completed");
	}

}

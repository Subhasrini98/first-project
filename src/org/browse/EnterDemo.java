package org.browse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterDemo {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\SelelinumDay1\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement e1 = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		e1.sendKeys("subha");
		
		WebElement e4 = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		e4.sendKeys("shini");
		
		WebElement e5 = driver.findElement(By.xpath("//textarea[@rows='3']"));
		e5.sendKeys("1/203, chinna st, Kolathur");
		
		WebElement e6 = driver.findElement(By.xpath("//input[@type='email']"));
		e6.sendKeys("subha@gmail.com");
		
		WebElement e7 = driver.findElement(By.xpath("//input[@type='tel']"));
		e7.sendKeys("9841012345");
		
		WebElement e8 = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		e8.click();
		
		WebElement e9 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		e9.click();
		
		WebElement e2 = driver.findElement(By.id("firstpassword"));
		e2.sendKeys("12345");
		
		WebElement e3 = driver.findElement(By.id("secondpassword"));
		e3.sendKeys("12345");
		
		
	}

	

}

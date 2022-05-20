package com.hello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement findElement = driver.findElement
		(By.xpath("//input[@id='email']//ancenstor::div[@class='_6lux']//following sibiling::div//child::[@class=\"_6ltg\"]"));
		findElement.sendKeys("findElemen");
		
		
	}

}

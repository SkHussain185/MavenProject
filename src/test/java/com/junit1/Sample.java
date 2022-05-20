package com.junit1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		Thread.sleep(6000);
		WebElement findElement = driver.findElement(By.id("username"));
		findElement.sendKeys("Hussain");
		Thread.sleep(6000);
		driver.navigate().refresh();
		
		for (int i = 0; i <=1; i++) {
			try {
				WebElement findElement1 = driver.findElement(By.id("username"));
				findElement1.sendKeys("prasad");
				break;
		
			} catch (Exception e) {
			}
			
		}
		
	//	findElement.sendKeys("prasad");
		
		
		
	}

}

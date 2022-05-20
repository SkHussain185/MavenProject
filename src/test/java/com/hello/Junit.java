package com.hello;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;


import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Junit {
	
	static WebDriver driver;
	@BeforeClass
	public static void beforeclass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
	}
	@AfterClass
	public static void afterclas() {
		//driver.quit();
	}
	@Test
	public void test() {
		//driver.get("https://adactinhotelapp.com/index.php");
		WebElement txtlogin = driver.findElement(By.xpath("//input[@id='username']"));
	    txtlogin.sendKeys("bvdsprasad");
	    WebElement element = driver.findElement(By.xpath("//input[@id='password']"));
	    element.sendKeys("Prasad@12");
	    WebElement element2 = driver.findElement(By.xpath("//input[@id='login']"));
	    element2.click();
	}
	@Before
	public void before() throws IOException {
		TakesScreenshot screen = (TakesScreenshot) driver;
		File screenshotAs = screen.getScreenshotAs(OutputType.FILE);
		File file = new File("C:\\Users\\Mounika\\eclipse-workspace\\Hello\\src\\test\\java\\com\\hello.png");
		FileUtils.copyFile(screenshotAs, file);
		
		
		//long timeMillis = System.currentTimeMillis();
		//System.out.println(timeMillis);
	}
	@After
	public void after() {
		long timeMillis1 = System.currentTimeMillis();
		System.out.println(timeMillis1);
	}
	
	
	
	

}

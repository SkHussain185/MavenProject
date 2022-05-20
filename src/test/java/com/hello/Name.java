package com.hello;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Name {
	static WebDriver driver;
	@BeforeClass
	public static void beforeclass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@AfterClass
	public static void afterclass() {
		//driver.quit();
	}
	@Test
	public  void test() {
		WebElement findEleme = driver.findElement(By.id("email"));
		findEleme.sendKeys("Hussain");
		
		String name = findEleme.getAttribute("value");
		Assert.assertEquals("Verify Test", "Hussain", name);
		//Assert.assertTrue(name, true);
		
	}
	@Before
	public void before() {
		System.out.println("before");
	}
	@After
	public void after() {
		System.out.println("after");
	}
	
	
	
	
	
	

		
	
	
	
}

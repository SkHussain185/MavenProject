package com.junit1;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.hello.BaseClass;

public class StealElement extends BaseClass {
	
	@Test
	public void test() {
	
		getDriver();
		enterUrl("https://adactinhotelapp.com/index.php");
		maximizeWindow();
		implicitWait(40);
		
		Pageobject page = new Pageobject();
		
		sendkey1(page.getTxtuser(), "Hussain");
		
		driver.navigate().refresh();
		
		sendkey1(page.getTxtuser(), "prasad");
		
		
		
	}
	
}

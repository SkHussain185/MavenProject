package com.hello;

import java.io.IOException;

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

public class Project2 extends BaseClass{
	
	@BeforeClass
	public static void beforeclass() {
		getDriver();
		enterUrl("https://adactinhotelapp.com/index.php");
		maximizeWindow();
		implicitWait(30);
	}
	@AfterClass
	public static void afterclass() {
		//closeAllWindows();
	}
	@Test
	public  void test() throws IOException {
		
		WebElement txtusername = findLocatorId("username");
		String data = getData("Test", 1,0);	
		sendkey1(txtusername, data);
		
		WebElement txtpassword = findLocatorId("password");
		String data2 = getData("Test", 1,1);
		sendkey1(txtpassword, data2);
		
		WebElement clklog = findLocatorId("login");
		click(clklog);
		Assert.assertTrue("clklog", true);
		
		WebElement clkloc = findLocatorId("location");
		String data8 = getData("Test", 1, 2);
		selectDropDownbyText(clkloc, data8);
	
		WebElement clkroomtype = findLocatorId("hotels");
		String data9 = getData("Test", 1, 3);
		selectDropDownbyText(clkroomtype, data9);
		
		WebElement findLocatorId = findLocatorId("room_type");
		String data10 = getData("Test", 1, 4);
		selectDropDownbyText(findLocatorId, data10);
		
		WebElement clknoofroom = findLocatorId("room_nos");
		String data11 = getData("Test", 1, 5);
		selectDropDownbyText(clknoofroom, data11);
		
		WebElement clkadult = findLocatorId("adult_room");
		String data12 = getData("Test", 1, 8);		
		selectDropDownbyText(clkadult, data12);
		
		WebElement selectchild = findLocatorId("child_room");
		selectOptionByIndex(1, selectchild);
		
		WebElement findLocatorId2 = findLocatorId("Submit");
		click(findLocatorId2);
		Assert.assertTrue("findLocatorId2", true);
		
		WebElement findLocatorId3 = findLocatorId("radiobutton_0");
		click(findLocatorId3);
		
		WebElement findLocatorId4 = findLocatorId("continue");
		click(findLocatorId4);
		Assert.assertTrue("findLocatorId4", true);
		
		WebElement findLocatorId5 = findLocatorId("first_name");
		String data3 = getData("Test", 1, 10);
		sendkey1(findLocatorId5, data3);
		
		WebElement findLocatorId6 = findLocatorId("last_name");
		String data4 = getData("Test", 1, 11);
		sendkey1(findLocatorId6, data4);
		
		WebElement findLocatorId7 = findLocatorId("address");
		String data5 = getData("Test", 1, 12);
		sendkey1(findLocatorId7, data5);
		
		WebElement findLocatorId8 = findLocatorId("cc_num");
		String data6 = getData("Test", 1, 13);
		sendkey1(findLocatorId8, data6);
		
		WebElement findLocatorId9 = findLocatorId("cc_type");
		click(findLocatorId9);
		selectOptionByIndex(2, findLocatorId9);
		
		WebElement findLocatorId10 = findLocatorId("cc_exp_month");
		click(findLocatorId10);
		selectOptionByIndex(9, findLocatorId10);
		
		WebElement findLocatorId11 = findLocatorId("cc_exp_year");
		click(findLocatorId11);
		selectOptionByIndex(12, findLocatorId11);
		
		WebElement findLocatorId12 = findLocatorId("cc_cvv");
		String data7 = getData("Test", 1, 17);
		sendkey1(findLocatorId12, data7);
		
		WebElement findLocatorId13 = findLocatorId("book_now");
		click(findLocatorId13);
		Assert.assertTrue("findLocatorId3", true);
		
		WebElement findLocatorId14 = findLocatorId("order_no");
		String attribute = getAttributevalue(findLocatorId14);
		writeData("Test", 3, 0, attribute);
		Assert.assertTrue("attribute", true);

		
		
		
	}
	
	
	
	
	

}

package com.hello;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Project1 {
	
	public static void main(String[] args) throws IOException {
		
		BaseClass baseclass = new BaseClass();
		BaseClass1 baseclass1 = new BaseClass1();
		
		baseclass.getDriver();
		
		baseclass.enterUrl("https://adactinhotelapp.com/index.php");
		
		baseclass.maximizeWindow();
		baseclass.implicitWait(50);
		
		WebElement txtusername = baseclass.findLocatorId("username");
		String data = baseclass1.getData("Test", 1,0);	
		baseclass.sendkey1(txtusername, data);
		
		WebElement txtpassword = baseclass.findLocatorId("password");
		String data2 = baseclass1.getData("Test", 1,1);
		baseclass.sendkey1(txtpassword, data2);
		
		WebElement clklog = baseclass.findLocatorId("login");
		baseclass.click(clklog);
		
		
		WebElement clkloc = baseclass.findLocatorId("location");
		String data8 = baseclass1.getData("Test", 1, 2);
		baseclass.selectDropDownbyText(clkloc, data8);
	
		
		WebElement clkroomtype = baseclass.findLocatorId("hotels");
		String data9 = baseclass1.getData("Test", 1, 3);
		baseclass.selectDropDownbyText(clkroomtype, data9);
	
		
		WebElement findLocatorId = baseclass.findLocatorId("room_type");
		String data10 = baseclass1.getData("Test", 1, 4);
		baseclass.selectDropDownbyText(findLocatorId, data10);
		
		WebElement clknoofroom = baseclass.findLocatorId("room_nos");
		String data11 = baseclass1.getData("Test", 1, 5);
		baseclass.selectDropDownbyText(clknoofroom, data11);
		
		
//		WebElement clr = baseclass.findElementxpath("//input[@class='date_pick'][1]");
//		baseclass.clear(clr);
//		String data03 = baseclass1.getData("Test", 2, 1);		
//		baseclass.sendkey1(clr, data03);
		
		WebElement clkadult = baseclass.findLocatorId("adult_room");
		String data12 = baseclass1.getData("Test", 1, 8);		
		baseclass.selectDropDownbyText(clkadult, data12);
		
		WebElement selectchild = baseclass.findLocatorId("child_room");
		baseclass.selectOptionByIndex(1, selectchild);
		
		WebElement findLocatorId2 = baseclass.findLocatorId("Submit");
		baseclass.click(findLocatorId2);
		
		WebElement findLocatorId3 = baseclass.findLocatorId("radiobutton_0");
		baseclass.click(findLocatorId3);
		
		WebElement findLocatorId4 = baseclass.findLocatorId("continue");
		baseclass.click(findLocatorId4);
		
		WebElement findLocatorId5 = baseclass.findLocatorId("first_name");
		String data3 = baseclass1.getData("Test", 1, 10);
		baseclass.sendkey1(findLocatorId5, data3);
		
		WebElement findLocatorId6 = baseclass.findLocatorId("last_name");
		String data4 = baseclass1.getData("Test", 1, 11);
		baseclass.sendkey1(findLocatorId6, data4);
		
		WebElement findLocatorId7 = baseclass.findLocatorId("address");
		String data5 = baseclass1.getData("Test", 1, 12);
		baseclass.sendkey1(findLocatorId7, data5);
		
		WebElement findLocatorId8 = baseclass.findLocatorId("cc_num");
		String data6 = baseclass1.getData("Test", 1, 13);
		baseclass.sendkey1(findLocatorId8, data6);
		
		WebElement findLocatorId9 = baseclass.findLocatorId("cc_type");
		baseclass.click(findLocatorId9);
		baseclass.selectOptionByIndex(2, findLocatorId9);
		
		WebElement findLocatorId10 = baseclass.findLocatorId("cc_exp_month");
		baseclass.click(findLocatorId10);
		baseclass.selectOptionByIndex(9, findLocatorId10);
		
		WebElement findLocatorId11 = baseclass.findLocatorId("cc_exp_year");
		baseclass.click(findLocatorId11);
		baseclass.selectOptionByIndex(12, findLocatorId11);
		
		WebElement findLocatorId12 = baseclass.findLocatorId("cc_cvv");
		String data7 = baseclass1.getData("Test", 1, 17);
		baseclass.sendkey1(findLocatorId12, data7);
		
		WebElement findLocatorId13 = baseclass.findLocatorId("book_now");
		baseclass.click(findLocatorId13);
		
		WebElement findLocatorId14 = baseclass.findLocatorId("order_no");
		String attribute = baseclass.getAttributevalue(findLocatorId14);
		baseclass1.writeData("Test", 2, 0, attribute);
	
		
		
		
		
		
		
		
	}
	

}

package com.junit;

import java.io.IOException;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hello.BaseClass;

public class BookingConfirm extends BaseClass {
	
	public BookingConfirm() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="order_no")
	private WebElement takeAttribute;
	
	

	public WebElement getTakeAttribute() {
		return takeAttribute;
	}
//	public WebElement getClkBookedItinerary() {
//		return clkBookedItinerary;
//	}
	public void booking() throws IOException {
		
		String attributevalue = getAttributevalue(getTakeAttribute());
		writeData("Test", 2, 1, attributevalue);
		System.out.println(attributevalue);
		
	}

}

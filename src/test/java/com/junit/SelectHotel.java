package com.junit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hello.BaseClass;

public class SelectHotel extends BaseClass {
	
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement clkRadioBtn;
	
	@FindBy(id="continue")
	private WebElement btnContinue;

	public WebElement getClkRadioBtn() {
		return clkRadioBtn;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}
	
	public void selectHotel() {
		
		click(getClkRadioBtn());
		click(getBtnContinue());
		
	}
	
	
	

}

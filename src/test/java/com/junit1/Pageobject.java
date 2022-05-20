package com.junit1;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hello.BaseClass;

public class Pageobject extends BaseClass {
	
	public Pageobject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id="username")
	private WebElement txtuser;
	
	@CacheLookup
	@FindBy(id="username")
	private WebElement txtCache;
	
	public WebElement getTxtCache() {
		return txtCache;
	}

	public WebElement getTxtuser() {
		return txtuser;
	}
	

}



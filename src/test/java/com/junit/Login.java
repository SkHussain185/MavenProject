package com.junit;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hello.BaseClass;

public class Login extends BaseClass {
	
	public Login() {
		
	PageFactory.initElements(driver,this);
	}
	@FindBy(id="username")
	private WebElement txtUserName;
	
	@FindBy(id="password")
	private WebElement txtPassWord;
	
	@FindBy(id="login")
	private WebElement btnLogin;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassWord() {
		return txtPassWord;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	public void login(String username,String password) {
		
		sendkey1(getTxtUserName(), username);
		sendkey1(getTxtPassWord(), password);
		click(getBtnLogin());
	}
}

	
	
	
	
	



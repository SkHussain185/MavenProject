package com.junit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hello.BaseClass;

public class BookHotelPage extends BaseClass {
	
	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name")
	private WebElement txtFirstName;
	
	@FindBy(id="last_name")
	private WebElement txtLastName;
	
	@FindBy(id="address")
	private WebElement txtAddress;
	
	@FindBy(id="cc_num")
	private WebElement txtCCno;
	
	@FindBy(id="cc_type")
	private WebElement dDnCCType;
	
	@FindBy(id="cc_exp_month")
	private WebElement dDnmonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement dDnYear;
	
	@FindBy(id="cc_cvv")
	private WebElement txtCvv;
	
	@FindBy(id="book_now")
	private WebElement btnBook;

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCCno() {
		return txtCCno;
	}

	public WebElement getdDnCCType() {
		return dDnCCType;
	}

	public WebElement getdDnmonth() {
		return dDnmonth;
	}

	public WebElement getdDnYear() {
		return dDnYear;
	}

	public WebElement getTxtCvv() {
		return txtCvv;
	}

	public WebElement getBtnBook() {
		return btnBook;
	}
	
	public void bookHotel(String firstname,String lastname,String address,String ccno,String cctype,String month,String cvv) {
		sendkey1(getTxtFirstName(), firstname);
		sendkey1(getTxtLastName(), lastname);
		sendkey1(getTxtAddress(), address);
		sendkey1(getTxtCCno(), ccno);
		selectDropDownbyText(getdDnCCType(), cctype);
		selectDropDownbyText(getdDnmonth(), month);
		selectOptionByIndex(12, dDnYear);
		sendkey1(getTxtCvv(), cvv);
		click(getBtnBook());
		
		
		
		

	}
	
	
	

}









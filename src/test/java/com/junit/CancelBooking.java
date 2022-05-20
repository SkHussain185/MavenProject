package com.junit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hello.BaseClass;

public class CancelBooking extends BaseClass {
	
	public CancelBooking() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href=\"BookedItinerary.php\"]")
	private WebElement clkBookedItinerary;
	
	@FindBy(id="order_id_text")
	private WebElement txtSearchOrderId;
	
	@FindBy(id="search_hotel_id")
	private WebElement clkGo;
	
	@FindBy(name="ids[]")
	private WebElement radioBox;
	
	public WebElement getRadioBox() {
		return radioBox;
	}

	@FindBy(name="cancelall")
	private WebElement clkcancel;
	
	public WebElement getClkBookedItinerary() {
		return clkBookedItinerary;
	}
	public WebElement getTxtSearchOrderId() {
		return txtSearchOrderId;
	}

	public WebElement getClkcancel() {
		return clkcancel;
	}

	public WebElement getClkGo() {
		return clkGo;
	}
	
	public void cancelBooking(String searchorderid) throws InterruptedException {
		click(getClkBookedItinerary());
		sendkey1(getTxtSearchOrderId(), searchorderid);
		Thread.sleep(3000);
		click(getClkGo());
		click(getRadioBox());
		Thread.sleep(3000);
		click(getClkcancel());
		alertok();
	}
	

}

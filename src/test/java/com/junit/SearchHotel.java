package com.junit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hello.BaseClass;

public class SearchHotel extends BaseClass {
	
	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement dDnLocation;
	
	@FindBy(id="hotels")
	private WebElement dDnHotels;
	
	@FindBy(id="room_type")
	private WebElement dDnRoomType;
	
	@FindBy(id="room_nos")
	private WebElement dDnRoomNo;
	
	@FindBy(id="datepick_in")
	private WebElement dDnCheckDateIn;
	
	@FindBy(id="datepick_out")
	private WebElement dDnCheckDateOut;
	
	@FindBy(id="adult_room")
	private WebElement dDnAdultRoom;
	
	@FindBy(id="child_room")
	private WebElement dDnChildrenRoom;
	
	@FindBy(id="Submit")
	private WebElement btnSearch;

	public WebElement getdDnLocation() {
		return dDnLocation;
	}

	public WebElement getdDnHotels() {
		return dDnHotels;
	}

	public WebElement getdDnRoomType() {
		return dDnRoomType;
	}

	public WebElement getdDnRoomNo() {
		return dDnRoomNo;
	}

	public WebElement getdDnCheckDateIn() {
		return dDnCheckDateIn;
	}

	public WebElement getdDnCheckDateOut() {
		return dDnCheckDateOut;
	}

	public WebElement getdDnAdultRoom() {
		return dDnAdultRoom;
	}

	public WebElement getdDnChildrenRoom() {
		return dDnChildrenRoom;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}
	
	public void searchHotel(String location,String hotels,String roomtype,String roomno,String checkindate,String checkoutdate,String adultperroom,String childperroom) {

		selectDropDownbyText(getdDnLocation(), location);
		selectDropDownbyText(getdDnHotels(), hotels);
		selectDropDownbyText(getdDnRoomType(), roomtype);
		selectDropDownbyText(getdDnRoomNo(), roomno);
		cleaR(getdDnCheckDateIn());
		sendkey1(getdDnCheckDateIn(), checkindate);
		cleaR(getdDnCheckDateOut());
		sendkey1(getdDnCheckDateOut(), checkoutdate);
		selectDropDownbyText(getdDnAdultRoom(), adultperroom);
		selectDropDownbyText(getdDnChildrenRoom(), childperroom);
		click(getBtnSearch());
		
	}
	
	
	

	
}

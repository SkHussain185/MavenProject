package com.junit;

import java.io.IOException;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.hello.BaseClass;

public class PomWithJunit extends BaseClass {
	
	@BeforeClass
	public static void beforeClass() {
		getDriver();
		enterUrl("https://adactinhotelapp.com/index.php");
		maximizeWindow();
		//implicitWait(40);
	}
	@AfterClass
	  public static void afterClass() {
		//closeAllWindows();
	}
	@Test
	public void test() throws IOException, InterruptedException {
		
		Login login = new Login();
		String username = getData("Test", 1, 0);
		String password = getData("Test", 1, 1);
		login.login(username, password);
		
		SearchHotel hotel = new SearchHotel();
		String location = getData("Test", 1, 2);
		String hotels = getData("Test", 1, 3);
		String roomtype = getData("Test", 1, 4);
		String roomno = getData("Test", 1, 5);
		String checkindate = getData("Test", 1, 6);
		String checkoutdate = getData("Test", 1, 7);
		String adultperroom = getData("Test", 1, 8);
		String childperroom = getData("Test", 1, 9);
		
		hotel.searchHotel(location, hotels, roomtype, roomno, checkindate, checkoutdate, adultperroom, childperroom);
		
		SelectHotel hotel1 = new SelectHotel();
		hotel1.selectHotel();
		
		BookHotelPage page = new BookHotelPage();
		String firstname = getData("Test", 1, 10);
		String lastname = getData("Test", 1, 11);
		String address = getData("Test", 1, 12);
		String ccno = getData("Test", 1, 13);
		String cctype = getData("Test", 1, 14);
		String month = getData("Test", 1, 15);
		//String year = getData("Test", 1, 16);
		String cvv = getData("Test", 1, 17);
		
		page.bookHotel(firstname, lastname, address, ccno, cctype, month, cvv);
		
		Thread.sleep(9000);
		BookingConfirm confirm = new BookingConfirm();
		confirm.booking();
		
		CancelBooking book = new CancelBooking();
		String data = getData("Test", 2, 1);
		book.cancelBooking(data);
		
		
		
		
		
		

	}
	
	
	
	

}

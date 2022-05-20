package com.junit1;

import org.junit.Test;

import com.hello.BaseClass;

public class CacheLookUp extends BaseClass {
	
	@Test
	public void look() throws InterruptedException {
		
		getDriver();
		enterUrl("https://adactinhotelapp.com/index.php");
		maximizeWindow();
		
		Pageobject page = new Pageobject();
		
		sendkey1(page.getTxtuser(), "Hussain");
		
		long starttimeMillis = System.currentTimeMillis();
		
		for (int i = 0; i < 1000; i++) {
			
			String attributevalue = getAttributevalue(page.getTxtuser());
			System.out.println(attributevalue);
		}
		long endtimeMillis = System.currentTimeMillis();
		
		System.out.println("without catch time diff is   "+(endtimeMillis-starttimeMillis)/1000);
		
		Thread.sleep(3000);
		
		cleaR(page.getTxtuser());
		
		sendkey1(page.getTxtCache(), "prasad");
		
		long startmillis = System.currentTimeMillis();
		
		for (int i = 0; i < 1000; i++) {
			
			String attributevalue = getAttributevalue(page.getTxtCache());
		}
		
		long endmillis = System.currentTimeMillis();
		
		System.out.println("catch time diff     "+(endmillis-startmillis)/1000);
	}
	
	
	
	
	

}

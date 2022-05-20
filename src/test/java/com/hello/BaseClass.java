package com.hello;

import java.awt.AWTException;

import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.apache.poi.poifs.nio.CleanerUtil;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	public static WebDriver driver;
	WebElement element;
	static Alert alert;
	
	public static void getDriver() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	}
	public static void enterUrl(String data) {
		driver.get(data);
	}
	public String getUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}
	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}
	public static void sendkey1(WebElement element,String data) {
		element.sendKeys(data);
	}
	public static void click(WebElement element) {
		element.click();
	}
	public static void alertok() {
		alert = driver.switchTo().alert();
		alert.accept();
	}
	public void alertCancel() {
		alert = driver.switchTo().alert();
		alert.dismiss();
	}
	public static WebElement findLocatorId(String Attributename) {
		WebElement element = driver.findElement(By.id(Attributename));
		return element;
	}
	public WebElement findElementName(String Attribute) {
		WebElement element = driver.findElement(By.name(Attribute));
		return element;
	}
	public WebElement findElementClassname(String Attribute) {
		WebElement element = driver.findElement(By.className(Attribute));
		return element;
	}
	public static WebElement findElementxpath(String Attribute) {
		WebElement element = driver.findElement(By.xpath(Attribute));
		return element;
	}
	public static void selectDropDownbyText(WebElement element,String data) {
		Select select = new Select(element);
		select.selectByVisibleText(data);
	}
	public static void selectOptionByIndex(int index,WebElement element) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	public void selectOptionByAttribute(WebElement element,String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}
	public void closeCurrentWindow() {
		driver.close();
	}
	
	public static void closeAllWindows() {
		driver.quit();
	}
	public void sendTextByJs(WebElement element,String text) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].setAttibute('value''text')",element);
	}
	public WebElement switchWindow(String childwindowid) {
		driver.switchTo().window(childwindowid);
		WebElement element = driver.findElement(By.id("id"));
		return element;
	}
	public List<WebElement> findElementsId(String id) {
		List<WebElement> elements = driver.findElements(By.id("id"));
		return elements;
	}
	public List<WebElement> findElementsName(String name) {
		List<WebElement> elements = driver.findElements(By.name("name"));
		return elements;
	}
	public List<WebElement> findElementsClassName() {
		List<WebElement> elements = driver.findElements(By.className("classname"));
		return elements;
	}
	public List<WebElement> findElementsXpath(String data) {
		List<WebElement> elements = driver.findElements(By.xpath("classname"));
		return elements;
	}
	public void navigateLaunchBrowser(String data) {
		driver.navigate().to("facebook");
	}
	public void navigateByForward() {
		driver.navigate().forward();
	}
	public void navigateByBack() {
		driver.navigate().back();
	}
	public void navigateByRefresh() {
		driver.navigate().refresh();
	}
	public WebElement frameByIndex(int index) {
		driver.switchTo().frame(index);
		WebElement findElement = driver.findElement(By.id("id"));
		return findElement;
	}
	public static void implicitWait(int data) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(data));
	}
	public void cleaR(WebElement element) {
		element.clear();
	}
	public static String getAttributevalue(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}
	
	public static void updateData(String sheetname,int rownum,int cellnum,String setcellvalue) throws IOException {
		
		File file = new File("C:\\Users\\Mounika\\eclipse-workspace\\Hello\\Excel\\Data1.xlsx");
		
		FileInputStream stream = new FileInputStream(file);
		
		Workbook workbook = new XSSFWorkbook(stream);
		
		Sheet sheet = workbook.getSheet("Test");
		
		Row row = sheet.getRow(rownum);
		
		Cell cell = row.getCell(cellnum);
		
		String Value = cell.getStringCellValue();
		
		if(Value.equals("updatedata"))
		{
		cell.setCellValue("updat");
		}
		else
		System.out.println("cant update");
		FileOutputStream out1 = new FileOutputStream(file);
		
		workbook.write(out1);
	}
	
		public static void writeData(String sheetname,int rownum,int cellnum,String data) throws IOException {
		
		File file = new File("C:\\Users\\Mounika\\eclipse-workspace\\Hello\\Excel\\hoteldata.xlsx");
		
		FileInputStream stream = new FileInputStream(file);
		
		Workbook workbook = new XSSFWorkbook(stream);
		
		Sheet sheet = workbook.getSheet("Test");
		
		//Row row = sheet.getRow(rownum);
		Row row = sheet.createRow(rownum);
		
		Cell createCell = row.createCell(cellnum);
		
		createCell.setCellValue(data);
		
		FileOutputStream stream1 = new FileOutputStream(file);
		
		workbook.write(stream1);
	}
		public static String getData(String sheetname,int rownum,int cellnum) throws IOException {
		String data = null;
		
		File file = new File("C:\\Users\\Mounika\\eclipse-workspace\\Hello\\Excel\\hoteldata.xlsx");
		
		FileInputStream stream = new FileInputStream(file);
		
		Workbook workbook = new XSSFWorkbook(stream);
		
		Sheet sheet = workbook.getSheet("Test");
		
		Row row = sheet.getRow(rownum);
		
		Cell cell = row.getCell(cellnum);
		
		CellType type = cell.getCellType();
		
		switch (type) {
		case STRING:
			data = cell.getStringCellValue();
			System.out.println(data);
			break;
		case NUMERIC:		
			if (DateUtil.isCellDateFormatted(cell)) {
			Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
			data = dateformat.format(dateCellValue);
			System.out.println(data);
			}
			else
			{
				double d = cell.getNumericCellValue();
				BigDecimal valueOf = BigDecimal.valueOf(d);
				data = valueOf.toString();
				System.out.println(data);	
			}
		default:
			break;
		}
		return data;
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



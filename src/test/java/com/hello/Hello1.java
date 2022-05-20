package com.hello;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hello1 
{
	public static void main(String[] args) throws IOException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement findElement = driver.findElement(By.xpath("//a[text()='Signup here']"));
		findElement.click();
		WebElement findElement2 = driver.findElement(By.xpath("//select[@name='month']"));
		findElement2.click();
		Select select = new Select(findElement2);
		File file = new File("C:\\Users\\Mounika\\eclipse-workspace\\Hello\\Excel\\prasad.xlsx");
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("Test");
		
		List<WebElement> options = select.getOptions();
		for (int i = 0; i < options.size(); i++)
		{
			WebElement element = options.get(i);
			String text = element.getText();
			Row createRow2 = sheet.createRow(i);	
			Cell cell = createRow2.createCell(0);
			cell.setCellValue(text);
			FileOutputStream stream = new FileOutputStream(file);
			workbook.write(stream);
	}
					
//		for (WebElement webElement : options) 
//		{
//			String text = webElement.getText();
//		//	System.out.println(text);
//			File file = new File("C:\\Users\\Mounika\\eclipse-workspace\\Hello\\Excel\\prasad.xlsx");
//			Workbook workbook = new XSSFWorkbook();
//			Sheet sheet = workbook.createSheet("Test");
//			Row createRow = sheet.createRow(0);
//			Cell createCell = createRow.createCell(0);
//			
//			createCell.setCellValue(text);
//			FileOutputStream stream = new FileOutputStream(file);
//			workbook.write(stream);
	}
	}

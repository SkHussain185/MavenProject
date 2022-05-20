package com.hello;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BaseClass1 
{
	public void updateData(String sheetname,int rownum,int cellnum,String setcellvalue) throws IOException {
			
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
	
		public void writeData(String sheetname,int rownum,int cellnum,String data) throws IOException {
		
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
		public String getData(String sheetname,int rownum,int cellnum) throws IOException {
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
			SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMM-yyyy");
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

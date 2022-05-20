package com.hello;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

public class Hello 

{
	public static void main(String[] args) throws IOException 
	{
		File file = new File("C:\\Users\\Mounika\\eclipse-workspace\\Hello\\Excel\\Data1.xlsx");
		
		FileInputStream stream = new FileInputStream(file) ;
		
		Workbook workbook = new XSSFWorkbook(stream);
		
		Sheet sheet = workbook.getSheet("sheet1");
		
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) 
		{
			Row row = sheet.getRow(i);
			System.out.println();
			
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) 
			{
			    Cell cell = row.getCell(j);
			//	System.out.println();
			    CellType Type = cell.getCellType();
			    //System.out.println(Type);
			
			    switch (Type) {
				case STRING:
					String stringCellValue = cell.getStringCellValue();
					System.out.print(stringCellValue+"\t"+"\t");
				//	System.out.println();
					break;
				case NUMERIC:
					if(DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat simpleDateFormat = new SimpleDateFormat("DD-MMM-YY");
					String format = simpleDateFormat.format(dateCellValue);
					System.out.print(format+"\t"+"\t");
				//	System.out.println();
			    }
				
			    else
			    {
			    	double d = cell.getNumericCellValue();
			    	BigDecimal b = BigDecimal.valueOf(d);
			    	String string = b.toString();
			    	System.out.print(string+"\t");
			    //	System.out.println();
			    	}
					break;

				default:
					break;
					
			}
				}			
			}	
		}
}

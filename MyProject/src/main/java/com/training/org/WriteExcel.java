package com.training.org;

import java.io.FileOutputStream;

//import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//import abc.poi.ss.usermodel.Cell;


//import abc.poi.ss.usermodel.Cell;

public class WriteExcel {

	public static void main(String[] args) {
		XSSFWorkbook workbook = new XSSFWorkbook(); 

		//Create a blank sheet
		XSSFSheet sheet = workbook.createSheet("Employee Data");

		//Prepare data to be written as an Object[]

//		Map<String, Object[]> data = new TreeMap<String, Object[]>();
//		data.put("1", new Object[] {"ID", "NAME", "LASTNAME"});
//		data.put("2", new Object[] {1, "Amit", "Shukla"});
//		data.put("3", new Object[] {2, "Lokesh", "Gupta"});
//		data.put("4", new Object[] {3, "John", "Adwards"});
//		data.put("5", new Object[] {4, "Brian", "Schultz"});

		//Iterate over data and write to sheet

//		Set<String> keyset = data.keySet();
//		int rownum = 0;
//		for (String key : keyset) {
//			Row row = sheet.createRow(rownum++);
//			Object [] objArr = data.get(key);
//			int cellnum = 0;
//			for (Object obj : objArr)
//			{
//				Cell cell = row.createCell(cellnum++);
//				if(obj instanceof String)
//					cell.setCellValue((String)obj);
//				else if(obj instanceof Integer)
//					cell.setCellValue((Integer)obj);
//			}
//		}
		
		
		Row row=sheet.createRow(0);
		Cell cell = row.createCell(0);
		cell.setCellValue(100);
		
		
		Cell cell2 = row.createCell(1);
		cell2.setCellValue("Eshan");
		

		//Write the workbook in file system

		try {
			FileOutputStream out = new FileOutputStream(new String("employee1.xlsx"));
			workbook.write(out);
			out.close();
			System.out.println("employee.xlsx written successfully on disk.");
		} 
		catch (Exception e) {
			e.printStackTrace();
		}



	}
}

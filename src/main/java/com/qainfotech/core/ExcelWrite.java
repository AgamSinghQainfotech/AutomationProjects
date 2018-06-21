package com.qainfotech.core;

import java.io.File;

import java.io.FileInputStream;

import java.io.FileOutputStream;

import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelWrite {
	
	    public void writeExcel(String filePath,String fileName,String sheetName,List listData) throws IOException{

	    

	       File file =    new File(filePath+"/"+fileName);

	          FileInputStream inputStream = new FileInputStream(file);

	        Workbook workbookExample = null;

	       

	        String fileExtensionName = fileName.substring(fileName.indexOf("."));

	        

	        if(fileExtensionName.equals(".xlsx")){

	       

	        	workbookExample = new XSSFWorkbook(inputStream);

	        }

	       

	        else if(fileExtensionName.equals(".xls")){

	          

	        	workbookExample = new HSSFWorkbook(inputStream);

	        }

	        

	    

	    Sheet sheet = workbookExample.getSheet(sheetName);

	    

	    int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();


	    Row row = sheet.getRow(0);

	   

	    Row newRow = sheet.createRow(rowCount+1);

	    

	    for(int j = 0; j < row.getLastCellNum(); j++){

	        

	        Cell cell = newRow.createCell(j);

	        cell.setCellValue(listData.indexOf(j));

	    }

	    inputStream.close();

	    

	    FileOutputStream outputStream = new FileOutputStream(file);


	    workbookExample.write(outputStream);


	    outputStream.close();

	    

	    }

	    
}

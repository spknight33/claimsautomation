package com.big.automation.selenium_webdriver.common.utilities.excelutils;



	import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.Platform;
	 
	import java.io.FileInputStream;

	import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import static com.big.automation.selenium_webdriver.common.baseTest.BaseTest.testDataExcelFilename;
	
	public class ExcelUtil {
		
		private static Map<String, String> testDataMap = new HashMap<>();

		
	    //Main Directory of the project
	    public static final String currentDir = System.getProperty("user.dir");
	 
	    //Location of Test data excel file
	    public static String testDataExcelPath = null;
	 
	    //Excel WorkBook
	    private static XSSFWorkbook excelWBook;
	 
	    //Excel Sheet
	    private static XSSFSheet excelWSheet;
	 
	    //Excel cell
	    private static XSSFCell cell;
	 
	    //Excel row
	    private static XSSFRow row;
	 
	    //Row Number
	    public static int rowNumber;
	 
	    //Column Number
	    public static int columnNumber;
	 
	    //Setter and Getters of row and columns
	    public static void setRowNumber(int pRowNumber) {
	        rowNumber = pRowNumber;
	    }
	 
	    public static int getRowNumber() {
	        return rowNumber;
	    }
	 
	    public static void setColumnNumber(int pColumnNumber) {
	        columnNumber = pColumnNumber;
	    }
	 
	    public static int getColumnNumber() {
	        return columnNumber;
	    }
	 
	    // This method has two parameters: "Test data excel file name" and "Excel sheet name"
	    // It creates FileInputStream and set excel file and excel sheet to excelWBook and excelWSheet variables.
	    public static void setExcelFileSheet(String sheetName) throws Throwable {
	        //MAC or Windows Selection for excel path
	        if (Platform.getCurrent().toString().equalsIgnoreCase("MAC")) {
	            testDataExcelPath = currentDir + "//src//test//resources//";
	        } else if (Platform.getCurrent().toString().contains("WIN")) {
	            testDataExcelPath = currentDir + "\\src\\test\\resources\\";
	        }
	        try {
	            // Open the Excel file
	            FileInputStream ExcelFile = new FileInputStream(testDataExcelPath + testDataExcelFilename);
	            excelWBook = new XSSFWorkbook(ExcelFile);
	            System.out.println("set the excel workbook");
	            excelWSheet = excelWBook.getSheet(sheetName);
	            if (excelWSheet == null)
	            {throw new Exception("Failed to find the worksheet <"+sheetName+"> in the file<"+testDataExcelPath + testDataExcelFilename+">");
	            
	            }
	            
	            // now load all the fields into the hashmap
	            populateMap(excelWSheet);
	            
	        } catch (Exception e) {
	            try {
	                throw (e);
	            } catch (IOException e1) {
	                e1.printStackTrace();
	            }
	        }
	    }
	    
	    private static void populateMap(XSSFSheet sheet)
	    {
	    	String key = "";
	    	String value="";
	    	testDataMap = new HashMap<>();
	    	int rows = sheet.getPhysicalNumberOfRows();
	    	 for(int i=0;i<rows;i++){
	    		 
	    		 
	    		 DataFormatter dataFormatter = new DataFormatter(Locale.UK);
	    		
	    	     key = dataFormatter.formatCellValue(sheet.getRow(i).getCell(0));
	    	     value = dataFormatter.formatCellValue(sheet.getRow(i).getCell(1));
	    		 testDataMap.put(key,
	    				 value);
	    		 System.out.println("/n entry added to map: <"+key+"><"+value+">");
	    	
	    }
	    }
	    
	    public static String getTestDataValue(String parameter)
	    {
	      return testDataMap.get(parameter);
	    }
	    
	    
	 
	    //This method reads the test data from the Excel cell.
	    //We are passing row number and column number as parameters.
	    /*public static String getCellData(int RowNum, int ColNum) {
	        try {
	            cell = excelWSheet.getRow(RowNum).getCell(ColNum);
	            DataFormatter formatter = new DataFormatter();
	            String cellData = formatter.formatCellValue(cell);
	            return cellData;
	        } catch (Exception e) {
	            throw (e);
	        }
	    }*/
	 
	    //This method takes row number as a parameter and returns the data of given row number.
	    /*public static XSSFRow getRowData(int RowNum) {
	        try {
	            row = excelWSheet.getRow(RowNum);
	            return row;
	        } catch (Exception e) {
	            throw (e);
	        }
	    }*/
	}

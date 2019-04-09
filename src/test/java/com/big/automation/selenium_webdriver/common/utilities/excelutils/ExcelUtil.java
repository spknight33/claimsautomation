package com.big.automation.selenium_webdriver.common.utilities.excelutils;

import static com.big.automation.selenium_webdriver.common.baseTest.BaseTest.testDataExcelFilename;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Platform;

public class ExcelUtil {

	private static Map<String, String> testDataMap = new HashMap<>();

	// Main Directory of the project
	public static final String currentDir = System.getProperty("user.dir");
	public static String testDataExcelSheet=null;

	// Location of Test data excel file
	public static String testDataExcelPath = null;
	
	public static final String BRAND_ITB="ITB";
	public static final String BRAND_TBB="TBB";
	public static final String BRAND_DGT="DGT";

	// Excel WorkBook
	private static XSSFWorkbook excelWBook;

	// Excel Sheet
	private static XSSFSheet excelWSheet;

	// Excel cell
	private static XSSFCell cell;

	// Excel row
	private static XSSFRow row;

	// Row Number
	public static int rowNumber;

	// Column Number
	public static int columnNumber;

	// Setter and Getters of row and columns
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

	/**
	 * 
	 * @param sheetName
	 * @param Brand
	 * @throws Throwable
	 */
	public static void setExcelFileSheet(String sheetName, String brand) throws Throwable {
		testDataExcelSheet = sheetName;
		// MAC or Windows Selection for excel path
		//TODO sort the filepath out
		if (Platform.getCurrent().toString().equalsIgnoreCase("MAC")) {
			testDataExcelPath = currentDir + "//src//test//resources//";
		} else if (Platform.getCurrent().toString().contains("WIN")) {
			testDataExcelPath = currentDir + "\\src\\test\\resources\\";
		}
		try {
			// Open the Excel file
			FileInputStream ExcelFile = new FileInputStream(testDataExcelPath + testDataExcelFilename);
			excelWBook = new XSSFWorkbook(ExcelFile);
			System.out.println("/n Set the excel workbook");
			
			// first we need to get the variable policy data from the policydata sheet for the test case sheet
			// TODO so that we can read a list of policy details for different sheets, currently all testcases use the same policy
			
			if (brand == null)
				 throw new Exception("Brand is null, but is needed to find the correct column in the POLICYDATA sheet");
			
			excelWSheet = excelWBook.getSheet("POLICYDATA");
			if (excelWSheet == null) {
				throw new Exception("Failed to find the worksheet <" + sheetName + "> in the file<" + testDataExcelPath
						+ testDataExcelFilename + ">");

			}
			setPolicyFields(excelWSheet,sheetName,brand);
			
			
			excelWSheet = excelWBook.getSheet(sheetName);
			if (excelWSheet == null) {
				throw new Exception("Failed to find the worksheet <" + sheetName + "> in the file<" + testDataExcelPath
						+ testDataExcelFilename + ">");

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
	
	private static void setPolicyFields(XSSFSheet policySheet,String testSheetName,String brand) {
		//this will read the policydata sheet to get:
		// If TEST or DEV run(to be removed and put into automation config)
		// read the records and find the appropriate dev or test entry for the appropriate sheet
		// get the policy number etc for that entry
		String key = "";
		String value1 = "";
		String value2 = "";
		String value3 = "";
		String value4 = "";
		String value5 = "";
		String value6 = "";
		String value7 = "";
		String value8 = "";
		String value9 = "";
		String value10 = "";
		String value11 = "";
		String value12 = "";
		String value13 = "";
		String value14 = "";
		
		testDataMap = new HashMap<>(); // reset the map - we are going to add some data to it here
		
		XSSFRow row = null;

		XSSFFormulaEvaluator formulaeval = excelWBook.getCreationHelper().createFormulaEvaluator();

		XSSFCell keyCell0 = null;
		XSSFCell valueCell1 = null;
		XSSFCell valueCell2 = null;
		XSSFCell valueCell3 = null;
		XSSFCell valueCell4 = null;
		XSSFCell valueCell5 = null;
		XSSFCell valueCell6 = null;
		XSSFCell valueCell7 = null;
		XSSFCell valueCell8 = null;
		XSSFCell valueCell9 = null;
		XSSFCell valueCell10 = null;
		XSSFCell valueCell11 = null;
		XSSFCell valueCell12 = null;
		XSSFCell valueCell13 = null;
		XSSFCell valueCell14 = null;
	
		
		int rows = policySheet.getLastRowNum() + 1;

		System.out.println("Rows to process:" + rows);
		String devortest = "";
		for (int i = 0; i < rows; i++) {

			DataFormatter dataFormatter = new DataFormatter(Locale.UK);
			key = null;
			value1 = null;
			value2 = null;
			value3 = null;
			value4 = null;
			value5 = null;
			value6 = null;
			value7 = null;
			value8 = null;
			value9 = null;
			value10 = null;
			value11 = null;
			value12 = null;
			value13 = null;
			value14 = null;
			
			row = policySheet.getRow(i);

			if (row != null) {
				keyCell0 = row.getCell(0);
				valueCell1 = row.getCell(1);
				valueCell2 = row.getCell(2);
				valueCell3 = row.getCell(3);
				valueCell4 = row.getCell(4);
				valueCell5 = row.getCell(5);
				valueCell6 = row.getCell(6);
				valueCell7 = row.getCell(7);
				valueCell8 = row.getCell(8);
				valueCell9 = row.getCell(9);
				valueCell10 = row.getCell(10);
				valueCell11 = row.getCell(11);
				valueCell12 = row.getCell(12);
				valueCell13 = row.getCell(13);
				valueCell14 = row.getCell(14);
				
			}

			if (keyCell0 != null) 
				key = dataFormatter.formatCellValue(keyCell0, formulaeval);
			if (valueCell1 != null) 
				value1 = dataFormatter.formatCellValue(valueCell1, formulaeval);
			if (valueCell2 != null) 
				value2 = dataFormatter.formatCellValue(valueCell2, formulaeval);
			if (valueCell3 != null) 
				value3 = dataFormatter.formatCellValue(valueCell3, formulaeval);
			if (valueCell4 != null) 
				value4 = dataFormatter.formatCellValue(valueCell4, formulaeval);
			if (valueCell5 != null) 
				value5 = dataFormatter.formatCellValue(valueCell5, formulaeval);
			if (valueCell6 != null) 
				value6 = dataFormatter.formatCellValue(valueCell6, formulaeval);
			if (valueCell7 != null) 
				value7 = dataFormatter.formatCellValue(valueCell7, formulaeval);
			if (valueCell8 != null) 
				value8 = dataFormatter.formatCellValue(valueCell8, formulaeval);
			if (valueCell9 != null) 
				value9 = dataFormatter.formatCellValue(valueCell9, formulaeval);
			if (valueCell10 != null) 
				value10 = dataFormatter.formatCellValue(valueCell10, formulaeval);
			if (valueCell11 != null) 
				value11 = dataFormatter.formatCellValue(valueCell11, formulaeval);
			if (valueCell12 != null) 
				value12 = dataFormatter.formatCellValue(valueCell12, formulaeval);
			if (valueCell13 != null) 
				value13 = dataFormatter.formatCellValue(valueCell13, formulaeval);
			if (valueCell14 != null) 
				value14 = dataFormatter.formatCellValue(valueCell14, formulaeval);
			
			if (key!=null && !key.isEmpty() && value1 != null && !value1.isEmpty()) {
				    // check if devortest field
				 if (key.equalsIgnoreCase("DevOrTstEnvironment"))
				 {
				    	devortest = value1;
				    	System.out.println("found devortest:"+devortest);
				    	testDataMap.put("DevOrTstEnvironment", devortest.trim());
		    			System.out.println("entry added to map for DevOrTstEnvironment:"+devortest);
				 }
				 else
				 {
					 
				    if (!devortest.equalsIgnoreCase(""))
				    {
				    	// we must have dev or test set
				    	if (key != null && key.equalsIgnoreCase(devortest)) {
				    	// this is a matching dev or test entry, but is it a matching sheet entry
				    		if (value1 !=null && value1.equalsIgnoreCase(testSheetName))
				    		{
				    			// this is the matching dev or test entry for the testsheetname, so use it
				    			
				    			switch(brand)
				    			{
				    			case(BRAND_ITB):
					    			testDataMap.put("Fnol_PolicyNumber", value2.trim());
					    			System.out.println("entry added to map for ITB Fnol_PolicyNumber:"+value2);
					    			testDataMap.put("Fnol_Name", value3.trim());
					    			System.out.println("entry added to map for ITB Fnol_Name:"+value3);
					    			testDataMap.put("Fnol_Named_Driver", value4.trim());
					    			System.out.println("entry added to map for ITB Fnol_Named_Driver:"+value4);
					    			testDataMap.put("Fnol_Insured_Address", value5.trim());
					    			System.out.println("entry added to map for ITB Fnol_Insured_Address:"+value5);
					    			break;
				    			case(BRAND_TBB):
					    			testDataMap.put("Fnol_PolicyNumber", value6.trim());
					    			System.out.println("entry added to map for TBB Fnol_PolicyNumber:"+value6);
					    			testDataMap.put("Fnol_Name", value7.trim());
					    			System.out.println("entry added to map for TBB Fnol_Name:"+value7);
					    			testDataMap.put("Fnol_Named_Driver", value8.trim());
					    			System.out.println("entry added to map for TBB Fnol_Named_Driver:"+value8);
					    	  			testDataMap.put("Fnol_Insured_Address", value9.trim());
					    			System.out.println("entry added to map for TBB Fnol_Insured_Address:"+value9);
					    			break;
				    			case(BRAND_DGT):
					    			testDataMap.put("Fnol_PolicyNumber", value10.trim());
					    			System.out.println("entry added to map for DGT Fnol_PolicyNumber:"+value10);
					    			testDataMap.put("Fnol_Name", value11.trim());
					    			System.out.println("entry added to map for DGT Fnol_Name:"+value11);
					    			testDataMap.put("Fnol_Named_Driver", value12.trim());
					    			System.out.println("entry added to map for DGT Fnol_Named_Driver:"+value12);
					    			testDataMap.put("Fnol_Insured_Address", value13.trim());
					    			System.out.println("entry added to map for DGT Fnol_Insured_Address:"+value13);
					    			break;
				    			
				    			}
				    			
				    			if (value14 ==null || value14.isEmpty())
				    			{
				    				// not in sheet so use todays date
				    				
				    				Calendar cal = Calendar.getInstance();
				    			    cal.setTime(new Date());
				    			    value14 = new SimpleDateFormat("dd/MM/yyyy").format(cal.getTime());
				    			    System.out.println("Using todays date as loss date");
				    			}
				    			
				    			testDataMap.put("Fnol_Step1_LossDate", value14.trim());
				    			System.out.println("entry added to map for Fnol_Step1_LossDate:"+value14);
				    			break;
				    		}
						}
				    }
				 }
				 
					
					
				} else {
					if (key != null && !key.isEmpty())
						System.out.println("Comment:" + key);
				}
			

		}
	}

	private static void populateMap(XSSFSheet sheet) {
		String key = "";
		String value = "";
		String enabled = "";
		//testDataMap = new HashMap<>();
		XSSFRow row = null;

		XSSFFormulaEvaluator formulaeval = excelWBook.getCreationHelper().createFormulaEvaluator();

		XSSFCell keyCell = null;
		XSSFCell valueCell = null;
		XSSFCell enabledCell = null;
		int rows = sheet.getLastRowNum() + 1;

		System.out.println("Rows to process:" + rows);
		for (int i = 0; i < rows; i++) {

			DataFormatter dataFormatter = new DataFormatter(Locale.UK);
			key = null;
			value = null;
			enabled = null;

			row = sheet.getRow(i);

			if (row != null) {
				keyCell = row.getCell(0);
				valueCell = row.getCell(1);
				enabledCell = row.getCell(2); // enabled switch
			}

			if (keyCell != null) {
				key = dataFormatter.formatCellValue(keyCell, formulaeval);
			}
			if (valueCell != null) {
				value = dataFormatter.formatCellValue(valueCell, formulaeval);
			}
			if (enabledCell != null) {
				enabled = dataFormatter.formatCellValue(enabledCell, formulaeval);
			}

			if (enabled != null && enabled.equalsIgnoreCase("N")) {
				// not enabled so dont use
				System.out.println("Not enabled:" + key);
			} else {

				if (value != null && !value.isEmpty()) {
					testDataMap.put(key.trim(), value.trim());
					System.out.println("entry added to map: <" + key.trim() + "><" + value.trim() + ">");
				} else {
					if (key != null && !key.isEmpty())
						System.out.println("Comment:" + key);
				}
			}

		}
	}

	public static String getTestDataValue(String parameter) {
		return testDataMap.get(parameter);
	}

	private static String getTestDataExcelPath() {
		return testDataExcelPath;
	}

	// This method reads the test data from the Excel cell.
	// We are passing row number and column number as parameters.
	/*
	 * public static String getCellData(int RowNum, int ColNum) { try { cell =
	 * excelWSheet.getRow(RowNum).getCell(ColNum); DataFormatter formatter = new
	 * DataFormatter(); String cellData = formatter.formatCellValue(cell); return
	 * cellData; } catch (Exception e) { throw (e); } }
	 */

	// This method takes row number as a parameter and returns the data of given row
	// number.
	/*
	 * public static XSSFRow getRowData(int RowNum) { try { row =
	 * excelWSheet.getRow(RowNum); return row; } catch (Exception e) { throw (e); }
	 * }
	 */
	
	
}

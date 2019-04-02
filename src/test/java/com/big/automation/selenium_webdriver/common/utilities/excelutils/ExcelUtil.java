package com.big.automation.selenium_webdriver.common.utilities.excelutils;

import static com.big.automation.selenium_webdriver.common.baseTest.BaseTest.testDataExcelFilename;

import java.io.FileInputStream;
import java.io.IOException;
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

	// This method has two parameters: "Test data excel file name" and "Excel sheet
	// name"
	// It creates FileInputStream and set excel file and excel sheet to excelWBook
	// and excelWSheet variables.
	public static void setExcelFileSheet(String sheetName) throws Throwable {
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
			
			excelWSheet = excelWBook.getSheet("POLICYDATA");
			if (excelWSheet == null) {
				throw new Exception("Failed to find the worksheet <" + sheetName + "> in the file<" + testDataExcelPath
						+ testDataExcelFilename + ">");

			}
			setPolicyFields(excelWSheet,sheetName);
			
			
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
	
	private static void setPolicyFields(XSSFSheet policySheet,String testSheetName) {
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
		
		testDataMap = new HashMap<>(); // reset the map - we are going to add some data to it here
		
		XSSFRow row = null;

		XSSFFormulaEvaluator formulaeval = excelWBook.getCreationHelper().createFormulaEvaluator();

		XSSFCell keyCell0 = null;
		XSSFCell valueCell1 = null;
		XSSFCell valueCell2 = null;
		XSSFCell valueCell3 = null;
		XSSFCell valueCell4 = null;
		XSSFCell valueCell5 = null;
	
		
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
			

			row = policySheet.getRow(i);

			if (row != null) {
				keyCell0 = row.getCell(0);
				valueCell1 = row.getCell(1);
				valueCell2 = row.getCell(2);
				valueCell3 = row.getCell(3);
				valueCell4 = row.getCell(4);
				valueCell5 = row.getCell(5);
				
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
				    			
				    			testDataMap.put("Fnol_PolicyNumber", value2.trim());
				    			System.out.println("entry added to map for Fnol_PolicyNumber:"+value2);
				    			testDataMap.put("Fnol_Name", value3.trim());
				    			System.out.println("entry added to map for Fnol_Name:"+value3);
				    			testDataMap.put("Fnol_Insured_Address", value4.trim());
				    			System.out.println("entry added to map for Fnol_Insured_Address:"+value4);
				    			testDataMap.put("Fnol_Step1_LossDate", value5.trim());
				    			System.out.println("entry added to map for Fnol_Step1_LossDate:"+value5);
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

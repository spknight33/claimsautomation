package com.big.automation.selenium_webdriver.common.extent_reports;

 import com.aventstack.extentreports.ExtentReports;
 import com.aventstack.extentreports.ExtentTest;
 import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentManager {

    private static ExtentReports extent;
    private static ExtentTest logger;
    public static ExtentHtmlReporter htmlReporter;
    private static String filePath = "./extentreport.html";


    public static ExtentReports GetExtent(){
        if (extent != null)
            return extent; //avoid creating new instance of html file
        extent = new ExtentReports();
        extent.attachReporter(getHtmlReporter());
        return extent;
    }

    private static ExtentHtmlReporter getHtmlReporter() {

        htmlReporter = new ExtentHtmlReporter(filePath);

        // make the charts visible on report open
        htmlReporter.config().setChartVisibilityOnOpen(true);

        htmlReporter.config().setDocumentTitle("Smoke Test");
        htmlReporter.config().setReportName("Smoke Test");
        return htmlReporter;
    }

    public static ExtentTest createTest(String name, String description){
        logger = extent.createTest(name, description);
        return logger;
    }
}

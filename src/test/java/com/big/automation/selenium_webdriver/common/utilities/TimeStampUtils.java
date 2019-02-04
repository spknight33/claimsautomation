package com.big.automation.selenium_webdriver.common.utilities;

//com.big.automation.selenium_webdriver.common.utilities.TimeStampUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;

public class TimeStampUtils {

   
	public static String timeHoursMinutes() throws Exception {

	      Calendar cal = Calendar.getInstance();
	      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	      String strDate = sdf.format(cal.getTime());
	      //System.out.println("Current date in String Format: " + strDate);

	     // SimpleDateFormat sdf1 = new SimpleDateFormat();
	     // sdf1.applyPattern("dd/MM/yyyy HH:mm:ss");
	      Date date = sdf.parse(strDate);
	      String timestamp = sdf.format(date);
	      System.out.println("Current date in Date Format: " + timestamp);
	      return timestamp;
	   }
	
	public static String timeStandardStamp() throws Exception {

      Calendar cal = Calendar.getInstance();
      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SS");
      String strDate = sdf.format(cal.getTime());
      //System.out.println("Current date in String Format: " + strDate);

      SimpleDateFormat sdf1 = new SimpleDateFormat();
      sdf1.applyPattern("dd/MM/yyyy HH:mm:ss");
      Date date = sdf1.parse(strDate);
      String timestamp = sdf1.format(date);
      //System.out.println("Current date in Date Format: " + timestamp);
      return timestamp;
   }

   public static void scpMtaCanxTimePlusHours(WebDriver webDriver, WebElement hourElement, WebElement minuteElement, WebElement dayElement, WebElement monthElement, WebElement yearElement, Integer hoursToAdd) {

      Calendar cal = Calendar.getInstance();
      cal.setTime(new Date());
      cal.add(Calendar.HOUR_OF_DAY, hoursToAdd);
      SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyyHHmmss");
      String timePlusOneStamp = sdf.format(cal.getTime());
      String hours = timePlusOneStamp.substring(8, 10);
      String minutes = timePlusOneStamp.substring(10, 12);
      String day = timePlusOneStamp.substring(0, 2);
      String month = timePlusOneStamp.substring(2, 4);
      String year = timePlusOneStamp.substring(4, 8);
      WaitForUtils.waitForElementToBeVisible(webDriver, hourElement);
      WaitForUtils.waitForElementToBeClickable(webDriver, hourElement);
      hourElement.clear();
      minuteElement.clear();
      dayElement.clear();
      monthElement.clear();
      yearElement.clear();
      sleep(1);
      hourElement.sendKeys(hours);
      minuteElement.sendKeys(minutes);
      dayElement.sendKeys(day);
      monthElement.sendKeys(month);
      yearElement.sendKeys(year);
      sleep(1);
     /*
        System.out.println("hours " + hours);
        System.out.println("minutes " + minutes);
        System.out.println("day " + day);
        System.out.println("month " + month);
        System.out.println("year " + year);
     */
   }

   public static void scpMtaCanxTimePlusDays(WebDriver webDriver, WebElement hourElement, WebElement minuteElement, WebElement dayElement, WebElement monthElement, WebElement yearElement, Integer daysToAdd) {

      Calendar cal = Calendar.getInstance();
      cal.setTime(new Date());
      cal.add(Calendar.DAY_OF_MONTH, daysToAdd);
      SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyyHHmmss");
      String timePlusOneStamp = sdf.format(cal.getTime());
      String hours = timePlusOneStamp.substring(8, 10);
      String minutes = timePlusOneStamp.substring(10, 12);
      String day = timePlusOneStamp.substring(0, 2);
      String month = timePlusOneStamp.substring(2, 4);
      String year = timePlusOneStamp.substring(4, 8);
      WaitForUtils.waitForElementToBeVisible(webDriver, hourElement);
      WaitForUtils.waitForElementToBeClickable(webDriver, hourElement);
      hourElement.clear();
      minuteElement.clear();
      dayElement.clear();
      monthElement.clear();
      yearElement.clear();
      sleep(1);
      hourElement.sendKeys(hours);
      minuteElement.sendKeys(minutes);
      dayElement.sendKeys(day);
      monthElement.sendKeys(month);
      yearElement.sendKeys(year);
      sleep(1);
     /*
        System.out.println("hours " + hours);
        System.out.println("minutes " + minutes);
        System.out.println("day " + day);
        System.out.println("month " + month);
        System.out.println("year " + year);
     */
   }


   public static String currentMonthForSagepayExpiry() throws Exception {

      String timeStamp = new SimpleDateFormat("MM").format(new Date());
      return timeStamp;
   }

   public static String currentYearForSagepayExpiry() throws Exception {

      String timeStamp = new SimpleDateFormat("YYYY").format(new Date());
      return timeStamp;
   }

   public static String createTimeStamp(String pattern) {

      String timeStamp = new SimpleDateFormat(pattern).format(new Date());
      return timeStamp;
   }

   //Time stamp is in this pattern on email to identify automation users for OTDS user deletion
   public static String createEmailTimeStamp() {

      String timeStamp = new SimpleDateFormat("ssmmHHddMMyyyy").format(new Date());
      return timeStamp;
   }

   //Time stamp is in this pattern on email to identify automation users for OTDS user deletion
   public static String createEmailAddressWithTimeStamp(String timeStamp) {

      return String.format("Test-%s@bigggg.com", timeStamp);
   }

   //Time stamp is in this pattern to populate the effective time (hours) text box as part of MTA in SCP.
   public static String createEffectiveHourTimeStamp() {

      String hourTimeStamp = new SimpleDateFormat("HH").format(new Date());
      return hourTimeStamp;
   }

   //Time stamp is in this pattern to populate the effective time (minutes) text box as part of MTA in SCP.
   public static String createEffectiveMinutesTimeStamp() {

      String minutesTimeStamp = new SimpleDateFormat("mm").format(new Date());
      return minutesTimeStamp;
   }

}

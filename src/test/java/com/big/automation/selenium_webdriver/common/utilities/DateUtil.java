package com.big.automation.selenium_webdriver.common.utilities;


import com.aventstack.extentreports.Status;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {


   public static String[] plusAndMinusDate(Integer daysToAdjust, Integer monthsToAdjust, Integer yearsToAdjust) {

      Calendar cal = Calendar.getInstance();
      cal.setTime(new Date());
      cal.add(Calendar.DAY_OF_MONTH, daysToAdjust);
      cal.add(Calendar.MONTH, monthsToAdjust);
      cal.add(Calendar.YEAR, yearsToAdjust);

      String day = new SimpleDateFormat("d").format(cal.getTime());
      String year = new SimpleDateFormat("yyyy").format(cal.getTime());
      String month = new SimpleDateFormat("MMMM").format(cal.getTime());


      System.out.println("day - " + day);
      System.out.println("month - " + month);
      System.out.println("year - " + year);


      String arr[] = new String[3];
      arr[0] = day;
      arr[1] = month;
      arr[2] = year;

      return arr;
   }

   public static String[] plusAndMinusDateForScpDob(Integer daysToAdjust, Integer monthsToAdjust, Integer yearsToAdjust) {

      Calendar cal = Calendar.getInstance();
      cal.setTime(new Date());
      cal.add(Calendar.DAY_OF_MONTH, daysToAdjust);
      cal.add(Calendar.MONTH, monthsToAdjust);
      cal.add(Calendar.YEAR, yearsToAdjust);

      String day = new SimpleDateFormat("dd").format(cal.getTime());
      String year = new SimpleDateFormat("yyyy").format(cal.getTime());
      String month = new SimpleDateFormat("MMMM").format(cal.getTime());


      System.out.println("day - " + day);
      System.out.println("month - " + month);
      System.out.println("year - " + year);


      String arr[] = new String[3];
      arr[0] = day;
      arr[1] = month;
      arr[2] = year;

      return arr;
   }

   public static String ScpStartDate(Integer daysToAdjust) {

      Calendar cal = Calendar.getInstance();
      cal.setTime(new Date());
      cal.add(Calendar.DAY_OF_MONTH, daysToAdjust);

      String startDate = new SimpleDateFormat("dd/MM/yyyy").format(cal.getTime());

      System.out.println("day - " + startDate);

      return startDate;
   }

   public static String[] forLegoDobPremiterisedDataPrep(String DobDaysToAdjust, String DobMonthsToAdjust, String DobYearsToAdjust) {


      DobDaysToAdjust = System.getProperty("dobDaysToAdjust");
      int dobDaysToAdjust = Integer.parseInt(DobDaysToAdjust);

      DobMonthsToAdjust = System.getProperty("dobMonthsToAdjust");
      int dobMonthsToAdjust = Integer.parseInt(DobMonthsToAdjust);

      DobYearsToAdjust = System.getProperty("dobYearsToAdjust");
      int dobYearsToAdjust = Integer.parseInt(DobYearsToAdjust);

      Calendar cal = Calendar.getInstance();
      cal.setTime(new Date());
      cal.add(Calendar.DAY_OF_MONTH, dobDaysToAdjust);
      cal.add(Calendar.MONTH, dobMonthsToAdjust);
      cal.add(Calendar.YEAR, dobYearsToAdjust);

      String day = new SimpleDateFormat("d").format(cal.getTime());
      String year = new SimpleDateFormat("yyyy").format(cal.getTime());
      String month = new SimpleDateFormat("MMMM").format(cal.getTime());


      System.out.println("day - " + day);
      System.out.println("month - " + month);
      System.out.println("year - " + year);


      String arr[] = new String[3];
      arr[0] = day;
      arr[1] = month;
      arr[2] = year;

      return arr;
   }
}







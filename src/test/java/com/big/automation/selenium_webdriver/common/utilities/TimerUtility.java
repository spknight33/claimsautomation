package com.big.automation.selenium_webdriver.common.utilities;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimerUtility {

	public static String timeStamp() throws Exception{
		Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SS");
        String strDate = sdf.format(cal.getTime());
        //System.out.println("Current date in String Format: " + strDate);

        SimpleDateFormat sdf1 = new SimpleDateFormat();
        sdf1.applyPattern("dd/MM/yyyy HH:mm:ss");
        Date date = sdf1.parse(strDate);
        String timestamp=sdf1.format(date);
        //System.out.println("Current date in Date Format: " + timestamp);
		return timestamp;
	}
}

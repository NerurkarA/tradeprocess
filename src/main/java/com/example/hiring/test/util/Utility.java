/**
 * 
 */
package com.example.hiring.test.util;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Anand Utility class providing various utlity w.r.t. trade processing
 */
public class Utility {

	/*
	 * Date formating function using SimpleDateFormate
	 * 
	 */
	public static String dateFormater(Date date) {

		SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-YYYY");
		String fdate = dateformat.format(date);

		return fdate;
	}

	/*
	 * Formatting double value upto 2 decimal places
	 */
	public static double roundTwoDecimals(double d) {
		DecimalFormat twoDForm = new DecimalFormat("#.##");
		return Double.valueOf(twoDForm.format(d));
	}

	/*
	 * get day based on the weekday
	 */
	public static String findday(int i) {
		// TODO Auto-generated method stub
		String s = "";
		// sun mon tue wed thu fri sat
		// 1 2 3 4 5 6 7

		switch (i) {
		case 1:
			s = "Sunday";
			break;

		case 2:
			s = "Monday";
			break;

		case 3:
			s = "Tuesday";
			break;
		case 4:
			s = "Wedday";
			break;
		case 5:
			s = "Thursday";
			break;
		case 6:
			s = "Friday";
			break;
		case 7:
			s = "Saturday";
			break;
		default:
			s = "none";

		}
		return s;
	}

}

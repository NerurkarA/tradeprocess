/**
 * 
 */
package com.example.hiring.test.tradeprocess;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.example.hiring.test.util.Utility;

import junit.framework.TestCase;

/**
 * @author Anand
 *
 */
public class UtilityTest extends TestCase {

	/**
	 * 
	 */
	public UtilityTest() {
		// TODO Auto-generated constructor stub
	}
@Before
	public void setUp() {
		
	}
	@After
	public void tearDown() {
		
	}
	/**
	 * @param name
	 */
	public UtilityTest(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	@Test
	public void testFindDay() {
		String day=Utility.findday(7);
		assertEquals("Saturday",day);
		
		String day1=Utility.findday(1);
		assertEquals("Sunday",day1);
		
	}
	@Test
	public void testDoubleValueToDecimalPlaces() {
		double d=456.5678;
		double exp=456.57;
		Double result=Utility.roundTwoDecimals(d);
		assertEquals(exp, result, d);
		System.out.println(result);
	}
	
}

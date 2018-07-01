/**
 * 
 */
package com.example.hiring.test.comparator;

import java.util.Comparator;

import com.example.hiring.test.model.StockTransaction;

/**
 * @author Anand
 *
 *         Sorting StockTransaction based on holdingvalue
 */
public class HoldingValueComparator implements Comparator<StockTransaction> {

	/**
	 * 
	 */
	public HoldingValueComparator() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(StockTransaction o1, StockTransaction o2) {
		// TODO Auto-generated method stub
		return Double.compare(o2.getHoldingValue(), o1.getHoldingValue());
	}

}

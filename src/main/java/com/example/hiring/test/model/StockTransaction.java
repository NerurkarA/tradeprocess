/**
 * 
 */
package com.example.hiring.test.model;

import java.util.Date;

/**
 * @author Anand
 *
 *         StockTransaction: Hold actual transaction for trade settlement
 */
public class StockTransaction {
	private String stockName;
	private String settlementDate;
	private String instructionDate;
	private String instructionType;
	private double agreedFix;
	private String currencyType;

	/**
	 * 
	 */
	public StockTransaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StockTransaction [stockName=" + stockName + ", settlementDate=" + settlementDate + ", instructionDate="
				+ instructionDate + ", instructionType=" + instructionType + ", agreedFix=" + agreedFix
				+ ", currencyType=" + currencyType + ", units=" + units + ", pricePerUnit=" + pricePerUnit
				+ ", holdingValue=" + holdingValue + ", status=" + status + "]";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(agreedFix);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((currencyType == null) ? 0 : currencyType.hashCode());
		temp = Double.doubleToLongBits(holdingValue);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((instructionDate == null) ? 0 : instructionDate.hashCode());
		result = prime * result + ((instructionType == null) ? 0 : instructionType.hashCode());
		temp = Double.doubleToLongBits(pricePerUnit);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((settlementDate == null) ? 0 : settlementDate.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((stockName == null) ? 0 : stockName.hashCode());
		result = prime * result + units;
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StockTransaction other = (StockTransaction) obj;
		if (Double.doubleToLongBits(agreedFix) != Double.doubleToLongBits(other.agreedFix))
			return false;
		if (currencyType == null) {
			if (other.currencyType != null)
				return false;
		} else if (!currencyType.equals(other.currencyType))
			return false;
		if (Double.doubleToLongBits(holdingValue) != Double.doubleToLongBits(other.holdingValue))
			return false;
		if (instructionDate == null) {
			if (other.instructionDate != null)
				return false;
		} else if (!instructionDate.equals(other.instructionDate))
			return false;
		if (instructionType == null) {
			if (other.instructionType != null)
				return false;
		} else if (!instructionType.equals(other.instructionType))
			return false;
		if (Double.doubleToLongBits(pricePerUnit) != Double.doubleToLongBits(other.pricePerUnit))
			return false;
		if (settlementDate == null) {
			if (other.settlementDate != null)
				return false;
		} else if (!settlementDate.equals(other.settlementDate))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (stockName == null) {
			if (other.stockName != null)
				return false;
		} else if (!stockName.equals(other.stockName))
			return false;
		if (units != other.units)
			return false;
		return true;
	}

	/**
	 * @return the stockName
	 */
	public String getStockName() {
		return stockName;
	}

	/**
	 * @param stockName
	 *            the stockName to set
	 */
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	/**
	 * @return the settlementDate
	 */
	public String getSettlementDate() {
		return settlementDate;
	}

	/**
	 * @param settlementDate
	 *            the settlementDate to set
	 */
	public void setSettlementDate(String settlementDate) {
		this.settlementDate = settlementDate;
	}

	/**
	 * @return the instructionDate
	 */
	public String getInstructionDate() {
		return instructionDate;
	}

	/**
	 * @param instructionDate
	 *            the instructionDate to set
	 */
	public void setInstructionDate(String instructionDate) {
		this.instructionDate = instructionDate;
	}

	/**
	 * @return the instructionType
	 */
	public String getInstructionType() {
		return instructionType;
	}

	/**
	 * @param instructionType
	 *            the instructionType to set
	 */
	public void setInstructionType(String instructionType) {
		this.instructionType = instructionType;
	}

	/**
	 * @return the agreedFix
	 */
	public double getAgreedFix() {
		return agreedFix;
	}

	/**
	 * @param agreedFix
	 *            the agreedFix to set
	 */
	public void setAgreedFix(double agreedFix) {
		this.agreedFix = agreedFix;
	}

	/**
	 * @return the currencyType
	 */
	public String getCurrencyType() {
		return currencyType;
	}

	/**
	 * @param currencyType
	 *            the currencyType to set
	 */
	public void setCurrencyType(String currencyType) {
		this.currencyType = currencyType;
	}

	/**
	 * @return the units
	 */
	public int getUnits() {
		return units;
	}

	/**
	 * @param units
	 *            the units to set
	 */
	public void setUnits(int units) {
		this.units = units;
	}

	/**
	 * @return the pricePerUnit
	 */
	public double getPricePerUnit() {
		return pricePerUnit;
	}

	/**
	 * @param pricePerUnit
	 *            the pricePerUnit to set
	 */
	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	/**
	 * @return the holdingValue
	 */
	public double getHoldingValue() {
		return holdingValue;
	}

	/**
	 * @param holdingValue
	 *            the holdingValue to set
	 */
	public void setHoldingValue(double holdingValue) {
		this.holdingValue = holdingValue;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	private int units;
	private double pricePerUnit;
	private double holdingValue;
	private String status = "None";

	/**
	 * @param stockName
	 * @param settlementDate
	 * @param instructionDate
	 * @param instructionType
	 * @param agreedFix
	 * @param currencyType
	 * @param units
	 * @param pricePerUnit
	 * @param holdingValue
	 * @param status
	 */
	public StockTransaction(String stockName, String settlementDate, String instructionDate, String instructionType,
			double agreedFix, String currencyType, int units, double pricePerUnit, double holdingValue, String status) {
		super();
		this.stockName = stockName;
		this.settlementDate = settlementDate;
		this.instructionDate = instructionDate;
		this.instructionType = instructionType;
		this.agreedFix = agreedFix;
		this.currencyType = currencyType;
		this.units = units;
		this.pricePerUnit = pricePerUnit;
		this.holdingValue = holdingValue;
		this.status = status;
	}

}

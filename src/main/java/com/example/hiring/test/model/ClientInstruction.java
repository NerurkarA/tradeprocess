/**
 * 
 */
package com.example.hiring.test.model;

/**
 * @author Anand
 *
 *         Client Instruction input received for trade settlement
 */
public class ClientInstruction {
	private String stockName;
	private String instructionType;
	private double agreedFix;
	private String currencyType;
	private String instructionDate;
	private String settlementDate;
	private int units;
	private double pricePerUnit;

	/**
	 * @param stockName
	 * @param instructionType
	 * @param agreedFix
	 * @param currencyType
	 * @param instructionDate
	 * @param settlementDate
	 * @param units
	 * @param pricePerUnit
	 */
	public ClientInstruction(String stockName, String instructionType, double agreedFix, String currencyType,
			String instructionDate, String settlementDate, int units, double pricePerUnit) {
		super();
		this.stockName = stockName;
		this.instructionType = instructionType;
		this.agreedFix = agreedFix;
		this.currencyType = currencyType;
		this.instructionDate = instructionDate;
		this.settlementDate = settlementDate;
		this.units = units;
		this.pricePerUnit = pricePerUnit;
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ClientInstruction [stockName=" + stockName + ", instructionType=" + instructionType + ", agreedFix="
				+ agreedFix + ", currencyType=" + currencyType + ", instructionDate=" + instructionDate
				+ ", settlementDate=" + settlementDate + ", units=" + units + ", pricePerUnit=" + pricePerUnit + "]";
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
		result = prime * result + ((instructionDate == null) ? 0 : instructionDate.hashCode());
		result = prime * result + ((instructionType == null) ? 0 : instructionType.hashCode());
		temp = Double.doubleToLongBits(pricePerUnit);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((settlementDate == null) ? 0 : settlementDate.hashCode());
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
		ClientInstruction other = (ClientInstruction) obj;
		if (Double.doubleToLongBits(agreedFix) != Double.doubleToLongBits(other.agreedFix))
			return false;
		if (currencyType == null) {
			if (other.currencyType != null)
				return false;
		} else if (!currencyType.equals(other.currencyType))
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
		if (stockName == null) {
			if (other.stockName != null)
				return false;
		} else if (!stockName.equals(other.stockName))
			return false;
		if (units != other.units)
			return false;
		return true;
	}

}

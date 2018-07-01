/**
 * 
 */
package com.example.hiring.test.process;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import com.example.hiring.test.comparator.HoldingValueComparator;
import com.example.hiring.test.model.ClientInstruction;
import com.example.hiring.test.model.StockTransaction;
import com.example.hiring.test.util.Constants;

import com.example.hiring.test.util.Utility;

/**
 * @author Anand
 *
 */
public class TradeProcessor {

	/**
	 * 
	 */
	public TradeProcessor() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * Report for Ranking of entities based on incoming and outgoing amount.
	 */
	public void printReportBySortIncomingOutgoing(List<StockTransaction> stockList) {
		// TODO Auto-generated method stub
		// stockList.stream().sorted().forEachOrdered(action);
		System.out.println();
		System.out.println("--Start=====-Report for Ranking of entities based on incoming and outgoing amount.---");
		List<StockTransaction> stockTranList = stockList.stream()
				.filter(stockTransaction -> stockTransaction.getHoldingValue() != 0).collect(Collectors.toList());
	 // stockTranList.stream().sorted()
		Collections.sort(stockTranList, new HoldingValueComparator());
		for (StockTransaction str : stockTranList) {
			System.out.println("StockName="+str.getStockName()+"  Holding Value="+str.getHoldingValue() +"  AgreedFix="+str.getAgreedFix()+"  unit="+str.getUnits()+"  PricePerUnit="+str.getPricePerUnit());
		}
		System.out.println();
		System.out.println("---End=====Report for Ranking of entities based on incoming and outgoing amount.---");
		System.out.println();
	}

	public void printReportsByNextSettlement(List<StockTransaction> stockList) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("Start====printReportsByNextSettlement(List<StockTransaction> stockList)");
		System.out.println();

		int count = 0;
		for (StockTransaction str : stockList) {
			if (str.getStatus().startsWith("Required")) {
				
				System.out.println("StockName =" + str.getStockName()+" "+" AgreedFix= " + str.getAgreedFix()+" "+" CurrencyType= " + str.getCurrencyType()+" "+" InstructionType()= " + str.getInstructionType()+" "+" InstructionDate= " + str.getInstructionDate()+" "+" SettlementDate= " + str.getSettlementDate()+" "+" Total Units= " + str.getUnits()+" "+" PricePerUnit= " + str.getPricePerUnit()+" "+" HoldingValue= " + str.getHoldingValue()+" "+" Status= " + str.getStatus());
				count++;
				

			}
		}
		System.out.println();
		System.out.println("Total Shares that need to be settled on next working day= " + count);
		System.out.println();
		System.out.println("End====printReportsByNextSettlement(List<StockTransaction> stockList)");
	}

	/*
	 * Report for Amount in USD settled outgoing everyday
	 */
	public void printReportsBySharesBought(List<StockTransaction> stockList) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("Start====printReportsBySharesBought(List<StockTransaction> stockList)");
		System.out.println("*******Start****Report for Amount in USD settled outgoing everyday*************");
		System.out.println();
		
		int count = 0;
		for (StockTransaction str : stockList) {
			// Shares Brought Shares Sold
			if (str.getStatus().equals("Shares Brought")) {
				//System.out.println("*********************************");

				System.out.println("StockName =" + str.getStockName()+" "+" AgreedFix= " + str.getAgreedFix()+" "+" CurrencyType= " + str.getCurrencyType()+" "+" InstructionType()= " + str.getInstructionType()+" "+" InstructionDate= " + str.getInstructionDate()+" "+" SettlementDate= " + str.getSettlementDate()+" "+" Total Units= " + str.getUnits()+" "+" PricePerUnit= " + str.getPricePerUnit()+" "+" HoldingValue= " + str.getHoldingValue()+" "+" Status= " + str.getStatus());
				count++;
				//System.out.println("*********************************");

			}

		}
		System.out.println();
		System.out.println("Total Shares Bought =" + count);
		System.out.println();
		System.out.println("*******End****Report for Amount in USD settled outgoing everyday*************");
		System.out.println("End====printReportsBySharesBought(List<StockTransaction> stockList)");
	}

	/*
	 * Report for Amount in USD settled incoming everyday
	 */
	public void printReportsBySharesSold(List<StockTransaction> stockList) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("Start====printReportsBySharesSold(List<StockTransaction> stockList)");
		System.out.println("******Start*****Report for Amount in USD settled incoming everyday**********");
		System.out.println();
		int count = 0;
		for (StockTransaction str : stockList) {
			if (str.getStatus().equals("Shares Sold")) {
				//System.out.println("*********************************");

				System.out.println("StockName =" + str.getStockName()+" "+" AgreedFix= " + str.getAgreedFix()+" "+" CurrencyType= " + str.getCurrencyType()+" "+" InstructionType()= " + str.getInstructionType()+" "+" InstructionDate= " + str.getInstructionDate()+" "+" SettlementDate= " + str.getSettlementDate()+" "+" Total Units= " + str.getUnits()+" "+" PricePerUnit= " + str.getPricePerUnit()+" "+" HoldingValue= " + str.getHoldingValue()+" "+" Status= " + str.getStatus());
				count++;
				//System.out.println("*********************************");

			}

		}
		System.out.println();
		System.out.println("Total Shares Sold =" + count);
		System.out.println();
		System.out.println("******End*****Report for Amount in USD settled incoming everyday**********");
		System.out.println("End====printReportsBySharesSold(List<StockTransaction> stockList)");
	}

	/*
	 * Processing order for trade settlement on working day with instruction receved
	 * from the client
	 */
	public List<StockTransaction> placeOrder(List<ClientInstruction> clientInstructionList) throws ParseException {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("Start==== placeOrder(List<ClientInstruction> clientInstructionList)");
		System.out.println();
		TradeProcessor tradeProcessorDemo = new TradeProcessor();
		List<StockTransaction> list = new ArrayList<StockTransaction>();

		for (ClientInstruction instruction : clientInstructionList) {
			String settlementDateInString = instruction.getSettlementDate();
			String currency = instruction.getCurrencyType();

			// Using Calendar to increment and decrement date
			SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");

			Date date = sdf.parse(settlementDateInString);
			// System.out.println(date); //Tue Aug

			// Date date = new Date();
		//	System.out.println("Settlement date is : " + Utility.dateFormater(date));
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			StockTransaction stockTransaction = tradeProcessorDemo.process(cal, instruction);
			list.add(stockTransaction);
		}
		System.out.println();
		System.out.println("Start==== placeOrder(List<ClientInstruction> clientInstructionList)");
		
		return list;
	}

	public StockTransaction process(Calendar cal, ClientInstruction instruction) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("Start==== StockTransaction process(Calendar cal, ClientInstruction instruction)");
		System.out.println();
		StockTransaction stockTransactionToSettle = new StockTransaction();
		// Adding one Day in Current Date
		// sun mon tue wed thu fri sat
		// 1 2 3 4 5 6 7
		String currecny = instruction.getCurrencyType();
		Date futureDate = null;
		int day = 0;
		day = cal.get(Calendar.DAY_OF_WEEK);
		//System.out.println("day= " + day);
		String message = "";
		if (currecny.equalsIgnoreCase(Constants.CURRENCYSAR) || currecny.equalsIgnoreCase(Constants.CURRENCYAED)) {
			// 1st check - work week start between sun-thu
			if (day == 6) {
				// it is friday, can not settle on fri, need to settle on sunday
				// add 2 days
				message = Constants.AEDSARFRIMESSAGE;
				//System.out.println(message);
				cal.add(cal.DAY_OF_MONTH, 2);
				futureDate = cal.getTime();
				// System.out.println(message);
				String nextSettlementDate = Utility.dateFormater(futureDate);
		//		System.out.println("Next settlement date for friday is  : " + nextSettlementDate);
				// instruction.setSettlementDate(nextSettlementDate);
				stockTransactionToSettle.setStockName(instruction.getStockName());
				stockTransactionToSettle.setInstructionType(instruction.getInstructionType());
				stockTransactionToSettle.setAgreedFix(instruction.getAgreedFix());
				stockTransactionToSettle.setCurrencyType(instruction.getCurrencyType());
				stockTransactionToSettle.setInstructionDate(instruction.getInstructionDate());
				stockTransactionToSettle.setSettlementDate(nextSettlementDate);
				stockTransactionToSettle.setUnits(instruction.getUnits());
				stockTransactionToSettle.setPricePerUnit(instruction.getPricePerUnit());
				stockTransactionToSettle.setStatus(Constants.NEXTSETTLEDATE + " " + nextSettlementDate);
				return stockTransactionToSettle;
			}
			if (day == 7) {
				// it is saturday, can not settle on satuday, need to settle on Sunday
				// add 1 days
				message = Constants.AEDSARSATMESSAGE;
			//	System.out.println(message);
				cal.add(cal.DAY_OF_MONTH, 1);
				futureDate = cal.getTime();
				String nextSettlementDate = Utility.dateFormater(futureDate);
				//System.out.println("Next settlement date for saturday  is  : " + nextSettlementDate);
				stockTransactionToSettle.setStockName(instruction.getStockName());
				stockTransactionToSettle.setInstructionType(instruction.getInstructionType());
				stockTransactionToSettle.setAgreedFix(instruction.getAgreedFix());
				stockTransactionToSettle.setCurrencyType(instruction.getCurrencyType());
				stockTransactionToSettle.setInstructionDate(instruction.getInstructionDate());
				stockTransactionToSettle.setSettlementDate(nextSettlementDate);
				stockTransactionToSettle.setUnits(instruction.getUnits());
				stockTransactionToSettle.setPricePerUnit(instruction.getPricePerUnit());
				stockTransactionToSettle.setStatus(Constants.NEXTSETTLEDATE + " " + nextSettlementDate);
				return stockTransactionToSettle;
			}
			// complete trade processing
		//	System.out.println("Satrt-------AED or SAR trade processing");
			StockTransaction value = performTradeSettlement(cal, instruction);
			// display(value);
			System.out.println();
			//System.out.println("End-------AED or SAR trade processing");
			return value;
		} else {
			// currecny is other than AED or SAR
			// 1st check - is day between mon-fri
			if (day == 7) {
				// it is saturday , can not settle on saturday, need to settle on Monday
				// add 2 days
				message = Constants.OTHERCURRENCYSATMESSAGE;
			//	System.out.println(message);
				cal.add(cal.DAY_OF_MONTH, 2);
				futureDate = cal.getTime();
				String nextSettlementDate = Utility.dateFormater(futureDate);
				//System.out.println("Next settlement date for saturday is  : " + nextSettlementDate);
				stockTransactionToSettle.setStockName(instruction.getStockName());
				stockTransactionToSettle.setInstructionType(instruction.getInstructionType());
				stockTransactionToSettle.setAgreedFix(instruction.getAgreedFix());
				stockTransactionToSettle.setCurrencyType(instruction.getCurrencyType());
				stockTransactionToSettle.setInstructionDate(instruction.getInstructionDate());
				stockTransactionToSettle.setSettlementDate(nextSettlementDate);
				stockTransactionToSettle.setUnits(instruction.getUnits());
				stockTransactionToSettle.setPricePerUnit(instruction.getPricePerUnit());
				stockTransactionToSettle.setStatus(Constants.NEXTSETTLEDATE + " " + nextSettlementDate);
				return stockTransactionToSettle;
			}
			if (day == 1) {
				// it is sunday, can not settle on sunday, need to settle on Monday
				// add 1 days
				message = Constants.OTHERCURRENCYSUNMESSAGE;
				//System.out.println(message);
				cal.add(cal.DAY_OF_MONTH, 1);
				futureDate = cal.getTime();
				String nextSettlementDate = Utility.dateFormater(futureDate);
				//System.out.println("Next settlement date for sunday  is  : " + nextSettlementDate);
				stockTransactionToSettle.setStockName(instruction.getStockName());
				stockTransactionToSettle.setInstructionType(instruction.getInstructionType());
				stockTransactionToSettle.setAgreedFix(instruction.getAgreedFix());
				stockTransactionToSettle.setCurrencyType(instruction.getCurrencyType());
				stockTransactionToSettle.setInstructionDate(instruction.getInstructionDate());
				stockTransactionToSettle.setSettlementDate(nextSettlementDate);
				stockTransactionToSettle.setUnits(instruction.getUnits());
				stockTransactionToSettle.setPricePerUnit(instruction.getPricePerUnit());
				stockTransactionToSettle.setStatus(Constants.NEXTSETTLEDATE + " " + nextSettlementDate);
				return stockTransactionToSettle;
			}
			// complete trade processing
			//System.out.println("Satrt-------Other than AED or SAR trade processing");
			// value = performTradeSettlement(cal, instruction, value);
			// display(value);
			StockTransaction value = performTradeSettlement(cal, instruction);
			//System.out.println("End-------Other than AED or SAR trade processing");
			return value;
		}
		
	}

	/*
	 * Trade settlement process on working days based on currency type
	 */
	private StockTransaction performTradeSettlement(Calendar cal, ClientInstruction instruction) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("Start=======StockTransaction performTradeSettlement()");
		System.out.println();
		//	System.out.println(
	//			"Stock Name =" + instruction.getStockName() + " Currency Type =" + instruction.getCurrencyType());
		//System.out.println("Trade Settlement for Stock " + instruction.getStockName() + " on working date "
			//	+ Utility.findday(cal.get(Calendar.DAY_OF_WEEK)) + " " + instruction.getSettlementDate()
				//+ " is in progress");
		double holdingValueForUnits = instruction.getAgreedFix() * instruction.getUnits()
				* instruction.getPricePerUnit();

		StockTransaction st = new StockTransaction();
		String currencytype = instruction.getCurrencyType();
		String tranType = instruction.getInstructionType();
		st.setStockName(instruction.getStockName());
		st.setInstructionType(instruction.getInstructionType());
		st.setAgreedFix(instruction.getAgreedFix());
		st.setCurrencyType(instruction.getCurrencyType());
		st.setInstructionDate(instruction.getInstructionDate());
		st.setPricePerUnit(instruction.getPricePerUnit());
		st.setUnits(instruction.getUnits());
		st.setSettlementDate(instruction.getSettlementDate());
		if (tranType.equalsIgnoreCase("B")) {
			st.setStatus("Shares Brought");

		} else {
			st.setStatus("Shares Sold");
		}
		st.setHoldingValue(Utility.roundTwoDecimals(holdingValueForUnits));
		System.out.println();
		System.out.println("End=======StockTransaction performTradeSettlement()");
		System.out.println();
		return st;

	}

}

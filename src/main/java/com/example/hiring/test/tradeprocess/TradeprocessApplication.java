package com.example.hiring.test.tradeprocess;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.hiring.test.model.ClientInstruction;
import com.example.hiring.test.model.StockTransaction;
import com.example.hiring.test.process.TradeProcessor;

@SpringBootApplication
public class TradeprocessApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(TradeprocessApplication.class);
		app.run(args);

	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Start=======TradeprocessApplication");
		TradeProcessor tradeProcessorDemo = new TradeProcessor();
		// List: inMemory data to hold buy,sell and tosettle shares
		List<ClientInstruction> clientInstructionList = new ArrayList();
		
		// Client instruction for trade settlement input
		System.out.println(" Start----- Populating Client Instruction ");
		ClientInstruction instruction = new ClientInstruction("FOO", "B", 0.50, "SGP", "20 Jun 2018", "23 Jun 2018",
				20, 100.25);
		ClientInstruction instruction1 = new ClientInstruction("BAR", "S", 0.22, "AED", "21 Jun 2018", "22 Jun 2018",
				40, 150.5);
		ClientInstruction instruction2 = new ClientInstruction("TCS", "B", 0.42, "INR", "20 Jun 2018", "21 Jun 2018",
				60, 1500.5);
		ClientInstruction instruction3 = new ClientInstruction("BRIT", "S", 0.24, "INR", "12 Jun 2018",
				"15 Jun 2018", 30, 350.5);
		ClientInstruction instruction4 = new ClientInstruction("BNY", "B", 0.44, "AED", "12 Jun 2018",
				"14 Jun 2018", 30, 423.5);
		ClientInstruction instruction5 = new ClientInstruction("INFY", "B", 0.25, "AED", "02 Jun 2018",
				"08 Jun 2018", 30, 423.5);

		ClientInstruction instruction6 = new ClientInstruction("ACZ", "B", 0.20, "SGP", "20 Jun 2018", "23 Jun 2018",
				20, 90.25);
		ClientInstruction instruction7 = new ClientInstruction("BXP", "B", 0.14, "POUND", "21 Jun 2018", "23 Jun 2018",
				29, 100.25);
		ClientInstruction instruction8 = new ClientInstruction("PRZ", "B", 0.50, "EURO", "20 Jun 2018", "24 Jun 2018",
				46, 20.25);
		ClientInstruction instruction9 = new ClientInstruction("AEMQ", "S", 0.65, "YEN", "19 Jun 2018",
				"21 Jun 2018", 68, 50.25);
		ClientInstruction instruction10 = new ClientInstruction("IBM", "S", 0.85, "DOLLAR", "19 Jun 2018",
				"21 Jun 2018", 12, 430.25);
		ClientInstruction instruction11 = new ClientInstruction("MARI", "S", 0.35, "YEN", "20 Jun 2018",
				"22 Jun 2018", 30, 145);
		ClientInstruction instruction12 = new ClientInstruction("SUZ", "B", 0.32, "PESO", "20 Jun 2018",
				"23 Jun 2018", 33, 54.25);
		ClientInstruction instruction13 = new ClientInstruction("FORD", "S", 0.23, "SGP", "20 Jun 2018", "23 Jun 2018",
				10, 200.25);
		ClientInstruction instruction14 = new ClientInstruction("MXQ", "B", 0.50, "YEN", "20 Jun 2018", "22 Jun 2018",
				15, 100.25);
		ClientInstruction instruction15 = new ClientInstruction("LXM", "B", 0.20, "SAR", "20 Jun 2018", "22 Jun 2018",
				20, 1433.25);
		ClientInstruction instruction16 = new ClientInstruction("RTZ", "S", 0.50, "AED", "18 Jun 2018", "20 Jun 2018",
				24, 65.25);
		ClientInstruction instruction17 = new ClientInstruction("STS", "S", 0.22, "SGP", "20 Jun 2018", "23 Jun 2018",
				10, 450.25);
		ClientInstruction instruction18 = new ClientInstruction("XSD", "B", 0.42, "PESO", "18 Jun 2018", "21 Jun 2018",
				26, 20.25);
		ClientInstruction instruction19 = new ClientInstruction("MTX", "S", 0.150, "DOLLAR", "20 Jun 2018",
				"23 Jun 2018", 400, 61.25);
		ClientInstruction instruction20 = new ClientInstruction("GDO", "B", 0.75, "SGP", "18 Jun 2018", "21 Jun 2018",
				43, 350.25);
		ClientInstruction instruction21 = new ClientInstruction("GLF", "S", 0.65, "YEN", "22 Jun 2018", "24 Jun 2018",
				15, 610.25);
		ClientInstruction instruction22 = new ClientInstruction("PZW", "B", 0.35, "AED", "20 Jun 2018", "22 Jun 2018",
				30, 450.25);
		ClientInstruction instruction23 = new ClientInstruction("ZEN", "S", 0.50, "SGP", "19 Jun 2018", "20 Jun 2018",
				40, 145.65);
		ClientInstruction instruction24 = new ClientInstruction("SQS", "S", 0.65, "YEN", "20 Jun 2018", "26 Jun 2018",
				14, 100.25);

		clientInstructionList.add(instruction);
		clientInstructionList.add(instruction1);
		clientInstructionList.add(instruction2);
		clientInstructionList.add(instruction3);
		clientInstructionList.add(instruction4);
		clientInstructionList.add(instruction5);
		//
		clientInstructionList.add(instruction6);
		clientInstructionList.add(instruction7);
		clientInstructionList.add(instruction8);
		clientInstructionList.add(instruction9);
		clientInstructionList.add(instruction10);
		clientInstructionList.add(instruction11);
		clientInstructionList.add(instruction12);
		clientInstructionList.add(instruction13);
		clientInstructionList.add(instruction14);
		clientInstructionList.add(instruction15);
		clientInstructionList.add(instruction16);
		clientInstructionList.add(instruction17);
		clientInstructionList.add(instruction18);
		clientInstructionList.add(instruction19);
		clientInstructionList.add(instruction20);
		clientInstructionList.add(instruction21);
		clientInstructionList.add(instruction22);
		clientInstructionList.add(instruction23);
		clientInstructionList.add(instruction24);

		System.out.println(" End----- Populating Client Instruction ");

		System.out.println(" Start----- Placing order for trade settlement ");
		System.out.println("Total no of shares to be processed ="+clientInstructionList.size());
		List<StockTransaction> stockList = tradeProcessorDemo.placeOrder(clientInstructionList);
		System.out.println(" End----- Placing order for trade settlement ");
		/*
		 * print reports by shares sold-incoming everyday
		 */
		tradeProcessorDemo.printReportsBySharesSold(stockList);
		/*
		 * print reports by shares bought-outgoing everyday
		 */
		tradeProcessorDemo.printReportsBySharesBought(stockList);
		/*
		 * print reports based on ranking -starting with highest holding value
		 */
		tradeProcessorDemo.printReportBySortIncomingOutgoing(stockList);
		/*
		 * print reports for the trades that need to be settled
		 */
		tradeProcessorDemo.printReportsByNextSettlement(stockList);
		

		System.out.println("End=======TradeprocessApplication");
	}
}

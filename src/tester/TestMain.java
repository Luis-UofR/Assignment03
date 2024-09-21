package tester;

import orozco.SalesItem;
import orozco.SalesSlip;

public class TestMain {

	public static void main(String[] args) {
		// testing what would happen in the GUI
		SalesSlip slip = new SalesSlip();

		// adding items
		SalesItem item1 = new SalesItem("Soda", 2.00, 5);
		SalesItem item2 = new SalesItem("Chips", 1.50, 3);
		SalesItem item3 = new SalesItem("Candy", 1.50, 3);
		SalesItem item4 = new SalesItem("Chocolate", 1.50, 3);

		slip.addItem(item1);
		slip.addItem(item2);
		slip.addItem(item3);
		slip.addItem(item4);

		// testing sales list output
		System.out.println(slip);
		
		// testing total sales cost output
		System.out.println("Total Sales Cost = " + slip.getTotalSales());

	}

}

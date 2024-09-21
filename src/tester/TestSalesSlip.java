package tester;

import orozco.SalesItem;
import orozco.SalesSlip;

public class TestSalesSlip {
	public static void main(String[] args) {
		// create a slip
		SalesSlip slip = new SalesSlip();

		// add the items
		SalesItem item1 = new SalesItem("Soda", 2.00, 5);
		SalesItem item2 = new SalesItem("Chips", 1.50, 3);
		SalesItem item3 = new SalesItem("Candy", 1.50, 3);
		SalesItem item4 = new SalesItem("Chocolate", 1.50, 3);

		slip.addItem(item1);
		slip.addItem(item2);
		slip.addItem(item3);
		slip.addItem(item4);
		
		// testing toString method
		System.out.println(slip.toString());
	}
}

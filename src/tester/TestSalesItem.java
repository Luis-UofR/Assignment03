package tester;

import orozco.SalesItem;

public class TestSalesItem {
	public static void main(String[] args) {
		// create a sales item
		SalesItem item = new SalesItem("Chips", 1.50, 3);

		// testing getters
		System.out.println("Item Name = " + item.getName());
		System.out.println("Item Price = " + item.getPrice());
		System.out.println("Item Quantity = " + item.getQuantity());

		// testing total calculations
		System.out.println("Total Price = " + item.totalCost());

		// testing toString method
		System.out.println();
		System.out.println(item.toString());
	}
}

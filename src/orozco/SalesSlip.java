package orozco;

import java.util.ArrayList;

/**
 * The SalesSlip class holds a list of SalesItem objects (has methods to add
 * items, calculate total sales, return neat list)
 */
public class SalesSlip {

	// variables used in the class
	private ArrayList<SalesItem> items;

	/**
	 * Constructs an empty SalesSlip object
	 */
	public SalesSlip() {
		items = new ArrayList<>();
	}

	/**
	 * Method to add an item
	 * 
	 * @param item A SalesItem object to be added to the SalesSlip
	 */
	public void addItem(SalesItem item) {
		items.add(item);
	}

	/**
	 * Method to get total sales (rounded to the nearest cent)
	 * 
	 * @return The total sales amount
	 */
	public double getTotalSales() {
		double total = 0;

		// go through all the items
		for (SalesItem item : items) {
			total += item.totalCost();
		}

		// round to the nearest cent
		total = Math.round(total * 100.0) / 100.0;

		return total;
	}

	/**
	 * Method to return a neat table of the items
	 * 
	 * @return a table of the SalesSlip with the items and their details
	 */
	public String toString() {

		// using StringBuilder because it is easier to append
		StringBuilder outputTable = new StringBuilder();

		// format the items
		for (SalesItem item : items) {
			outputTable.append(item.toString());
		}

		return outputTable.toString(); // StringBuilder's built in toString
	}

}

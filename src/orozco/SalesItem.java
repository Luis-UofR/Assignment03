package orozco;

/**
 * The SalesItem class is a single items in a sales transaction (holds item
 * name, price, and quantity. Methods will get total cost and display item)
 */

public class SalesItem {

	// variables used in the class
	private String name;
	private double price;
	private int quantity;

	/**
	 * Construct a SalesItem object containing name, price, and quantity
	 * 
	 * @param name     The name of the item
	 * @param price    The price of the item
	 * @param quantity The quantity of the item
	 */
	public SalesItem(String name, double price, int quantity) {

		// use "this" because we are assigning the variables at the top
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	// create setters and getters using Eclipse

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * Gives total cost of the sales item using price and quantity
	 * 
	 * @return The total cost of the item
	 */
	public double totalCost() {
		return price * quantity;
	}

	/**
	 * Returns a neat table that displays item details
	 * 
	 * @return A formatted string with item name, price, and quantity
	 */
	public String toString() {
		return String.format("%-20s $%-20.2f %-20d\n", name, price, quantity);
	}

}

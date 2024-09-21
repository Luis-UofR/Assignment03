package orozco;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * Main class starts the Sales List applications (makes the GUI to add sales
 * items to display total sales amount)
 */
public class Main {

	private JFrame frame;
	private JTextField inputItem;
	private JTextField inputCost;
	private JTextField inputQuantity;
	/*
	 * needs sales slip here, because anything lower will rewrite the table when
	 * clicking the button
	 */
	private SalesSlip salesSlip;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		salesSlip = new SalesSlip();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Sales List");
		lblNewLabel.setBounds(180, 11, 87, 14);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Item:");
		lblNewLabel_1.setBounds(10, 35, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Cost: $");
		lblNewLabel_2.setBounds(10, 60, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Quantity:");
		lblNewLabel_3.setBounds(10, 85, 59, 14);
		frame.getContentPane().add(lblNewLabel_3);

		inputItem = new JTextField();
		inputItem.setBounds(76, 32, 160, 20);
		frame.getContentPane().add(inputItem);
		inputItem.setColumns(10);

		inputCost = new JTextField();
		inputCost.setColumns(10);
		inputCost.setBounds(76, 57, 160, 20);
		frame.getContentPane().add(inputCost);

		inputQuantity = new JTextField();
		inputQuantity.setColumns(10);
		inputQuantity.setBounds(76, 82, 160, 20);
		frame.getContentPane().add(inputQuantity);

		JButton addItemButton = new JButton("Add Item to the Sales List");
		addItemButton.setBounds(20, 113, 206, 23);
		frame.getContentPane().add(addItemButton);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 147, 414, 76);
		frame.getContentPane().add(scrollPane);

		JTextArea displayTotalSales = new JTextArea();
		scrollPane.setViewportView(displayTotalSales);

		JLabel lblNewLabel_4 = new JLabel("Total Sales:");
		lblNewLabel_4.setBounds(10, 236, 87, 14);
		frame.getContentPane().add(lblNewLabel_4);

		JTextArea displayTotalSalesCost = new JTextArea();
		displayTotalSalesCost.setBounds(81, 231, 145, 22);
		frame.getContentPane().add(displayTotalSalesCost);

		addItemButton.addActionListener(new ActionListener() {
			/**
			 * Occurs when the the Add Item button is pressed (gets inputs, creates
			 * SalesItem object, updates list, displays results)
			 * 
			 * @param e is the event that starts the action
			 */
			public void actionPerformed(ActionEvent e) {

				// grab all the inputs
				String item = inputItem.getText(); // change to item
				double cost = Double.parseDouble(inputCost.getText()); // change to cost
				int quantity = Integer.parseInt(inputQuantity.getText());

				// create a sales item object
				SalesItem itemObj = new SalesItem(item, cost, quantity);

				// add them to the sales slip
				salesSlip.addItem(itemObj);

				// print it to the text area
				displayTotalSales.setText(salesSlip.toString());

				// print total sales cost
				String totalSalesCost = "$" + salesSlip.getTotalSales(); // make it into a String
				displayTotalSalesCost.setText(totalSalesCost);

				// clear all the input texts for another item
				inputItem.setText("");
				inputCost.setText("");
				inputQuantity.setText("");
			}
		});
	}
}

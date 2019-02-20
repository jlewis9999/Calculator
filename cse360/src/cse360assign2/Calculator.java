//	Name: Jackson Lewis
//	Class ID: 452
//	Assignment Number: 2
//	Description: This class performs basic mathematical operations on the
//		"total" variable. Additionally, it has functions to return the result
//		as well as return previous results (history).

package cse360assign2;
public class Calculator {
	private int total;
	private String history;

	/**
	 * This constructor initializes the total and history variables.
 	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	/**
	 * This method returns the total variable
	 * @return the integer value of the total variable
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * This method adds value to the total variable.  It also records the
	 * operation into the history string.
	 * @param value the integer to be added
	 */
	public void add (int value) {
		total += value;
		history += " + " + value;
	}
	
	/**
	 * This method subtracts value from the total variable. It also records the
	 * operation into the history string.
	 * @param value the integer to be subtracted
	 */
	public void subtract (int value) {
		total -= value;
		history += " - " + value;
	}
	
	/**
	 * This method multiplies the total variable by value. It also records the
	 * operation into the history string.
	 * @param value the integer by which to be multiplied
	 */
	public void multiply (int value) {
		total *= value;
		history += " * " + value;
	}
	
	/**
	 * This method divides the total variable by value. It also records the
	 * operation into the history string.
	 * @param value the integer by which to be divided
	 */
	public void divide (int value) {
		if (value == 0)
			total = 0;
		else
			total /= value;
		history += " / " + value;
	}
	
	/**
	 * This method returns the history of the Calculator object
	 * @return the String of previous operations
	 */
	public String getHistory () {
		return history;
	}
}
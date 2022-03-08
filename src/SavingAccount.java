import java.util.Scanner;

public class SavingAccount {
	
	/**
	 * ====================================================
	 *  1.creating and variables
	 *  2.Created method to calculating monthly interest
	 *  ====================================================
	 */
	
	/*
	 * 1.creating and variables
	 */
	private double savingsBalance;
	public double annualIntrestRate;

	/*
	 * 2.Created method to calculating monthly interest
	 */
	public void calculateMonthlyInterest(double savingsBalance, double annualInterestRate) {

		double monthlyInterest = (savingsBalance * (annualInterestRate / 100)) / 12;

		savingsBalance += monthlyInterest;

		System.out.println("monthlyIneterest: " + monthlyInterest);
		System.out.println("Updated acoount balance" + savingsBalance);
	}

}

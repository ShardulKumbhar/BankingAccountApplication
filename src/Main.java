
public class Main {

	public static void main(String[] args) {

		
		/**
		 * PROCEDURE
		 * =====================================
		 * 1. Creating an Object 
		 * 2.Printing a statement
		 * 3.calling method into object1
		 * 4.calling method into object1
		 * 5.calling method into object1
		 * 6.calling method into object2
		 * 
		 *===================================
		 */
		
		System.out.println("Annual intrest rate is 4 ");

		/*
		 * 1. Creating an Object
		 */
		SavingAccount saver1 = new SavingAccount();
		SavingAccount saver2 = new SavingAccount();

		/*
		 * 2.Printing a statement
		 */
		System.out.println("*********************Saver1********************");

		/*
		 * 3.calling method into object1
		 */
		saver1.calculateMonthlyInterest(2000, 4);
		System.out.println("********************Saver2************************");

		/*
		 * 4.calling method into object1
		 */
		saver2.calculateMonthlyInterest(3000, 4);

		System.out.println("\n Annual intrest rate is 5");
		System.out.println("*********************Saver1*********************");
		/*
		 * 5.calling method into object1
		 */
		saver1.calculateMonthlyInterest(2000, 5);
		System.out.println("********************Saver2************************");
		/*
		 * 6.calling method into object6
		 */
		saver2.calculateMonthlyInterest(3000, 5);
	}

}

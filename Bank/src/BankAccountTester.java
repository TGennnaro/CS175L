import java.util.Scanner;
public class BankAccountTester {

	public static void main(String[] args) {
		// Scanner definition
		Scanner in = new Scanner(System.in);
		
		// Introduction
		System.out.print("Hello, welcome to Monmouth Bank.\nWould you like to open a Bank Account? (Y/N): ");
		// Response from user
		String confirm = in.nextLine().toUpperCase();
		// Check if response was N, or No
		if (confirm.equals("N")) {
			System.out.println("Okay, have a great day!");
			// Close scanner and terminate method
			in.close();
			return;
		// Since response is not N, check if response is anything but Y, or Yes.
		} else if (!confirm.equals("Y")){
			System.out.println("Unknown Input \""+confirm+ "\". Expected: \"Y\" or \"N\"");
			// Close scanner and terminate method
			in.close();
			return;
		}
		
		// The following code only runs if the user inputed Y.
		
		// Ask for initial deposit
		System.out.print("How much would you like your initial deposit to be? $");
		int startBal = in.nextInt();
		
		System.out.print("What interest rate are you requesting? (Must be approved by bank): ");
		double interest = in.nextDouble();
		// Create object
		BankAccount myBankAccount = new BankAccount(startBal, interest);
		
		// Confirm account opening
		System.out.println("Your account has been opened with a balance of $"+startBal+".");
		
		// Create variable to control the loop
		boolean running = true;
		
		while (running) {
			// Display available commands
			System.out.print("\nInput a command: Withdraw | Deposit | Balance | Interest | Stop | Help: ");
			// Get the inputed command
			String command = in.next().toLowerCase();
			
			// If "withdraw" was inputed,
			if (command.equals("withdraw")) {
				// Get amount to withdraw
				System.out.print("Please input the amount you would like to withdraw: $");
				double amt = in.nextDouble();
				
				// Check to make sure they have enough funds to withdraw amount
				if (amt <= myBankAccount.getBalance()) {
					// If yes, withdraw
					myBankAccount.withdraw(amt);
					System.out.printf("Withdrew $%.2f. New balance: $%.2f", amt, myBankAccount.getBalance());
				} else {
					// If no, throw error
					System.out.printf("Invalid funds to withdraw $"+amt+". Available: $%.2f",myBankAccount.getBalance());
				}
			// If "deposit" was inputed,
			} else if (command.equals("deposit")) {
				// Get amount to deposit
				System.out.print("Please input the amount you would like to deposit: $");
				double amt = in.nextDouble();
				// Deposit into account
				myBankAccount.deposit(amt);
				System.out.printf("Deposited $%.2f. New balance: $%.2f", amt, myBankAccount.getBalance());
			// If "balance" was inputed,
			} else if (command.equals("balance")) {
				// Display balance
				System.out.printf("Your current balance is $%.2f", myBankAccount.getBalance());
			} else if (command.equals("interest")) {
				System.out.printf("Your current accumulated interest is $%.2f at a rate of "+myBankAccount.getInterest()+".", myBankAccount.calcInterest());
			// If "stop" was inputed
			} else if (command.equals("stop")) {
				System.out.println("Thank you for your business, have a great day!");
				// Stop the loop
				running = false;
			// If "help" was inputed,
			} else if (command.equals("help")) {
				// Display all commands and their functions
				System.out.println("\nHelp: ");
				System.out.println("Withdraw: Withdraw funds from your account");
				System.out.println("Deposit: Deposit funds from your account");
				System.out.println("Balance: View your account balance");
				System.out.println("Stop: Exit the bank menu");
			// If anything but the valid commands are inputed,
			} else {
				// Throw error
				System.out.println("Invalid input: \""+command+"\".");
			}
		}
		
		// Close scanner
		in.close();
	}
}

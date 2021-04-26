import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BankAccountTester {

	public static void main(String[] args) {
		// Initialize the initial bank accounts
		BankAccount gil = new BankAccount("Gil", 500);
		BankAccount joe = new BankAccount("Joe", 1000);
		BankAccount fred = new BankAccount("Fred", 2000);
		BankAccount sally = new BankAccount("Sally", 2500);
		
		// Create an array list
		ArrayList<BankAccount> accountList = new ArrayList<>();
		// Create a List to store all the Bank Accounts in one value, makes adding to the array list much easier
		List<BankAccount> tempList = Arrays.asList(gil, joe, fred);
		// Add the list to the array list in 2 steps instead of 3
		accountList.addAll(tempList);
		
		// Loop over all bank accounts in the list
		for (BankAccount account : accountList) {
			String info = account.getAccount(); // Get the account info
			String[] split = info.split(" "); // Split it at the spaces
			String name = split[0];
			int acctNum = Integer.parseInt(split[1]);
			double bal = Double.parseDouble(split[2]);
			System.out.println(name+"'s Account Info:\nAccount Number: "+acctNum+" | Balance: $"+bal+"\n");
		}
		
		accountList.add(sally);
		
		double highestBal = accountList.get(0).getBalance(); // Initialize highest as the first balance in the list
		int highestAcctNum = 1; // Initialize highest account number as the first account number in the list
		String highestName = "";  // Initialize the highest name
		for (BankAccount account : accountList) { // Loop over all accounts
			if (account.getBalance() > highestBal) { // If their balance > the current highest
				String info = account.getAccount(); // Set all the highest info to the new account's info
				String[] split = info.split(" ");
				highestName = split[0];
				highestAcctNum = Integer.parseInt(split[1]);
				highestBal = Double.parseDouble(split[2]);
			}
		}
		System.out.println("Highest Account Balance:");
		System.out.println(highestName+"'s Account Info:\nAccount Number: "+highestAcctNum+" | Balance: $"+highestBal+"\n"); // Print the info
		
		accountList.remove(sally);
		
		highestBal = accountList.get(0).getBalance(); // Reset the highest balance as the first balance in the list
		highestAcctNum = 1; // Reset the highest account number as the first account number in the list
		highestName = ""; // Reset the highest name
		for (BankAccount account : accountList) { // Loop over all accounts
			if (account.getBalance() > highestBal) { // If their balance > the current highest
				String info = account.getAccount(); // Set all the highest info to the new account's info
				String[] split = info.split(" ");
				highestName = split[0];
				highestAcctNum = Integer.parseInt(split[1]);
				highestBal = Double.parseDouble(split[2]);
			}
		}
		System.out.println("New Highest Account Balance:");
		System.out.println(highestName+"'s Account Info:\nAccount Number: "+highestAcctNum+" | Balance: $"+highestBal+"\n"); // Print the info
	}

}

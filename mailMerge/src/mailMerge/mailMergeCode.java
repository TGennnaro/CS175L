package mailMerge;
import java.util.Scanner;

public class mailMergeCode {

	public static void main(String[] args) {
		// Initialize Scanner
		Scanner in = new Scanner(System.in);
		
		// Initialize replace strings
		String replace1 = "Dear <firstName> <lastName>,";
		String replace2 = "Please confirm that your address is <houseNumber> <street>.";
		String replace3 = "Your answer is: <correct>, Goodbye!";
		
		// Initialize prompt strings
		String prompt1 = "Please enter your first name: ";
		String prompt2 = "Please enter your last name: ";
		String prompt3 = "Please enter your house number: ";
		String prompt4 = "Please enter your street: ";
		String prompt5 = "Is this address correct? (Yes/No): ";
		
		// Print Prompts
		System.out.print(prompt1);
		String firstName = in.nextLine();
		
		System.out.print(prompt2);
		String lastName = in.nextLine();
		
		System.out.print(prompt3);
		String houseNumber = in.nextLine();
		
		System.out.print(prompt4);
		String street = in.nextLine();
		
		// Replace text in replace strings
		replace1 = replace1.replace("<firstName> <lastName>", firstName+" "+lastName);
		replace2 = replace2.replace("<houseNumber> <street>", houseNumber+" "+street);
		
		// Clean console
		System.out.println();
		
		// Print replace strings after replacement
		System.out.println(replace1);
		System.out.println(replace2);
		
		// Print confirmation
		System.out.print(prompt5);
		String correct = in.nextLine();
		replace3 = replace3.replace("<correct>", correct);
		
		System.out.println(replace3);
		
		
		// Close Scanner
		in.close();
	}

}

import java.util.Scanner;

public class creditInput {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("Enter your Credit Card Number (-1 to end): ");
			String str = in.nextLine();
			if (str.equals("-1")) {
				System.out.println("Have a great day!");
				break;
			} else {
				int i=0;
				String start = null;
				String end = null;
				while (i<str.length()) {
					if (str.charAt(i) == ' ' || str.charAt(i) == '-') {
						start = str.substring(0,i);
						end = str.substring(i+1);
						str = start+end;
					}
					i++;
				}
				System.out.println("Your Credit Card Number: "+str);
			}
		}
		in.close();
	}

}

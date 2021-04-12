package multiplicationTable;

public class multiplication {

	public static void main(String[] args) {
		for (int i=1;i<=10;i++) {
			for (int a=1;a<=10;a++) {
				System.out.printf("%4s", a*i);
			}
			System.out.println();
		}
	}

}

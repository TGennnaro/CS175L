import javax.swing.JOptionPane;

public class romanNumerals {

	public static void main(String[] args) {
		String stringYear = JOptionPane.showInputDialog("Enter the year to convert: ");
		if (stringYear == null || stringYear.equals("")) {return;}
		int year = Integer.parseInt(stringYear);
		String roman = "";
		
		if (year > 4999) {
			JOptionPane.showMessageDialog(null, "This program does not support years beyond 4999.");
			return;
		}
		if (year < 1) {
			JOptionPane.showMessageDialog(null, "The year must be greater than 0.");
			return;
		}
		
		// Millennia
		int num1 = (year/1000)%10;
		for (int i=0;i<num1;i++) {
			roman = roman + "M";
		}
		
		// Centuries
		int num2 = (year/100)%10;
		if (num2 < 4) {
			for (int i=0;i<num2;i++) {
				roman = roman + "C";
			}
		} else if (num2 == 4) {
			roman = roman + "CD";
		} else if (num2 < 9) {
			roman = roman + "D";
			for (int i=0;i<num2-5;i++) {
				roman = roman + "C";
			}
		} else if (num2 == 9) {
			roman = roman + "CM";
		}
		
		// Decades
		int num3 = (year/10)%10;
		if (num3 < 4) {
			for (int i=0;i<num3;i++) {
				roman = roman + "X";
			}
		} else if (num3 == 4) {
			roman = roman + "XL";
		} else if (num3 < 9) {
			roman = roman + "L";
			for (int i=0;i<num3-5;i++) {
				roman = roman + "X";
			}
		} else if (num3 == 9) {
			roman = roman + "XC";
		}
		
		// Years
		int num4 = year%10;
		if (num4 < 4) {
			for (int i=0;i<num4;i++) {
				roman = roman + "I";
			}
		} else if (num4 == 4) {
			roman = roman + "IV";
		} else if (num4 < 9) {
			roman = roman + "V";
			for (int i=0;i<num4-5;i++) {
				roman = roman + "I";
			}
		} else if (num4 == 9) {
			roman = roman + "IX";
		}
		
		JOptionPane.showMessageDialog(null, "Year in Roman Numerals: "+roman);
	}

}

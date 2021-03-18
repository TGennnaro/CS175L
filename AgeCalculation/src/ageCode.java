import java.time.LocalDate;

import javax.swing.JOptionPane;

public class ageCode {

	public static void main(String[] args) {
		String bday = JOptionPane.showInputDialog("Enter your birthday (MM/DD/YYYY):");
		String[] bdayList = bday.split("/");
		int month = Integer.parseInt(bdayList[0]);
		int day = Integer.parseInt(bdayList[1]);
		int year = Integer.parseInt(bdayList[2]);
		
		if (month < 1 || month > 12) {
			JOptionPane.showMessageDialog(null, "Invalid Month");
			return;
		}
		if (day < 1 || day > 31) {
			JOptionPane.showMessageDialog(null, "Invalid Day");
			return;
		}
		
		LocalDate date = LocalDate.now();
		
		int dateMonth = date.getMonthValue();
		int dateDay = date.getDayOfMonth();
		int dateYear = date.getYear();
		
		if ((year > dateYear) || (year >= dateYear && month > dateMonth) || (year >= dateYear && month >= dateMonth && day > dateDay)) {
			JOptionPane.showMessageDialog(null, "You weren't born in the future!");
			return;
		}
		if (month == dateMonth && day == dateDay && year == dateYear) {
			JOptionPane.showMessageDialog(null, "You were born today, "+month+"/"+day+"/"+year+". Congratulations!");
			return;
		}
		
		int ageYear = dateYear-year;
		int ageMonth = dateMonth-month;
		boolean birthday = false;
		
		if (ageMonth < 0) {
			ageMonth = 12+ageMonth;
		}
		if (dateMonth < month) {
			ageYear = ageYear-1;
		} else if (dateMonth == month) {
			if (dateDay < day) {
				ageYear = ageYear-1;
			} else if (dateDay == day) {
				birthday = true;
			}
		}
		if (birthday) {
			JOptionPane.showMessageDialog(null, "Happy birthday! You are "+ageYear+" years old.");
		} else {
			JOptionPane.showMessageDialog(null, "You are "+ageYear+" year(s) and "+ageMonth+" month(s) old.");
		}
	}

}

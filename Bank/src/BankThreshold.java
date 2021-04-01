
public class BankThreshold {
	public int calcThreshold(double threshold, double interest, double bal){
		int month = 0;
		
		while (bal < threshold) {
			bal = bal*(interest+1);
			month++;
		}
		
		return month;
	}
}

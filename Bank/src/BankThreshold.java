
public class BankThreshold {
	public int calcThreshold(double threshold, double interest, double bal){
		int months = 0;
		
		while (bal < threshold) {
			bal = bal*(interest+1);
			months++;
		}
		
		return months;
	}
}

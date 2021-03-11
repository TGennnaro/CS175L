import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class RoachSimulation {

	public static void main(String[] args) {
		String popInput = JOptionPane.showInputDialog("Enter initial population: ");
		RoachPopulation bugs = new RoachPopulation(Integer.parseInt(popInput));
		DecimalFormat decFormat = new DecimalFormat("0");
		
		boolean running = true;
		int cycle = 1;
		while (running) {
			int shouldBreed = JOptionPane.showConfirmDialog(null, "Should cycle "+cycle+" breeding take place?");
			if (shouldBreed == 0)
				bugs.breed();
				JOptionPane.showMessageDialog(null, "Population after cycle "+cycle+" breeding is "+decFormat.format(bugs.getRoaches())+".");
			if (shouldBreed == 2) {
				running = false;
				return;
			}
			
			int doCycle = JOptionPane.showConfirmDialog(null, "Enter spray cycle "+cycle+"?");
			if (doCycle == 0) {
				String pct = JOptionPane.showInputDialog("Enter spray percentage: ");
				if (pct == null) {
					running = false;
					return;
				}
				double sprayPct = Double.parseDouble(pct);
				bugs.spray(sprayPct);
				JOptionPane.showMessageDialog(null, "Remaining Population: "+decFormat.format(bugs.getRoaches())+".");
			} else {
				running = false;
			}
			cycle++;
		}
	}
}

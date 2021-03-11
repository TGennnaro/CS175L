public class RoachPopulation {
	public double population;
	public RoachPopulation(int pop) {
		population = pop;
	}
	
	public void breed() {
		population = population*2;
	}
	
	public void spray(double pct) {
		population = population-(population*pct);
	}
	
	public double getRoaches() {
		return population;
	}
}
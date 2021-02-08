import java.util.Scanner;

public class houseCode {

	public static void main(String[] args) {
		
		// Initial definitions
		Scanner in = new Scanner(System.in);
		int length,width,height,base,roofHeight,roofSquare,roof,baseTotal,roofTotal,netTotal,windowLength,windowWidth,windowArea,numWindows,windowTotal,doorLength,doorWidth,doorArea,numDoors,doorTotal,totalArea;
		float cost,totalCost;
		
		// Gather measurements from user
		System.out.println("Input length of house in feet: ");
		length = in.nextInt();
		System.out.println("Input width of house in feet: ");
		width = in.nextInt();
		System.out.println("Input height of house in feet: ");
		height = in.nextInt();
		
		//Calculate the total area of base and roof
		base = length*width;
		roofHeight = height-width;
		roofSquare = length*roofHeight;
		roof = roofSquare/2;
		
		// Multiply total area to cover all sides of house
		baseTotal = base*4;
		roofTotal = roof*2;
		netTotal = baseTotal+roofTotal;
		
		// Find total area of windows
		System.out.println("Input length of windows in feet: ");
		windowLength = in.nextInt();
		System.out.println("Input width of windows in feet: ");
		windowWidth = in.nextInt();
		System.out.println("Input number of windows: ");
		numWindows = in.nextInt();
		windowArea = windowLength*windowWidth;
		windowTotal = windowArea*numWindows;
		
		// Find total area of door
		System.out.println("Input length of doors in feet: ");
		doorLength = in.nextInt();
		System.out.println("Input width of doors in feet: ");
		doorWidth = in.nextInt();
		System.out.println("Input number of doors: ");
		numDoors = in.nextInt();
		doorArea = doorLength*doorWidth;
		doorTotal = doorArea*numDoors;
		
		// Final calculations to determine the total area to be painted
		totalArea = netTotal-(windowTotal+doorTotal);
		System.out.println("Input cost per square foot: ");
		cost = in.nextInt();
		totalCost = cost*totalArea;
		
		// Output the total cost
		System.out.println("The total cost to paint "+totalArea+" square feet is $"+totalCost);
		
		// Close scanner
		in.close();
	}

}

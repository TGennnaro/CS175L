package randArrayAndSearch;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ArrayandSearch {

	public static void main(String[] args) {
		int[] array = new int[50];
		Random random = new Random();
		System.out.print("Array: ");
		for (int i=0;i<50;i++) {
			array[i] = random.nextInt(25)+1;
			System.out.print(array[i]+" ");
		}
		System.out.println();
		int largest = array[0];
		int smallest = array[0];
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for (int i=0;i<array.length;i++) {
			if (array[i] > largest) {
				largest = array[i];
			}
			if (array[i] < smallest) {
				smallest = array[i];
			}
			if (!map.containsKey(array[i])) {
				map.put(array[i], 1);
			} else {
				map.put(array[i], map.get(array[i])+1);
			}
		}
		int largestOcc = map.get(array[0]);
		int largestKey = 0;
		for (int i=0;i<array.length;i++) {
			int occ = map.get(array[i]);
			if (occ > largestOcc) {
				largestOcc = occ;
				largestKey = array[i];
			}
		}
		System.out.println("Largest: "+largest+" | Smallest: "+smallest+" | Product: "+largest*smallest);
		System.out.println(largestKey+" occurred the most with "+map.get(largestKey)+" occurrences");
	}

}

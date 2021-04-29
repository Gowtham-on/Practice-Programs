import java.util.*;

public class LargeAndSmallNumInArray {

	public static void main(String[] args) {
		
		//There are three ways to get the solution
		
		int[] num = {43,-12,47,63,76,1,-35,897,-32,235};
		
		System.out.println("1. Using loops and conditions");
		System.out.println();
		//Using loops and conditions
		int largest = num[0];
		int smallest = num[0];
		
		for(int i=1;i<num.length;i++) {
			if(num[i]>largest) {
				largest = num[i];
			}
			else if(num[i]<smallest) {
				smallest = num[i];
			}
		}
		System.out.println("Largest num is: "+ largest);
		System.out.println("Smallest num is: "+ smallest);
		
		System.out.println();
		////////////////////////////////////////////////////////////////
		
		//Converting array into list
		System.out.println("2. By converting into list");
		System.out.println();
		
		List<Integer> ls = new ArrayList<Integer>();
		
		for(int z: num) {
			ls.add(z);
		}
		System.out.println("Largest num is: "+Collections.max(ls));
		System.out.println("Smallest num is: "+Collections.min(ls));
		
		System.out.println();
		////////////////////////////////////////////////////////////////
		
		//By sorting the array
		System.out.println("3. By sorting array");
		System.out.println();
		
		Arrays.sort(num);
		
		System.out.println("Smallest num is "+ num[0]);
		System.out.println("Largest num is "+ num[num.length-1]);
		
		
	}

}

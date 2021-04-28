import java.util.*;

public class RemoveDupElementInArray {

	public static void main(String[] args) {
		String[] s = {"one","two","three","one","four","one","five","one"};
		
		ArrayList<String> l = new ArrayList<String>();
		
		for(String elements: s )
			l.add(elements);
		
		System.out.println("Array: "+l);
		 
		System.out.println();
		for(int i =0; i<l.size();i++) {
			for(int j =0; j<l.size();j++) {
				if(i==j) {
					continue;
				}
				
				if(l.get(i)==l.get(j)) {
					l.remove(j);
				
				}
			}
		}
		System.out.println("After removing duplicate elements: "+l);
		
		
		
	}

}

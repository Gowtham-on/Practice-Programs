//Stacks

import java.util.Iterator;
import java.util.LinkedList;

public class iterator {

	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<String>();
		
		names.push("John");
		names.push("Sue");
		names.push("Moe");
		
		Iterator<String> it = names.iterator();
		//Method 1 - To Print the list
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		
		///////////////////////////////////////////////////////////////
		
		
		//Method 2 - To Print the list
		for(String s: names) {
			System.out.println(s);
		}
		System.out.println("");
		
		///////////////////////////////////////////////////////////////
		
		//To insert new name
		names.add(2,"Elder");
		
		for(String s: names) {
			System.out.println(s);
		}

	}

}

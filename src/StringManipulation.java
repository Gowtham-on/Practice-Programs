
public class StringManipulation {

	public static void main(String[] args) {
		
		String s = "quick brown fox jumps over the lazy dog and lazy cat";
		
		System.out.println(s.length());
		
		System.out.println(s.charAt(7)); //r
		
		System.out.println(s.indexOf('z')); //33
		
		System.out.println(s.indexOf('z', s.indexOf('z')+1)); //46 .... //('z', index)

		System.out.println(s.indexOf("fox")); //12
		
		System.out.println(s.indexOf("hello")); //-1  if there is no such char it returns -1
	
		//////////////////////////////////////////////////////////////////////////////////////////////
		
		//Comparing two string
		
		String s2 = " in the world";
		
		System.out.println(s.equals(s2)); //false
		
		System.out.println(s.concat(s2)); //adds two string
		
		System.out.println(s.compareTo(s2));
		
		//////////////////////////////////////////////////////////////////////////////////////////////
		
		//Substring
		
		System.out.println(s.substring(0,15));
		System.out.println(s.subSequence(0, 15));
		
		//Trim
		
		String s3 = "     	Hello i  am java     ";
		
		System.out.println(s3.trim()); //Removes spaces in the beginning and ending
		
		//Replacing
		
		String s4 = "Hello, How are you?";
		System.out.println(s4.replace("Hello", "Hi")); //Hi, How are you?
	
	}
	
}

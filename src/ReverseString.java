import java.util.Scanner;


public class ReverseString {
	
	public static String inwords;
	public int a;
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter the word: ");
		inwords = inp.nextLine();
		prog();
		inp.close();
	}
	public static void prog() {
		char[] word = new char[inwords.length()];
		
		word = inwords.toCharArray();
		
		System.out.print("Using for Loop: " );
		
		//String is an immutable object. So there is no inbuilt function to reverse.
		//we can reverse using for loop
		for(int j=inwords.length()-1;j>=0;j--) {
			System.out.print(word[j]);
		}
		
		//Another method using StringBuffer
		//We can make a string mutable using StringBuffer
		StringBuffer sf = new StringBuffer(inwords);
		sf.reverse();
		System.out.println();
		System.out.println("Using StringBuffer: "+sf);
	}
	
}




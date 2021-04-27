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
		
		System.out.print("The reverse of the word is: " );
		
		for(int j=inwords.length()-1;j>=0;j--) {
			System.out.print(word[j]);
		}
	}
	
}




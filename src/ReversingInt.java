

public class ReversingInt {

	public static void main(String[] args) {
		
		//There are two methods to reverse the integer
		
		//1. Using loop
		int a = 560789;
		int b = 0;
		while(a!=0) {
			b = b*10 + a%10;
			a = a/10;
		}
		System.out.println("The reverse num is " + b);
		
		//2. Using StringBuffer
		int num = 781243;
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		System.out.println("The reverse num of "+ num+" is "+sb.reverse());
	}

}

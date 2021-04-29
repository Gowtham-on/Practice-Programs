
public class MissingNumInArray {

	public static void main(String[] args) {
		int[] a = {1,2,3,5};
		 
		//Sum of our array with all elements is 15
		//Sum of our array with one element missing is 11
		
		int sum = 0;
		
		
		
		for(int i=0;i<a.length;i++) {
			sum = sum + a[i];
		}
		System.out.println(sum); // 11
		
		int missing = 0;
		for(int j=0;j<=5;j++) {
			missing = missing + j;
		}
		System.out.println(missing); //15
		
		System.out.println("Missing number is "+(missing - sum)); //4

	}

}

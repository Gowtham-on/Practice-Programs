import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		int num = inp.nextInt();
		
		for(int i =0;i<num;i++) {
			for(int j=0;j<=i;j++) {
					System.out.print("*");
			}
			
			System.out.println("");
		}
		for(int k = 0;k<num-1;k++) {
			for(int l = num-1;l>k;l--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		inp.close();
		
	}

}

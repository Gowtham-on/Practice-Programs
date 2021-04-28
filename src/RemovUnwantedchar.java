
public class RemovUnwantedchar {

	public static void main(String[] args) {
		String s = "I am *&&%^%java";
		
		//We can remove unwanted char using regular expression
		s = s.replaceAll("[^ a-zA-Z0-9]", "");
		System.out.println(s);

	}

}

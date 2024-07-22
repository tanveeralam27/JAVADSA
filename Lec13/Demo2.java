package Lec13;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";       
		String s2 = "Hello";
		
		String s3 = new String("Hello");  
		String s4 = new String("Hello");
		 String s = s1+s2; //after applying any operation String pool se bahar aa jata h and uski copy heap me banti h and usi me changes add honge
		System.out.println(s);
		s1= s1+s2;	//string is immutable bcoz same
		System.out.println(s1);
		
	}

}

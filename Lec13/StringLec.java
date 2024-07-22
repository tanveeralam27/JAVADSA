package Lec13;

public class StringLec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String is a class in java non primitive creation
		//without new keyword wle ka location string pool or intern pool
		//reference not work in pool(Duplicates are not allowed) different address
		String s1 = "Hello";       // string pool me save hoga heap memory ka special area
		String s2 = "Hello";
		// duplicate are allowed different variable refer same address
		String s3 = new String("Hello"); // direct heap me save hoga 
		String s4 = new String("Hello"); 
		//the string class has a to_string method which get override due to which content print not address
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}

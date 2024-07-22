package Lec13;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "the sky is blue";
		s=s.trim();
		System.out.println(s);
		String arr[]= s.split(" \s+");
		String output= "";
		for(int i=arr.length-1;i>=0;i--) {
			output+=arr[i]+" ";
		
		}
		System.out.println(output);
	}

}

package Lec13;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Nitin";
		System.out.println(Check_Palindrome(s.toLowerCase()));
	}
	public static boolean Check_Palindrome(String s) {
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}

package Recursion;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "MADAM";
		System.out.println(CheckPalindrome(s,0,s.length()-1));
		System.out.println(CheckSinglePointer(s,0));
	}
	public static boolean CheckPalindrome(String s, int i, int n) {
		if(i>=n) {
			return true;
		}
		if(s.charAt(i)==s.charAt(n)) {
			return CheckPalindrome(s,i+1,n-1);
		}
		return false;
	}
	public static boolean CheckSinglePointer(String s, int i) {
		int n= s.length();
		if(i>=n/2) {
			return true;
		}
		if(s.charAt(i)==s.charAt(n-i-1)) {
			return CheckSinglePointer(s,i+1);
		}
		return false;
//		if(s.charAt(i)!=s.charAt(n-i-1)) {
//			return false;
//		}
//		return CheckSinglePointer(s,i+1);
//		
	}
}

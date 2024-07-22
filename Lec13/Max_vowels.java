package Lec13;

import java.util.Scanner;

public class Max_vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(Max_Vowels(s));
	}
	public static int Max_Vowels(String s) {
		int ans=0;
		int count =0;
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(Is_Vowels(ch)==true) {
				count++;
				
			}else {
				ans=Math.max(ans, count);
				count=0;
			}
		}
		return Math.max(ans, count);
		
	}
	
	public static Boolean Is_Vowels(char c) {
		if ( c == 'a' || c=='e' || c=='i' || c=='o' || c=='u') {
			return true;
		}
		return false;
	}

}

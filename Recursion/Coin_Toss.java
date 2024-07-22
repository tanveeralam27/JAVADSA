package Recursion;

public class Coin_Toss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		String ans="";
		//Coin(n,ans);
		Coin2(n,ans);
	}
	public static void Coin(int n,String s) {
		if(n==0) {
			System.out.println(s);
			return;
		}
		Coin(n-1,s+"H");
		Coin(n-1,s+"T");
	}
	public static void Coin2(int n, String s) {
		if(n==0) {
			System.out.println(s);
			return;
		}
		if(s.length()==0 || s.charAt(s.length()-1)!='H') {
			Coin2(n-1,s+"H");
		}
		Coin2(n-1,s+"T");
	}

}

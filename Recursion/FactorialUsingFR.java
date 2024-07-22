package Recursion;

public class FactorialUsingFR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		System.out.println(Fact(n));
	}
	public static int Fact(int n) {
		if(n==1) {
			return 1;
		}
		return n*Fact(n-1);
	}
}

package Recursion;

public class SumNnumFunctionalRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		System.out.println(SumN(n));
	}
	public static int SumN(int n) {
		if(n==0) {
			return 0;
		}
		return n+ SumN(n-1);
	}
}

package Recursion;

public class SumNnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=-5;
		SumOfFirstN(n,0);
	}
	public static void SumOfFirstN(int n,int ans) {
		if(n<1) {
			System.out.println(ans);
			return;
		}
		//ans = ans+n;
		SumOfFirstN(n-1,ans+n);
	}
}

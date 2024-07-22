package Recursion;

public class Nto1Backtrack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		Printnum(1,n);
	}
	public static void Printnum(int i, int n) {
		if(i>n) {
		return;	
		}
	
		Printnum(i+1,n);
		System.out.println(i);
	}
}

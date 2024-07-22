package Recursion;

public class FibonacciNthTerm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		System.out.println(Fibonacci(n));
	}
	public static int Fibonacci(int n) {
		if(n<=1) {
			return n;
		}
		int last = Fibonacci(n-1);
		int slast = Fibonacci(n-2);
		return last+slast;
	}

}

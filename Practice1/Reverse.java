package Practice1;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(reverse_num(n));
	}
	public static int reverse_num(int n) {
		int sum=0;
		while(n>0) {
			int rem = n%10;
			sum = sum*10 + rem;
			n= n/10;
		}
		return sum;
	}
}

package Practice1;

import java.util.Scanner;

public class Sum_of_Odd_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int odd_sum=0;
		int even_sum=0;
		int count=1;
		while(n>0) {
			
			int rem = n%10;
			if(count%2!=0) {
			 odd_sum=odd_sum+rem;
			}
			else {
				even_sum=even_sum+rem;
			}
			count++;
			n=n/10;
		}
		System.out.println(odd_sum);
		System.out.println(even_sum);
	}
	
}

package Practice1;

import java.util.Scanner;

public class Conversion_AnyToAny {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int sb = sc.nextInt();
		int db = sc.nextInt();
		int n = sc.nextInt();
		if(db!=10 && sb!=10) {
		System.out.println(To_Decimal(sb,db,n));
		}
		else {
			System.out.println(from_Any(sb,db,n));
		}
	}
	
	public static int To_Decimal(int sb, int db,int n) {
		int sum=0;
		int mul=1;
		while(n>0) {
			int rem =n%10;
			sum = sum +mul*rem;
			mul =mul *sb;
			n=n/10;
		}
		int num = from_Decimal(sb,db,sum);
		return num;
	}
	
	public static int from_Decimal(int sb, int db,int n) {
		int sum=0;
		int mul=1;
		while(n>0) {
			int rem =n%db;
			sum = sum +mul*rem;
			mul =mul *10;
			n=n/db;
		}
		return sum;
	}
	public static int from_Any(int sb, int db,int n) {
		int sum=0;
		int mul=1;
		while(n>0) {
			int rem =n%db;
			sum = sum +mul*rem;
			mul =mul *sb;
			n=n/db;
		}
		return sum;
	}
}

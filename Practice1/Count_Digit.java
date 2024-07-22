package Practice1;

import java.util.Scanner;

public class Count_Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int d=sc.nextInt()
;
  System.out.println(Count_d( n, d));
	}
  public static int Count_d(int n,int d) {
	  int count=0;
	  while(n>0) {
		  int rem=n%10;
		  
		  if(rem==d) {
			  count++;
		  }
		  n=n/10;
	  }
	  return count;
  }
	
	
}

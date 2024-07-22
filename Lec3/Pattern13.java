package Lec3;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int row=1;
		int n=sc.nextInt();
		int star=1;
		//row
		while(row<=2*n-1) {
			//star
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			//mirror
			if(row>=n) {
				star++;
			}else {
				star--;
			}
			//next prep
			row++;
			
			System.out.println();
		}
	}

}

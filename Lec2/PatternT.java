package Lec2;

public class PatternT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=1;
		int n=5;
		int star=n;
		int space=n/2;
		while(row<=n) {
			if(row>1) {
			int j=1;
			while(j<=space) {
				System.out.print(" ");
				j++;
			}
			System.out.print("*");
			}
			else {
			int i=1;
			while(i<=star) {
				System.out.print("*");
				i++;
			}
			}
			row++;
			System.out.println();
			
		}
		
	}

}

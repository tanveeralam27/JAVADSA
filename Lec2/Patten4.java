package Lec2;

public class Patten4 {

	public static void main(String[] args) {
		
		int row=1;
		int n=5;
		int star=1;
		int space=n-1;
		
		//row
		while(row<=n) {
			//space
			int j=1;
			while(j<=space) {
				System.out.print(" ");
				j++;
			}
			//star
			int i=1;
			while(i<=star) {
				System.out.print("*");
				i++;
			}
			//next prep
			row++;
			space--;
			star++;
			System.out.println();
		}
	}
}

package Lec2;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
				if(i%2==0) {
				System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
				i++;
			}
			//next prep
			row++;
			space--;
			star+=2;
			System.out.println();
	  }
	}
}

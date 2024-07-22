package Lec2;

public class Patten10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int row=1;
		int star=9;
		int space=0;
		
		//row
		while(row<=n) {
			
			//space
			int i=1;
			while(i<=space) {
				System.out.print(" ");
				i++;
			}
			//Star
			int j=1;
			while(j<=star) {
				System.out.print("*");
				j++;
			}
			//nextprep
			row++;
			star-=2;
			space++;
			System.out.println();
		}
	}

}

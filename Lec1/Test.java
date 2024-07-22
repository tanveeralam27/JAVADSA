package lec1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int row=1;
		int star = n;
		int space=0;
		//row
		while(row<=n) {
			
			//space
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			//star
			int j=1;
			while(j<=star) {
				System.out.print("* ");
			j++;
			}
			//next prep
			System.out.println();
			row++;
			space+=2;
			star--;
		}	
	}
}

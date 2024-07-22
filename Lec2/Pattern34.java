package Lec2;

public class Pattern34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8;
		int row=1;
		int star=n;
		while(row<=n) {
			
			int i=1;
			while(i<=star-row) {
				System.out.print("1");
				i++;
			}
			int j=1;
			while(j<=row) {
				System.out.print(row);
				j++;
			}
			row++;
			System.out.println();
		}
	}

}

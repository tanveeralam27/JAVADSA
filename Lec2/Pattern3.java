package Lec2;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=1;
		int n=5;
		int star=5;
		
		//star
		while(row<=n) {
			
			int i=1;
			while(i<=star) {
				System.out.print("* ");
			 i++;
			}
			//next prep
			row++;
			star--;
			System.out.println();
		}
		
	}

}

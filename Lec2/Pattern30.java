package Lec2;

public class Pattern30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int row=1;
		int num=5;
		//row
		while(row<=n) {
			
			//num
			int i=1;
			int count=5;
			while(i<=num) {
				System.out.print(count+ " ");
				i++;
				count--;
			}
			//NP
			row++;
			System.out.println();
		}
	}

}

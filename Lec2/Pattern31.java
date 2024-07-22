package Lec2;

public class Pattern31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int row=1;
		int num=5;
		int a=5;
		//row
		while(row<=n) {
			
			//num
			int i=1;
			int count=5;
			while(i<=num) {
				if(i==a) {
					System.out.print("* ");
				}else {
				System.out.print(count+ " ");
				}
				i++;
				count--;
			}
			//NP
			row++;
			a--;
			System.out.println();
		}
	}

}

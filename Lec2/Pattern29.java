package Lec2;

public class Pattern29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int row=1;
		int num=1;
		int space=n-1;
		int cnt=1;
		//row
		while(row<=n) {
			
			//space
			int j=1;
			while(j<=space) {
				System.out.print(" ");
				j++;
			}
			//num
			int i=1;
			int count=cnt;
			while(i<=num) {
				if(i==1 || i==num) {
				System.out.print(count);
				i++;
			}
				else {
					System.out.print("0");
					i++;
					
				}
			}
			
			//NP
			row++;
			num+=2;
			space--;
			cnt++;
			System.out.println();
	}
 }
}

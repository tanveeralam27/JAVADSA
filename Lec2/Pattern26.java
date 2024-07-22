package Lec2;

public class Pattern26 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int n=5;
			int row=1;
			int num=1;
			int space=n-1;
			
			//row
			while(row<=n) {
				//space
				int j=1;
				while(j<=space) {
					System.out.print("  ");
					j++;
				}
				//num
				int i=1;
				int count=1;
				while(i<=num) {
					System.out.print(count++ +" ");
					i++;
				}
				//NP
				row++;
				num+=2;
				space--;
				count++;
				System.out.println();
		}
	}
	
}

package Lec2;

public class Pattern22 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int n=5;
			int row=1;
			int star=5;
			int space=-1;
			
			//row
			while(row<=n) {
				
				int i=1;
				//star
				if(row==1) {
					i=2;
				}
				while(i<=star) {
					System.out.print("* ");
					i++;
				}
				//space
				int j=1;
				while(j<=space) {
					System.out.print("  ");
					j++;
				}
				//star
				int k=1;
				
				while(k<=star) {
					System.out.print("* ");
					k++;
				}
				
				//next prep
				row++;
				star--;
				space+=2;
				System.out.println();
			}
		}
	}



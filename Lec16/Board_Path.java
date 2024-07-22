package Lec16;

public class Board_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		String ans="";
		int start=0;
		board(n,ans,start);
	}
	public static void board(int n,String ans, int start){
		if(start==n) {
			System.out.println(ans);
			return;
		}
		if(start>n) {
			return;
		}
		for(int i=1;i<=6;i++) {
			board(n,ans+i,start+i);
		}
//		board(n,ans+1,start+1);
//		board(n,ans+2,start+2);
//		board(n,ans+3,start+3);
    }
}

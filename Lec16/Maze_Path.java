package Lec16;

public class Maze_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		int m=3;
		maze(0,0,n-1,m-1,"");
	}
	public static void maze(int cr, int cc, int er,int ec,String ans){
		if(cc==ec && cr==er) {
			System.out.println(ans);
			return;
		}
		if(cc>ec || cr>er) {
			return;
		}
		maze(cr+1,cc,er,ec,ans+"V");
		maze(cr,cc+1,er,ec,ans+"H");
		
    }
}

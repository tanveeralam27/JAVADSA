package Lec17;

public class Lexicographical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=13;
		LexicographicalNumber(0,n);
	}
	public static void LexicographicalNumber(int curr, int end) {
		if(curr>end) {
			return;
		}if(curr!=0) {
		System.out.println(curr);
		}
		int i=0;
		if(curr==0) {
			i=1;
		}
		for(;i<=9;i++) {
			LexicographicalNumber(curr*10+i,end);
		}
		
	}

}

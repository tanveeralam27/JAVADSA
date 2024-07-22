package Lec17;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String que = "abca";
		String ans = "";
		StringPermutation(que,ans);
	}
	public static void StringPermutation(String que, String ans) {
		if(que.length()==0) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<que.length();i++) {
			char ch= que.charAt(i);
			String s1 = que.substring(0,i);
			String s2 = que.substring(i+1);
			StringPermutation(s1+s2, ans+ch);   
		}
		
	}
}

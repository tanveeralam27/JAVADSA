package Lec17;

public class Permutation2 {

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
			if(isPresent(que,ch,i+1)==false) {
			String s1 = que.substring(0,i);
			String s2 = que.substring(i+1);
			StringPermutation(s1+s2, ans+ch); 
			}
		}
	
	}
	public static boolean isPresent(String que, char ch,int i) {
		for(int j=i;j<que.length();j++) {
			if(que.charAt(j)==ch) {
				return true;
			}
		}
		return false;
	}
}

package Lec18;

public class Keypad {
	static String[] key = {"", "", "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String que = "23";
		char ch ='3';
		int as = (int)ch;
		System.out.println(as);
		KeypadCombo(que,"");
	}
	public static void KeypadCombo(String que, String ans) {
		if(que.length()==0) {
			System.out.println(ans);
			return;
		}
		char ch = que.charAt(0);
		String press = key[ch-'0'];
		for(int i=0;i<press.length();i++) {
			KeypadCombo(que.substring(1),ans+press.charAt(i));
		}

	}

}

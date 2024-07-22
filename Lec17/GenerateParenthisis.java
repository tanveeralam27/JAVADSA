package Lec17;
import java.util.*;
public class GenerateParenthisis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		List<String> paren = new ArrayList<>();
		Generate_Parenthesis(n,0,0,"",paren);
		System.out.println(paren);
	}
	public static void Generate_Parenthesis(int n, int open, int close,String ans, List<String> paren) {
		
		if(open==n && close==n) {
			paren.add(ans);
			return;
		}
		if(open>n || close>open) {
			return;
		}
		Generate_Parenthesis(n,open+1,close,ans+"(",paren);
		Generate_Parenthesis(n,open,close+1,ans+")",paren);
	}
	
}

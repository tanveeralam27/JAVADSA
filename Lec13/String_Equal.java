package Lec13;

public class String_Equal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "HEllo";
		String s2 = "HEllo";
		String s3 = new String("HEllo");
		
		System.out.println(s1.equals(s2));
		System.out.print(Check_Equal(s1,s3));
	
	}
	public static boolean Check_Equal(String s1, String s2) {
		
		if(s1==s2) {
			return true;
		}
		if(s1.length()!= s2.length()) {
			return false;
		}
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)!=s2.charAt(i)) {
				return false;
			}		
		}
		return true;
	}

}

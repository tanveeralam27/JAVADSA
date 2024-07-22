package Lec13;

public class CompareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a= 10;
		String s1="komal";
		String s2="kunal";
		String s3="raj";
		String s4="rajesh";
		System.out.println(s1.compareTo(s2));
		System.out.println(s4.compareTo(s3));
		System.out.println(Compare_To(s3,s4));
	}
	public static int Compare_To(String s1,String s2) {
		int len = Math.min(s1.length(), s2.length());
		for(int i=0;i<len;i++) {
			if(s1.charAt(i)!=s2.charAt(i)) {
				return s1.charAt(i)-s2.charAt(i);
			}
		}
		return s1.length()-s2.length();
	}

}

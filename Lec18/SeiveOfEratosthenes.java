package Lec18;

public class SeiveOfEratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		System.out.println(Prime(n));
	}
	public static int Prime(int n) {
		int[] arr = new int[n+1];
		arr[0]=1;
		arr[1]=1;
		int c=0;
		for(int i=2;i*i<=n;i++) {
			if(arr[i]==0) {
				for(int j=2;i*j<arr.length;j++) {
					arr[i*j]=1;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				c++;
				System.out.println(i);
			}
		}
		return c;
	}
}

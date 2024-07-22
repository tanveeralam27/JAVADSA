package Lec18;
import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=20;
		System.out.println(Prime(n));
	}
	public static int Prime(int n) {
		int count=0;
		for(int i=2;i<n;i++) {
			if(IsPrime(i)) {
				count++;
				System.out.println(i);
			}
		}
		return count;
	}
	public static boolean IsPrime(int n) {
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
}

package Lec12;

import java.util.Scanner;

public class Kth_Root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        Scanner sc = new Scanner(System.in);
	        int q = sc.nextInt();
	        for(int i=0;i<q;i++){
	            int n = sc.nextInt();
	            int k = sc.nextInt();
	            System.out.println(Kth_root(n,k));
	        }
	    }
	    public static int Kth_root(int n, int k){
	        int i=1;
	        int j=n;
	        int ans=0;
	        while(i<=j){
	            int mid = i+(j-i)/2;
	            if(Math.pow(mid,k)<=n){
	                ans=mid;
	                i=mid+1;
	            }else{
	                j=mid-1;
	            }
	        }
	        return ans;
	    }
}

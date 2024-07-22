package Lec15;
import java.util.*;

public class CBNUMBER {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);
		        //int n =sc.nextInt();
		        //String s = sc.next();
//		        while(s.length()!=n){
//		            s = sc.next();
//		        }
		        System.out.print(CBnum("81615"));
		    }
		    public static int CBnum(String s){
		        int count=0;
		        boolean[] visited = new boolean[s.length()];
		        for(int i=1;i<=s.length();i++){
		            for(int j=i;j<=s.length();j++){
		                int k=j-i;
		                String p = s.substring(k,j);
		                System.out.println("string"+ p);
		                if(isCB(Long.parseLong(p))==true && isVisited(visited,k,j)==true){
		                    count++;
		                    System.out.println("count"+ count);
		                 
		                    for(int l=k;l<j;l++){
		                        visited[l]=true;
		                    }
		                }
		            }
		        }
		        
		        return count;
		    }
		    public static boolean isVisited(boolean[] visited, int start, int end){
		        for(int k=start;k<end;k++){
		            if(visited[k]==true){
		            	System.out.println("visted"+visited[k]);
		                return false;
		            }
		        }
		        return true;
		    }
		    public static boolean isCB(long n){
		        int[] arr = {2,3,5,7,11,13,17,19,23,29};
		        if(n==0 || n==1){
		            return false;
		        }
		        for(int i=0;i<arr.length;i++){
		            if(arr[i]==n){
		                return true;
		            }
		            if(n%arr[i]==0){
		                return false;
		            }
		        }
		        return true;
		    }
	}

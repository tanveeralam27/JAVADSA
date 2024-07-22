package Recursion;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		Reverse(arr,0,arr.length-1);
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static int[] Reverse(int[] arr, int i, int j) {
		if(i>=j) {
			return arr;
		}
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		return Reverse(arr,i+1,j-1);
	}

}

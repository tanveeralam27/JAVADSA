package Practice2;

public class Reverse_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,4,5,1,2};
		int k=2;
		int n=arr.length;
		reverse(arr,0,n-k-1);
		reverse(arr,n-k,n-1);
		reverse(arr,0,arr.length-1);
		
		for(int l=0;l<arr.length;l++) {
		System.out.print(arr[l]);
		}
	}
	public static void reverse(int arr[],int i,int j) {
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;		
		}
	}
}

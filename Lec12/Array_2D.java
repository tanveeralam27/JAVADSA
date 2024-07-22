package Lec12;

public class Array_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		
		int[][] arr =  new int[3][4];
		System.out.println(arr);
		System.out.println(arr[2]);
		System.out.println(arr[1][2]);
		int[][] other = arr;
		System.out.println(other.length);  // row length
		System.out.println(other[0].length);   // colomn length of that particular row
		
	}

}

package Lec12;

public class Spiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{1,4,7,11},
						{2,5,8,12},
						{3,6,9,8}};
		Spiral(arr);
	}
	public static void Spiral(int arr[][]) {
		int minr=0;
		int minc=0;
		int maxr=arr.length-1;
		int maxc=arr[0].length-1;
		while(minc<=maxc && minr<=maxr) {
			for(int i=minc;i<=maxc&&minr<=maxr;i++) {
				System.out.print(arr[minr][i]+" "); //1 4 7 11   //5 8
			}
			minr++;                                 //1  //2
			for(int i=minr;i<=maxr&&minc<=maxc;i++) {           //fail
				System.out.print(arr[i][maxc]+" "); //12 8  
			}
			maxc--;									//2 //1
			for(int i=maxc;i>=minc&&minr<=maxr;i--) {
				System.out.print(arr[maxr][i]+" "); //9 6 3 //5
			}
			maxr--;                                //1 //
			for(int i=maxr;i>=minr&&minc<=maxc;i--) {
				System.out.print(arr[i][minc]+" "); //2
			}
			minc++;                                //1
		}
	}
}

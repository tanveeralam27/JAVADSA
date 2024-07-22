package Practice1;

public class checkinng_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "/OAPWW1D/log/test.csv";
		int slashIndex = path.lastIndexOf("/");
		System.out.println(slashIndex);
		String dirPath = path.substring(0,slashIndex+1);
		System.out.print(dirPath);
	}

}

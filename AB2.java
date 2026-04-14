import java.io.FileReader;
import java.io.FileNotFoundException;
class Abc{
	public static void main(String[] args) throws FileNotFoundException{
		FileReader fr = new FileReader("AB2.java");
		int[] arr = {1,2,3};
		System.out.println(arr[arr.length]);
		int a = 8;
		int b= 0;
		int ans = a /b;
	}
}
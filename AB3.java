import java.io.FileReader;
import java.io.FileNotFoundException;
class Abc{
	public static void main(String[] args) throws FileNotFoundException{
		try{
			FileReader fr = new FileReader("abc");

		}	
		catch(FileNotFoundException e){
			System.out.println("File Not Exist");
		}
		
		try{
			int[] arr = {1,2,3};
			System.out.println(arr[arr.length]);
		}
		catch(ArrayIndexOutOfBoundsException r){
			System.out.println("Given index number not present");
		}
		try{
			int a = 8;
			int b= 0;
			int ans = a /b;
		}
		catch(ArithmeticException q){
			System.out.println("Divide by zero not possible");
		}
	}
}
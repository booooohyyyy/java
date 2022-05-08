package quiz05;

import java.util.Arrays;

public class MainClass {
	
	public static void main(String[] args) {
		
		ArrayPrint Arr = new ArrayPrint();
		
		int[] arr = {1,2,3,4,5};
		char[] arr2 = {'가','나','다','라','마'};
		String[] arr3 = {"가위", "바위", "보"};
		
		System.out.println(Arr.toArray(arr));
		System.out.println(Arr.toArray(arr2));
		System.out.println(Arr.toArray(arr3));
		
		System.out.println("---------------------");

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
	}

}

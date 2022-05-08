package api.io.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class InputStreamEx {
	
	public static void main(String[] args) {
		
		/*
		 * 1. 파일을 읽을 때 사용하는 클래스는 FileInputStream
		 * 2. 생성자 매개변수로 읽어들일 파일의 전체경로를 적음
		 * 3. throws키워드가 있기 때문에 try~catch문에서 사용
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("읽을 파일명>");
		String fileName = scan.next();
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("C:\\Users\\user\\Desktop\\course\\java\\file\\" + fileName + ".txt");
			
			//1. 1바이트씩 읽기			
//			while(true) {
//				int data = fis.read();
//				if(data == -1) {
//					break;
//				}	
//				System.out.print((char)data);	
//			}
			
			//2. 바이트 배열단위로 읽기
			byte[] arr = new byte[100];
			
			int result = fis.read(arr);
			
			System.out.println("읽어들인 데이터 길이:" + result);
			System.out.println(Arrays.toString(arr));
			
//			for(int i = 0; i < result; i++) {
//				System.out.print((char)arr[i]);
//			}
			
			int i = 0;
			while(true) {
				if(arr[i] == 0) break;
				
				System.out.print((char)arr[i]);
				i++;
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
				scan.close();
			} catch (IOException e2) {
				
			}
		}
		
		
	}//end main
	
	
}

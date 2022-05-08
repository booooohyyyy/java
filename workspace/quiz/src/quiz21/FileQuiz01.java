package quiz21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileQuiz01 {
	
	public static void main(String[] args) {
		
		/*
		 * 1. 스캐너를 이용해서 파일명을 정확히 입력받습니다.
		 * 
		 * 2. fileupload폴더에 해당파일이 없다면, 해당파일 file폴더 안으로 복사해서 옮기기
		 *    혹시 파일이 없다면 "파일명이 없습니다" 예외구문을 출력
		 *    
		 * 3. 복사도중에 에러가 발생하면 "파일 처리중 예외발생" 구문을 출력
		 * 
		 * hint) InputStream, OutputStream 클래스 사용
		 */
		
		Scanner scan = new Scanner(System.in);
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		System.out.print("파일명 입력>");
		String file = scan.nextLine();
		
		try {
			fis = new FileInputStream("C:\\Users\\user\\Desktop\\course\\java\\fileupload\\"+ file + ".pdf");
			
			fos = new FileOutputStream("C:\\Users\\user\\Desktop\\course\\java\\file\\" + file +"_copy.pdf");
			
			byte[] arr = new byte[100]; //100byte 단위로 읽음
			int result;
			while((result = fis.read(arr)) != -1) {
				fos.write(arr, 0, result); //0에서 배열의 길이까지 데이터를 쓴다.
			}
			
			System.out.println("파일 정상 복사");
			
		} catch (FileNotFoundException e) {
			System.out.println("파일명이 없습니다.");
			e.printStackTrace();

		} catch (Exception e) {
			System.out.println("파일 읽는 도중 에러");
			e.printStackTrace();

		} finally {
			try {
				fis.close();
				fos.close();
				scan.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		
	}

}

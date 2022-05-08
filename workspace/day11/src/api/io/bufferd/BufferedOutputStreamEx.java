package api.io.bufferd;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class BufferedOutputStreamEx {
	
	public static void main(String[] args) {
		
		/*
		 * Buffered가 붙은 클래스들은 ㅡ속도향ㅇ상 입출력 스트림
		 * OutputStream은 바이트 기반으로 출력을 수행
		 */
		
		Scanner scan = new Scanner(System.in);
		
		BufferedOutputStream bf = null;
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("C:\\Users\\user\\Desktop\\course\\java\\file\\test02.txt");
			bf = new BufferedOutputStream(fos);
			
			System.out.print("문장을 입력>");
			String str = scan.nextLine();
			
			bf.write(str.getBytes()); //입력받은 문자열의 바이트 데이터 전달.
			
			bf.flush(); //모아놓은 버퍼를 내보내기.
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
				bf.close();
				scan.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}

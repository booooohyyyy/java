package api.io.bufferd;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferedWriterEx {
	
	public static void main(String[] args) {
		
		/*
		 * Buffered(성능향상) + writer(2바이트 단위)로 쓰는 클래스
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter("C:\\Users\\user\\Desktop\\course\\java\\file\\test03.txt"));
			
			System.out.print("문장 입력>");
			String str1 = scan.nextLine();
			System.out.print("문장 입력>");
			String str2 = scan.nextLine();
			
			bw.write(str1);
			bw.write("\r\n");
			bw.write(str2);
			
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				scan.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}

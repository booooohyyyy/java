package api.io.bufferd;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamEx {
	
	public static void main(String[] args) {
		
		/*
		 * Buffered가 붙은 성능향상 입력 스트림
		 * InputStream은 바이트 기반으로 읽음
		 */
		
		BufferedInputStream bis = null;
		
		
		try {
			bis = new BufferedInputStream(new FileInputStream("C:\\Users\\user\\Desktop\\course\\java\\file\\test02.txt"));
			
			int result;
			while((result = bis.read()) != -1 ) { //더 이상 읽을 데이터가 없으면 -1
				System.out.print((char)result);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}

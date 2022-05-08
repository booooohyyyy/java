package api.io.readwrite;

import java.io.FileReader;
import java.io.IOException;

public class ReaderEx {
	
	public static void main(String[] args) {
		
		/*
		 * 문자 기반으로 읽어들이는 클래스는 FileRreader클래스
		 * 2바이트 단위로 읽기 때문에 문자를 읽기에 적합
		 */
		
		FileReader fr = null;
		
		try {
			fr = new FileReader("C:\\Users\\user\\Desktop\\course\\java\\file\\test.txt");
					
			int result;
			while((result = fr.read()) != -1) {
				System.out.print((char)result);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		
		
	}

}

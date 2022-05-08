package api.io.bufferd;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class BufferedReaderEx {
	
	public static void main(String[] args) {
		
		
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\course\\java\\file\\test03.txt"));
			
			
			String str;
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
			//BufferedReader에서는 readLine() 메서드가 있고, 한 줄을 통째로 읽음
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		
	}

}

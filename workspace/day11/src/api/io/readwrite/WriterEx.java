package api.io.readwrite;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterEx {
	
	public static void main(String[] args) {
		
		/*
		 * 문자열(유니코드)를 이용해서 한글을 저장할 때 사용하는 클래스는 FileWriter클래스
		 * 2바이트 단위로 처리하기 때문에 문자를 읽고 쓰기 적합
		 */
		
		Writer fw = null;
		
		try {
			fw = new FileWriter("C:\\Users\\user\\Desktop\\course\\java\\file\\test.txt");
			
			String str = "오늘은 2021년 12월 20일 입니다.~ \r\n집에가자!";
			//"\r" - 마우스 커서를 맨 앞으로 돌려주는 기능
			fw.write(str);
			
			System.out.println("정상 출력!");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}

package quiz21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FileQuiz03 {
	
	public static void main(String[] args) {
		
		/*
		 * 1. Date or LocalDateTime클래스를 이용해서 file경로의 하위폴더로 
		 *     오늘날짜(20211220) 폴더를 만드세요.
		 * 
		 * 2. 스캐너로 파일명을 입력받고, BufferedWriter클래스를 이용해서 .txt파일을 생성.
		 * 3. exit 문자열을 받을 때 까지 엔터를 포함해서 입력받습니다.
		 *    \r\n을 적절하게 이용
		 * 
		 * 4. 파일을 다 썼다면 아무 방법으로 읽어오세요.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		LocalDate now = LocalDate.now();
		String format = now.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
		
		BufferedWriter bw = null;
		BufferedReader br = null;
		
		try {
			File file = new File("C:\\Users\\user\\Desktop\\course\\java\\file\\" + format);
			
			if(!file.exists()) {
				file.mkdir();
				System.out.println("폴더 생성 완료");
			}else {
				System.out.println("이미 존재하는 폴더명");
			}
			
			System.out.print("파일명 입력>");
			String fileName = scan.nextLine();
			//스트림을 통해 입력받은 기능 - 근본 방법
//			br = new BufferedReader(new InputStreamReader(System.in));
//			System.out.print("파일명>");
//			String name = br.readLine(); 
//			bw = new BufferedWriter(new FileWriter(file.getPath() + "\\" + name + ".txt"));
			
			bw = new BufferedWriter(new FileWriter("C:\\Users\\user\\Desktop\\course\\java\\file\\"+ format + "\\" + fileName + ".txt"));
			
			
			while(true) {
				System.out.print("내용 한 줄 입력>");
				String str = scan.nextLine();
				bw.write(str);
				bw.write("\r\n");
				
				if(str.equals("exit")) break;
			}
			bw.flush();
			
			System.out.println("---------------------------------");
			
			
			br = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\course\\java\\file\\"+ format + "\\" + fileName + ".txt"));
//			br = new BufferedReader(new InputStreamReader(new FileInputStream("경로", "UTF-8" );			
			String result;
			while((result = br.readLine()) != null) {
				System.out.println(result);
				
			}
	
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				br.close();
				scan.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
	}

}

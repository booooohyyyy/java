package quiz21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FileQuiz02 {
	
	public static void main(String[] args) {
		
		/*
		 * 1. Date나 LocalDateTime클래스를 이용해서 file경로에 오늘날짜.txt 이름으로 파일을 씀
		 * 2. 내용은 아무거나 작성
		 * 3. 파일이 정상 출력되었다면, BufferedReader클래스를 이용해서 파일의 내용을 읽어오세요.
		 */
		Scanner scan = new Scanner(System.in);
		
		LocalDate now = LocalDate.now();
		String format = now.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
		
		BufferedWriter bw = null;
		BufferedReader br = null;
		
		try {
			bw = new BufferedWriter(new FileWriter("C:\\Users\\user\\Desktop\\course\\java\\file\\" + format + ".txt"));
			
			System.out.print("문장입력>");
			String str = scan.nextLine();
			
			bw.write(str);
			bw.flush();
			
			System.out.println("파일 생성!");
			
			br = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\course\\java\\file\\" + format + ".txt"));
			
			String result;
			while((result = br.readLine())!= null) {
				System.out.println(result);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				scan.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
	}

}

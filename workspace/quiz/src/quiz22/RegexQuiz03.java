package quiz22;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RegexQuiz03 {
	
	static XSSFRow row;
	static XSSFCell cell;
	
	public static void main(String[] args) {
		//http://poi.apache.org/download.html#POI-4.1.1
		//1. 프로젝트 하위에 lib폴더 생성(src와 같은 level)
		//2. 필요한 jar파일을 lib에 넣기
		//3. 프로젝트 우클릭 build path -> library탭 -> add jar로 추가
		
		/*
		 * 1. day, store, grade, detail, price를 멤버변수로 갖는 Product클래스를 생성
		 * 2. getter, setter 생성
		 * 
		 * 3. Product를 제네릭으로 갖는 List 생성
		 * 4. BufferedReader 이용해서 건담.txt를 readLine()으로 읽어옴
		 * 5. 날짜, 지점, 등급, 상품내용, 가격을 패턴분석해서 Product에 저장하고 list에 저장.
		 * 
		 * 6. 분석한 패턴을 xlsx형식의 엑셀파일로 뽑으면 됌.
		 * 
		 */
		
		Product p = new Product();
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("mySheet");
		
		//출력 row 생성
		row = sheet.createRow(0);
		//출력 cell 생성
		row.createCell(0).setCellValue("날짜");
		row.createCell(1).setCellValue("지점");
		row.createCell(2).setCellValue("등급");
		row.createCell(3).setCellValue("상품내용");
		row.createCell(4).setCellValue("가격");
		
		int cnt = 1; // row 번호
		
		
		BufferedReader br = null;
		
		try {
			
			String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\";
			br = new BufferedReader(new InputStreamReader(new FileInputStream(path +"건담.txt")));
			
			String pattern1 = "\\d+-\\d{2}-\\d+";
			String pattern2 = "[가-힣]+\\s[가-힣]+";
			String pattern3 = "\\[[A-Z]*[가-힣]*\\]";
			String pattern5 = "\\d*\\,*\\d+[원]";
			
			String str;
			while((str = br.readLine()) != null) {
				System.out.println(str);
				
				Matcher m1 = Pattern.compile(pattern1).matcher(str);
				Matcher m2 = Pattern.compile(pattern2).matcher(str);
				Matcher m3 = Pattern.compile(pattern3).matcher(str);
				Matcher m5 = Pattern.compile(pattern5).matcher(str);
				
				while(m1.find() && m2.find() && m3.find() && m5.find()) {
					p.setDay(m1.group());
					p.setStore(m2.group());
					p.setGrade(m3.group());
					p.setPrice(m5.group());
					
					//패턴이 아닌 부분 남기기 = detail
					str = str.replace(p.getDay(), "");
					str = str.replace(p.getStore(), "");
					str = str.replace(p.getGrade(), "");
					str = str.replace(p.getPrice(), "");
					
					p.setDetail(str);
					
					//Product 생성 후 list에 추가
					Product storeP = new Product(p.getDay(), p.getStore(), p.getGrade(), p.getDetail(), p.getPrice());
					p.list.add(storeP);
					
					//출력 row 생성
					row = sheet.createRow(cnt);
					//출력 cell 생성
					row.createCell(0).setCellValue(p.getDay());
					row.createCell(1).setCellValue(p.getStore());
					row.createCell(2).setCellValue(p.getGrade());
					row.createCell(3).setCellValue(p.getDetail());
					row.createCell(4).setCellValue(p.getPrice());
				}
				
				cnt++; //다음 행 이동
			}
			
			FileOutputStream outFile;
			try {
				outFile = new FileOutputStream(path + "건담.xlsx");
				workbook.write(outFile);
				outFile.close();
				
				System.out.println("파일 생성 완료");
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e3) {
				e3.printStackTrace();
			}
		}
		
	}

}

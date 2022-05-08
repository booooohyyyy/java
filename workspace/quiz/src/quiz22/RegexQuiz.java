package quiz22;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class RegexQuiz {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		BufferedReader br = null;

		try {
		
			br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\user\\Desktop\\test\\work\\Test\\src\\quiz40\\건담.txt"), "UTF-8"));

			String line;
			while( (line = br.readLine()) != null ) {
								
				
				//정규표현식
				String pattern1 = "\\d{8}-\\d{2}-\\d{12,13}"; //날짜 패턴
				String pattern2 = "[가-힣]+ [가-힣]+"; 
				String pattern3 = "\\[[A-Z가-힣]*\\]"; //등급패턴: \\[ 특정문자를 찾음
				String pattern4 = "\\d+,*\\d+원"; //가격패턴
				
				Matcher m1 = Pattern.compile(pattern1).matcher(line);
				Matcher m2 = Pattern.compile(pattern2).matcher(line);
				Matcher m3 = Pattern.compile(pattern3).matcher(line);
				Matcher m4 = Pattern.compile(pattern4).matcher(line);
				
				
				if(m1.find() && m2.find() && m3.find() && m4.find() ) {

					String day = m1.group();
					String store = m2.group();
					String grade = m3.group();
					String detail = line.substring(m3.end()+1,  m4.start()-1 ); //등급패턴의 끝지점 +1, 가격패턴의 시작지점 -1
					String price = m4.group();
					
					Product p = new quiz22.Product(day, store, grade, detail, price);
					
					list.add(p);
					
				}
				
			}
			
			
			//출력
			list.stream().forEach( (data) -> {
				System.out.println("-----------------");
				System.out.println(data.getDay());
				System.out.println(data.getStore());
				System.out.println(data.getGrade());
				System.out.println(data.getDetail());
				System.out.println(data.getPrice());
			});
			
			
			excel(list); //엑셀 메서드 호출
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
	
	//엑셀메서드
	public static void excel(List<Product> list) {
		
        // 워크북 생성
        XSSFWorkbook workbook = new XSSFWorkbook();
        // 워크시트 생성
        XSSFSheet sheet = workbook.createSheet();
        // 행 생성
        XSSFRow row = sheet.createRow(0);
        // 쎌 생성
        XSSFCell cell;
        
        // 헤더 정보 구성
        cell = row.createCell(0);
        cell.setCellValue("날짜");
        
        cell = row.createCell(1);
        cell.setCellValue("지점");
        
        cell = row.createCell(2);
        cell.setCellValue("등급");
        
        cell = row.createCell(3);
        cell.setCellValue("상세");
        
        cell = row.createCell(4);
        cell.setCellValue("가격");
        
        // 리스트의 size 만큼 row를 생성
        Product vo;
        for(int i=0; i < list.size(); i++) {
            vo = list.get(i);
            
            // 행 생성
            row = sheet.createRow(i+1);
            
            cell = row.createCell(0);
            cell.setCellValue(vo.getDay() );
            
            cell = row.createCell(1);
            cell.setCellValue(vo.getStore() );
            
            cell = row.createCell(2);
            cell.setCellValue(vo.getGrade()  );
            
            cell = row.createCell(3);
            cell.setCellValue(vo.getDetail() );
            
            cell = row.createCell(4);
            cell.setCellValue(vo.getPrice() );
            
        }
        
        //파일 쓰기
        FileOutputStream fos = null;
        
        try {
			fos = new FileOutputStream("C:\\Users\\user\\Desktop\\test\\work\\Test\\src\\quiz40\\건담.xlsx");
        	workbook.write(fos);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
        


	}
	
	
	
	
	
	
	
	
	
	
}

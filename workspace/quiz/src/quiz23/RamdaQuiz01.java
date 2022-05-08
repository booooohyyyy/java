package quiz23;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RamdaQuiz01 {
	
	public static void main(String[] args) {
		
		/*
		 * 대용량 컬렉션처리에 유리한 장점을 가짐
		 * 
		 * 1. BufferedReader클래스 사용해서 해당파일을 읽음
		 * 2. (구분자), 기준으로 split(",", 맥스크기) 이용해서 Data클래스에 한 줄단위로 저장
		 * 3. 리스트에 Data객체를 저장
		 *    리스트 크기가 4505개
		 *    
		 *  4. 람다식을 이용해서,
		 *  조건) 지역: 서울, 1~4월, 분양가격 4000이상의 데이터만 추출해서
		 *  새로운 리스트에 저장.
		 */
		
		List<Data> list = new ArrayList<>();
		
		BufferedReader br = null;
		
		try {
			String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\";
			br = new BufferedReader(new InputStreamReader(new FileInputStream(path +"주택도시보증공사_전국 평균 분양가격(2020년 2월).csv"), "EUC-KR"));
			
			String str;
			while((str = br.readLine()) != null) {
				
				//split으로 쪼개어 저장
				String[] arr = str.split(",", 5);
				
				//첫 행 제거
				if(arr[0].equals("지역명")) continue;
									
				//data 객체 생성
				Data data = new Data(arr[0], arr[1], arr[2], arr[3], arr[4].equals("") ? "0" : arr[4]);
				
				//리스트에 추가
				list.add(data);
				
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		
		//리스트 사이즈 확인 (제대로 들어갔나)
		System.out.println(list.size());
		
		//조건 수행 후 새로운 리스트 생성
		List<Data> newList = list.stream()
					.filter((s) -> s.getRegion().equals("서울"))
					.filter((s) -> s.getMonth().equals("1") || s.getMonth().equals("2") || s.getMonth().equals("3") || s.getMonth().equals("4"))
					.filter((s) -> Integer.parseInt(s.getPrice()) >= 4000)
					.collect(Collectors.toList());
		
		//확인
		System.out.println(newList.toString());
		System.out.println(newList.size());
		
	}

}

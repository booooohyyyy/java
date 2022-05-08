package api.util.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeEx {
	
	public static void main(String[] args) {
		
		//두번째 날짜관련 객체 (time 패키지)
		/*
		 * LocalDate - 년, 월, 일 정보
		 * LocalTime - 시, 분, 초 정보
		 * LocalDateTime - 년, 월, 일, 시, 분, 초 모두 가지고 있음
		 */
		
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		LocalDate before = LocalDate.of(2015, 01, 11); //날짜 형싱을 직접 지정
		System.out.println(before);
		
		LocalTime now2 = LocalTime.now();
		System.out.println(now2);
		
		System.out.println("------------------------------");
		
		LocalDateTime now3 = LocalDateTime.now();
		System.out.println(now3);
		
		LocalDateTime before2 = LocalDateTime.of(2014, 01, 11, 15, 20, 40);
		System.out.println(before2);
		
		System.out.println("------------------------------");
		
		//LocalDateTime의 포맷 클래스
		DateTimeFormatter dt  = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
		
		//LocalDateTime이 가진 format메서드에 fommater클래스를 전달.
		String result = now3.format(dt);
		System.out.println(result);
		
		
	}
}
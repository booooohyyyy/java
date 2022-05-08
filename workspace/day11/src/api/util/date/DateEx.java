package api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	
	public static void main(String[] args) {
		
		//날짜객체
		Date date = new Date();
		System.out.println(date);
		
		//Date의 클래스 포맷
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년MM월dd일 hh시 mm분 ss초");
		String now = sdf.format(date);
		System.out.println(now);
		
		sdf = new SimpleDateFormat("yyyy-MM-dd");
		String now2 = sdf.format(date);
		System.out.println(now2);
		
		
	}
	
	

}

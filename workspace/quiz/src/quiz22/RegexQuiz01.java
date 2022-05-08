package quiz22;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz01 {
	
	public static void main(String[] args) {
		
		/*
		 * 하나의 패턴을 만들어서 가격형식만 찾아서 순서대로 출력
		 */
		
		String str = "헐4,500원 ㅎ~ 1,200원헑? 6000원엨 120000원";
		
		String pattern = "\\d*\\,?\\d+[원]";
		
		Matcher m = Pattern.compile(pattern).matcher(str);
		
		while(m.find()) {
			System.out.println(m.group());
		}
		
	}

}

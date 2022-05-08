package level2;

import java.util.Arrays;
import java.util.Comparator;

public class Phone_Book {
	
	public static void main(String[] args) {
		
		String[] arr = {"119", "97674223", "1195524421"};
		String[] arr2 = {"123","456","789"};
		String[] arr3 = {"12","123","1235","567","88"};
		
		System.out.println(solution(arr));
		System.out.println(solution(arr2));
		System.out.println(solution(arr3));
		
	}//end main
	
	static boolean solution(String[] phone_book) {
		
        boolean answer = true;
        int len = phone_book.length;
        
        //문자열 길이 기준 오름차순 정리
        for(int i = 0; i < len-1; i++) {
        	for(int j = i+1; j < len; j++) {
        		if(phone_book[i].length() > phone_book[j].length()) {
        			String temp = phone_book[i];
        			phone_book[i] = phone_book[j];
        			phone_book[j] = temp;
        		}		
        	}
        }
        
        //포함되어 있는지 확인
        es: for(int i = 0; i < len-1; i++) {
        	for(int j = i+1; j < len; j++) {
        		if(phone_book[j].substring(0, phone_book[i].length()).equals(phone_book[i])) {
        			answer = false;
        			break es;
        		}
        	}
        }
        
        return answer;
        
    }

}

package level2;

import java.util.Arrays;
import java.util.LinkedList;

public class First_Cache {
	
	public static void main(String[] args) {
		
		int c_s = 3;
		String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
		
		int c_s2 = 3;
		String[] cities2 = {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"};
		
		int c_s3 = 2;
		String[] cities3 = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};
		
		int c_s4 = 5;
		String[] cities4 = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};
		
		int c_s5 = 2;
		String[] cities5 = {"Jeju", "Pangyo", "NewYork", "newyork"};
		
		int c_s6 = 0;
		String[] cities6 = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
		
		System.out.println(solution(c_s, cities));
		System.out.println(solution(c_s2, cities2));
		System.out.println(solution(c_s3, cities3));
		System.out.println(solution(c_s4, cities4));
		System.out.println(solution(c_s5, cities5));
		System.out.println(solution(c_s6, cities6));
		
	}//end main
	
	static int solution(int cacheSize, String[] cities) {
		
		if(cacheSize == 0) {
			return cities.length * 5;
		}
		
        int answer = 0;
        LinkedList<String> cache = new LinkedList<>();
        for(int i = 0; i < cities.length; i++) {
        	String s = cities[i].toLowerCase();
        	if(cache.remove(s)) {
        		answer++;
        		cache.add(s);
        	}else {
        		answer += 5;
        		if(cache.size() >= cacheSize) {
        			cache.remove(0);
        		}
        		cache.add(s);
        	}
        }
        return answer;   
    }

}

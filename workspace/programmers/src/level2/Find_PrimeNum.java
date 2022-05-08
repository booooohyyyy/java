package level2;

import java.util.HashSet;

public class Find_PrimeNum {
	
	public static void main(String[] args) {
		
		String numbers = "17";
		String numbers2  = "011";
		
		
		System.out.println(solution(numbers));
		System.out.println(solution(numbers2));
		
	}//end main
	
	static int solution(String numbers) {
		
        int answer = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        
        permutation("", numbers, set); //순열
        
        while(set.iterator().hasNext()) {
        	int a = set.iterator().next();
        	set.remove(a);
        	if(a == 2) answer ++;
        	if(a % 2 != 0 && isPrime(a)) {
        		answer++;        		
        	}
        }
        return answer;
      
    }
	
	//순열방식으로 각각의 자리 만들기
	static void permutation(String prefix, String str, HashSet<Integer> set) {
		int n = str.length();
		if(!prefix.equals("")) {
			set.add(Integer.valueOf(prefix)); //String -> Integer
		}
		
		for(int i = 0; i < n; i++) {
			permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n), set);
		}
	}
	
	//소수 찾기
	static public boolean isPrime(int n) {
		if(n == 0 || n == 1) return false;
		for(int i=2; i<=(int)Math.sqrt(n); i+=1) {
			if(n % i == 0)  return false;
		}
		return true;
		
	}

}


package level2;

public class Vowel_Dictionary {
	
	public static void main(String[] args) {
		
		String word = "AAAAE";
		String word2 = "AAAE";
		String word3 = "I";
		String word4 = "EIO";
		
		System.out.println(solution(word));
		System.out.println(solution(word2));
		System.out.println(solution(word3));
		System.out.println(solution(word4));
		
		
		
		
	}//end main
	
	static int solution(String word) {
		
        String str = "AEIOU";
		int[] x = {781,156,31,6,1};
		int index, answer = word.length();
		
		for(int i=0;i<word.length();i++){
			index = str.indexOf(word.charAt(i));
			answer+=x[i]*index;
		}
		
		return answer;

        
    }
}

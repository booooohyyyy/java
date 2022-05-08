package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordChainGame {
	
	public static void main(String[] args) {
		
		int n = 3;
		String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		
		int n2 = 5;
		String[] words2 = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
		
		int n3 = 2;
		String[] words3 = {"hello", "one", "even", "never", "now", "world", "draw"};
		
		System.out.println(Arrays.toString(solution(n, words)));
		System.out.println(Arrays.toString(solution(n2, words2)));
		System.out.println(Arrays.toString(solution(n3, words3)));
		
		
	}//end main
	
	static int[] solution(int n, String[] words) {
		
        int[] answer = new int[2];
        List<String> list = new ArrayList<>();
        boolean bool = true;
        
        for(int i = 0; i < words.length; i++) {
        	
        	if(list.contains(words[i])) { // 이전에 등장한 단어인 경우
        		answer[0] = (i % n) + 1;
        		answer[1] = (i / n) + 1;
        		
        		bool = false;
        		break;
        	}
        	
        	list.add(words[i]);
        	
        	// 끝말잇기 틀린경우
        	if(i > 0 && words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)) {
         		answer[0] = (i % n) + 1;
        		answer[1] = (i / n) + 1;
        		
        		bool = false;
        		break;
        	}
        }
        
        if(bool) {
        	answer[0] = 0;
        	answer[1] = 0;
        }

        return answer;

	}
}

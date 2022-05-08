package level1;

public class KeyPad {
	
	public static void main(String[] args) {
		
		
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		
		int[] numbers2 = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
		String hand2 = "left";
		
		int[] numbers3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		String hand3 = "right";
		
		System.out.println(solution(numbers, hand));
		System.out.println(solution(numbers2, hand2));
		System.out.println(solution(numbers3, hand3));
		
	}//end main
	
	static String solution(int[] numbers, String hand) {
		
        String answer = "";
        
        int left=10, right=12;
        int L_dis, R_dis;
        
        for(int i = 0; i < numbers.length; i++) {
        	
        	L_dis = 0; R_dis = 0;
        	
        	if((numbers[i] == 1) || (numbers[i] == 4) || (numbers[i] == 7)) {
        		answer += "L";
        	}else if((numbers[i] == 3) || (numbers[i] == 6) || (numbers[i] == 9)) {
        		answer += "R";
        	}else {
        		if(i == 0) i += 11;
				L_dis = (Math.abs(i-left))/3 + (Math.abs(i-left))%3;
				R_dis = (Math.abs(right-i))/3 + (Math.abs(right-i))%3;
				if(L_dis == R_dis) {
					if(hand.equals("right")) {
						answer += "R";
					}else {
						answer += "L";								
					}
				}else if(L_dis > R_dis) {
					answer += "R";
				}else {
					answer += "L";
				}
        	}
        }
        
        return answer;
        
    }

}

// 수정 요망

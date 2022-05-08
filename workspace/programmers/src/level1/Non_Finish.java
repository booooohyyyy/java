package level1;

import java.util.Arrays;

public class Non_Finish {
	
	public static void main(String[] args) {
		
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		
		String[] participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion2 = {"josipa", "filipa", "marina", "nikola"};
		
		String[] participant3 = {"mislav", "stanko", "mislav", "ana"};
		String[] completion3 = {"stanko", "ana", "mislav"};
		
		System.out.println(solution(participant, completion));
		System.out.println(solution(participant2, completion2));
		System.out.println(solution(participant3, completion3));
		
		
		
	}//end main
	
	static String solution(String[] participant, String[] completion) {
		
		String answer = "";
		
		ex:for (int i = 0; i < participant.length; i++) {
			for (int j = 0; j < completion.length; j++) {
				if(participant[i].equals(completion[j])) {
					participant[i] = "";
					completion[j] = "";
					continue ex;
				}
			}
		}
		
//		System.out.println(Arrays.toString(participant));
		
		for (int i = 0; i < participant.length; i++) {
			answer += participant[i];
		}
		
		return answer;
	}
	
	
	

}

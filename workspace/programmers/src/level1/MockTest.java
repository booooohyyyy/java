package level1;

import java.util.Arrays;

public class MockTest {
	
	public static void main(String[] args) {
		
		int num = (int)(Math.random() * 10000) +1;
		int[] answers = new int[num];
		
		for (int i = 0; i < answers.length; i++) {
			answers[i] = (int)(Math.random() *5) +1;
		}
		
		System.out.println(Arrays.toString(solution(answers)));
		
	}//end main
	
	static int[] solution(int[] answers) {
		
		int[] answer = {};
		
		int[] stud1 = {1,2,3,4,5};
		int[] stud2 = {2,1,2,3,2,4,2,5};
		int[] stud3 = {3,3,1,1,2,2,4,4,5,5};
		
		int cnt1 = 0;	// 학생들이 문제 맞춘 개수
		int cnt2 = 0;
		int cnt3 = 0;
		
		for (int i = 0; i < answers.length; i++) {
			if(answers[i] == stud1[i % stud1.length]) {
				cnt1++;
			}
			if(answers[i] == stud2[i % stud2.length]) {
				cnt2++;
			}
			if(answers[i] == stud3[i % stud3.length]) {
				cnt3++;
			}
		}
		
		
		System.out.println(cnt1 + " " + cnt2 + " " + cnt3);
		
		if((cnt1 > cnt2) && (cnt1 > cnt3)) {
			answer = new int[1];
			answer[0] = 1;
		}else if((cnt2 > cnt1) && (cnt2 > cnt3)) {
			answer = new int[1];
			answer[0] = 2;
		}else if((cnt3 > cnt1) && (cnt3 > cnt2)) {
			answer = new int[1];
			answer[0] = 3;
		}else if((cnt1 > cnt2) && (cnt1 > cnt3)) {
			answer = new int[1];
			answer[0] = 1;
		}else if((cnt1 == cnt2) && (cnt1 > cnt3)) {
			answer = new int[2];
			answer[0] = 1;
			answer[1] = 2;
		}else if((cnt1 == cnt3) && (cnt1 > cnt2)) {
			answer = new int[2];
			answer[0] = 1;
			answer[1] = 3;
		}else if((cnt2 == cnt3) && (cnt2 > cnt1)) {
			answer = new int[2];
			answer[0] = 2;
			answer[1] = 3;
		}else {
			answer = new int[3];
			answer[0] = 1;
			answer[1] = 2;
			answer[2] = 3;
		}
		return answer;
	}
	
	

}

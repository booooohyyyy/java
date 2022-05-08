package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Compress {
	
	public static void main(String[] args) {
		
		String s = "KAKAO";
		String s2 = "TOBEORNOTTOBEORTOBEORNOT";
		String s3 = "ABABABABABABABAB";
		
		System.out.println(Arrays.toString(solution(s)));
		System.out.println(Arrays.toString(solution(s2)));
		System.out.println(Arrays.toString(solution(s3)));
		
		
	}//end main
	
	static int[] solution(String msg) {
		
		ArrayList<String> AL = new ArrayList<String>();			// 길이가 동적이므로 arraylist
        ArrayList<Integer> answer = new ArrayList<Integer>();	// 리턴할 배열
        AL.add("0");					// 1번째 인덱스로 시작하기 위하여
        char English = 'A';
        for (int i = 0; i < 26; i++) {	// 알파벳 사전 초기화
            AL.add(English++ + "");
        }
        
        Queue<Character> q = new LinkedList<>();
        for (int i = 0; i < msg.length(); i++) {	// q에 msg단어를 하나씩 넣어줌
            q.add(msg.charAt(i));
        }
        
        while (!q.isEmpty()) {				//q가 비어있지 않다면
            String temp = q.remove() + "";	//첫단어 ex) K
            String tempNext = "";			//첫단어 + 두번째 단어 ex)KA
            if (q.size() > 0) {
                tempNext = temp + q.peek();
            }
            boolean flag = false;		//만약 사전에 두번째 단어 이상까지 있다면 계속해서 문자열에 붙혀줘야 되기 때문에 반복조건을 정함.
            do {
                flag = false;
                if (AL.contains(temp)) {			//1.첫 번째 단어가 있고
                    if (AL.contains(tempNext)) {	//2.두번째 단어가 있다면
                        temp = temp + q.remove();	//3.temp는 KA가 되고
                        tempNext = tempNext + q.peek();//4.tempNext는 KAO가 되어 반복함
                        flag = true;
                    } else {						//2.두번째 단어는 없다면
                        answer.add(AL.indexOf(temp));//3.temp의 인덱스를 출력하고
                        if (!tempNext.equals(""))                    
                            AL.add(tempNext);		//4.사전에 새롭게 등록
                    }
 
                }
            } while (flag);
 
        }
 
        int[] result = new int[answer.size()];		//int형 배열로 전환
        int size = 0;
        for (int temp : answer) {
            result[size++] = temp;
        }
        return result;   
    }

}

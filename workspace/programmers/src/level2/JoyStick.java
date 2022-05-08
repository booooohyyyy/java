package level2;

import java.util.Arrays;

public class JoyStick {
	
	public static void main(String[] args) {
		
		String name = "JEROEN";
		String name2 = "JAN";
		
		System.out.println(solution(name));
		System.out.println(solution(name2));
		
	}//end main
	
	static int solution(String name) {
		
        int answer = 0;
        int len = name.length();

        //맨 오른쪽으로 이동할 때
        int min_mov = len - 1;

        for (int i = 0; i < len; i++) {
          // 조이스틱 상, 하 이동
          char c = name.charAt(i);
          int mov = (c - 'A' < 'Z' - c + 1) ? (c - 'A') : ('Z' - c + 1);
          answer += mov;

          // 조이스틱 좌, 우 이동
          int nextIndex = i + 1;
          // 다음 단어가 A이고, 단어가 끝나기 전까지 nextIndex 증가
          while (nextIndex < len && name.charAt(nextIndex) == 'A')
            nextIndex++;

          min_mov = Math.min(min_mov, (i * 2) + len - nextIndex);
        }

        answer += min_mov;
        
        
        return answer;
        
    }

}

package level1;

public class P_Y_Count {
	
	public static void main(String[] args) {
		
		String s = "pPoooyY";
		String s2 = "Pyy";
		
		System.out.println(solution(s));
		System.out.println(solution(s2));
		
	}
	
	static boolean solution(String s) {
        boolean answer = true;
        int cnt1 = 0;		//p의 개수
        int cnt2 = 0;		//y의 개수
        
        for(int i = 0; i < s.length(); i++) {
        	
        	char ch = s.charAt(i);
        	if(ch == 'P' || ch == 'p') {
        		cnt1++;
        	}else if(ch == 'Y' || ch == 'y') {
        		cnt2++;
        	}
        }
        
        if(cnt1 != cnt2) {
        	answer = false;
        }

        return answer;
    }
}

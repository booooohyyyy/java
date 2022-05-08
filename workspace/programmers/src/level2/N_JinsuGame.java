package level2;

public class N_JinsuGame {
	
	public static void main(String[] args) {
		
		int n = 2;
		int t = 4;
		int m = 2;
		int p = 1;
	
		int n2 = 16;
		int t2 = 16;
		int m2 = 2;
		int p2 = 1;
		
		int n3 = 16;
		int t3 = 16;
		int m3 = 2;
		int p3 = 2;
		
		System.out.println(solution(n, t, m, p));
		System.out.println(solution(n2, t2, m2, p2));
		System.out.println(solution(n3, t3, m3, p3));
		
		
	}//end main
	
	static String solution(int n, int t, int m, int p) {
		
		int len = m*(t-1)+p;
        String s = "";
        int num = 0;
        
        while(s.length() < len){
            s += Integer.toString(num,n).toUpperCase();
            num++;
        }
//        System.out.println(s);
        
        String answer = "";
        int idx = 0;
        while(true){
            answer += s.charAt(idx*m+p-1);    
            idx++;
            if(idx == t) break;
        }
        return answer;
        
    }

}

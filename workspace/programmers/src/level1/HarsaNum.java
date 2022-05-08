package level1;

public class HarsaNum {
	
	public static void main(String[] args) {
		
		int x = 10;
		int x2 = 12;
		int x3 = 11;
		int x4 = 13;
		
		System.out.println(solution(x));
		System.out.println(solution(x2));
		System.out.println(solution(x3));
		System.out.println(solution(x4));
		
		
	}//end main
	
	static boolean solution(int x) {
		
        boolean answer = true;
        int sum = 0;
        int y = x;		//반복문 돌릴 x와 같은 값
        
        while(true) {
        	
        	sum += (y%10);
        	if(y < 10) break;
        	y /= 10;
        	
        }
//        System.out.println(sum);
        
        if (x % sum != 0) {
        	answer = false;
        }
        
        return answer;
        
    }

}

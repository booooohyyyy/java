package level1;

public class NotEnough_Money {
	
	public static void main(String[] args) {
		
		int p = 3;
		int m = 20;
		int cnt = 4;
		
		System.out.println(solution(p, m, cnt));
		
	}//end main
	
	static  long solution(int price, int money, int count) {
		
        long answer = -1;
        int sum = 0;
        
        for(int i = 1; i <= count ; i++) {
        	sum += price*(i);
        }
        
        answer *= money - sum;
        
        return answer;
        
    }

}

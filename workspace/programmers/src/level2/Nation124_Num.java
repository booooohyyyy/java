package level2;

public class Nation124_Num {
	
	public static void main(String[] args) {
		
		int n = 1;
		int n2 = 2;
		int n3 = 3;
		int n4 = 4;
		int n5 = 5;
		int n6 = 6;
		int n7 = 10;
		
		System.out.println(solution(n));
		System.out.println(solution(n2));
		System.out.println(solution(n3));
		System.out.println(solution(n4));
		System.out.println(solution(n5));
		System.out.println(solution(n6));
		System.out.println(solution(n7));
		

	}//end main
	
	static  String solution(int n) {
		
        StringBuilder sb = new StringBuilder(); 
        int a = 0; //몫
        int b = 0; //나머지
        
        while(true) {
        	
        	if(n % 3 == 0) {
        		a = (n / 3) -1;
        		
        	}else {
        		a = n / 3;
        		b = n % 3;        		
        	}
        	
        	sb.insert(0,  b);
        	
        	if(a <= 3) {
        		if(a == 0) {
        			break;
        		}
        		sb.insert(0, a);
        		break;
        	}
        	
        	n /= 3;
        		
        }
        
        String answer = "";
        answer = sb.toString();
        
        answer = answer.replace("3", "4");
        answer = answer.replace("0", "4");

        
        return answer;
        
    }

}

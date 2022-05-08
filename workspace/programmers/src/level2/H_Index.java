package level2;

public class H_Index {
	
	
	public static void main(String[] args) {
		
		int[] citations = {3, 0, 6, 1, 5};
		
		System.out.println(solution(citations));
		
	}//end main
	
	static int solution(int[] citations) {
		
        int answer = 0;     //h가 될 값
        int cnt = 0;        //인용되는 횟수
    
        for (int i = 0; i < citations.length; i++) {
        	for (int j = 0; j < citations.length; j++) {
        		if(citations[i] >= citations[j]) {
        			cnt++;
        		}
        	}
        	if(citations[i] <= cnt) {
        		if(answer < citations[i]) {
        			answer = citations[i];
        		}
        	}
        	cnt = 0;
        }
        return answer;
    }
	

}

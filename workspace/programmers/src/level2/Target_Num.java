package level2;

public class Target_Num {
	
	static int answer = 0;
	
	public static void main(String[] args) {
	
		int[] numbers = {1,1,1,1,1};
		int target = 3;
		
		System.out.println(solution(numbers, target));
		
	}//end main
	
	static int solution(int[] numbers, int target) {
		
        dfs(numbers, numbers[0], target, 0); // +1부터 시작
        dfs(numbers,-1*numbers[0], target, 0); // -1부터 시작
		
        return answer;
        
    }
	
	static void dfs(int[] numbers, int num, int target, int idx) {
		if(idx == numbers.length-1) { //뽑은 개수가 5개일 때
			 if(num == target) { //타겟 넘버가 만들어졌다면
				 answer++; 
			 }
			 return;
		}
		
		idx++;
		dfs(numbers, num+numbers[idx], target, idx); //+
		dfs(numbers, num-numbers[idx], target, idx); //-
	}

}

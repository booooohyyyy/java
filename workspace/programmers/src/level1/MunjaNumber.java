package level1;

public class MunjaNumber {
	
	public static void main(String[] args) {
		
		/*
		 * 네오와 프로도가 숫자놀이를 하고 있습니다. 
		 * 네오가 프로도에게 숫자를 건넬 때 일부 자릿수를 영단어로 바꾼 카드를 건네주면 
		 * 프로도는 원래 숫자를 찾는 게임입니다.
		 */
		
		String s = "one4seveneight";
		System.out.println(solution(s));
		
		
	}//end main
	
	static int solution(String s) {
		int answer = 0;
		
		String[] arr = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "zero"};
		String[] arr2 = {"1","2","3","4","5","6","7","8","9","0"};
		
		for (int i = 0; i < arr.length; i++) {
			s = s.replace(arr[i], arr2[i]);
		}
		
		answer = Integer.parseInt(s);
		return answer;
	
		
	}

}

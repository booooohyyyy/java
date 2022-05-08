package day04;

public class BreakEx03 {
	
	public static void main(String[] args) {
		
		//원초적인 반복문 탈출
		
		boolean bool = false; // 탈출을 위한 변수
		
		//중첩반복문에서 탈출.
		for(char c = 'A'; c <= 'Z'; c++) {
			
			for(char l = 'a'; l <= 'z'; l++) {
			
				System.out.println(c + "-" + l);
				
				if ( l == 'f') {
					bool = true;
					break;
				}
				
			} //end inner
			if (bool) break;
			
		} //end outer
		
		System.out.println("------------------------------");
		
		//이름을 붙여 반복문 탈출
		
		ex:for(char c = 'A'; c <= 'Z'; c++) {
			
			for(char l = 'a'; l <= 'z'; l++) {
			
				System.out.println(c + "-" + l);
				
				if(l == 'f') break ex;
				
			} //end inner
			
		} //end outer
		
	}

}

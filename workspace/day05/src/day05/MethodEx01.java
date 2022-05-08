package day05;

public class MethodEx01 {
	
	public static void main(String[] args) {
		
		/*
		 * 1. 메서드는 만드는 과정, 호출(사용)하는 과정이 있음.
		 * 2. 메서드는 메서드 내부에 중첩으로 선언할 수 없음.
		 */
		
		//1~10
		
		System.out.println("1~10까지의 합:" + calSum());
		
		int result = calSum();
		System.out.println("1~10까지의 합:" + result);
		
		String result2 = randomStr();
		System.out.println(result2);
		
		String result3 = randomStr2();
		System.out.println(result3);
		
		
	}//end main
	

	//지금은 static 키워드 입력 -> 조만간 안쓰게 됌
	static int calSum() {  //반환 유형이 있으면 return값이 필요함(짝꿍)
		
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	static String randomStr() {
		
		String str = "";
		for (char c = 'A'; c <= 'Z'; c++) {
			str += c;
		}
		return str;
	}
	
	static String randomStr2() {
		double d = Math.random();
		 
								//원칙적으로 return은 한번이지만
		if(d > 0.6) {			//조건문인 경우 조건값마다 return값 넣을 수 있음
			return "가위";
		}else if(d > 0.3) {
			return "바위";
		}else {
			return "보";
		}
		
	}

}

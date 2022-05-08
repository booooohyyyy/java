package day03;

public class SwitchEx01 {
	
	public static void main(String[] args) {
		
		int a = 0;
		
		
		//switch '소괄호' 안에는 문자or정수 형태의 변수나 연산식이 들어갈 수 있다.
		switch(a) {
		
		case 0:
		case 1:
			System.out.println("1입니다.");
			break;    //스위치 문을 빠져 나온다.
		case 2:
			System.out.println("2입니다.");
			break;
		case 3:
			System.out.println("3입니다.");
			break;
		case 4:
			System.out.println("4입니다.");
			break;
		default:
			System.out.println("1~4이외의 숫자입니다.");
			break;
		}
		
	}

}

package day02;

public class OperatorEx01 {
	
	public static void main(String[] args) {
		
		//단항 연산자
		//부호 연산자 +, -
		int i = -3;
		int j = -i;
		
		System.out.println(j);  //3
		
		//증감 연산자 ++, --
		int k = 1;
		int h = k++;  //먼저 값을 대입하고, 자신을 증가 : 후위 연산
		
		System.out.println("k값:" + k);
		System.out.println("h값:" + h);
		
		int x = 1;
		int y = ++x;  //먼저 자신을 증가시키고, 값을 대입 : 전위 연산
		System.out.println("x값:" + x);
		System.out.println("y값:" + y);

		//일반적인 표현형식
		x = 1;
		++x;  //2 
		x++;  //3
		
		
		System.out.println("---------------------------");
		
		
		x = 1;
		System.out.println(x++);  //출력값: 1
		System.out.println(++x);  //출력값: 3
		
		//주의할 점
		x = 10;
		y = 10;
		
		int result = (x++) + (x++) + 10;  //10 + 11 + 10
		int result2 = (++y) + (++y) + 10;  //11 + 12 + 10
		
		System.out.println(result);
		System.out.println(result2);
		
		
		System.out.println("---------------------------");
		
		
		//비트 반전 연산자 ~
		byte b = 10; // 2진수: 0000_1010
		System.out.println(~b); //2진수를 반대로 : 1111_0101
		System.out.println(~b + 1); // ~b + (b+1) = 0
		                            // ~b = -b-1
		
		
		System.out.println("---------------------------");
		
		
		
		//논리 반전 연산자 !
		System.out.println(!true);  //false
		System.out.println(!false); //true
		
		boolean bool = !true;
		System.out.println(bool); //false
		//!(연산) 으로 많이 쓰임
	}

}

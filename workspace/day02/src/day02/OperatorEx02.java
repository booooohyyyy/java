package day02;

public class OperatorEx02 {
	
	public static void main(String[] args) {
		
		//이항 연산자
		int i = 7 * 3;   //21
		int j = 7 / 3;   //2
		int k = 7 % 2;   //1
		
		System.out.println("몫:" + j);
		System.out.println("나머지:" + k);
		
		//비교 연산자
		System.out.println(i == j); //false
		System.out.println(i != j); //true
		System.out.println(i < j);  //false
		System.out.println(k != 1); //false
		
		System.out.println(k % 2 == 0); //false >> 짝수판별
		System.out.println(k % 2 == 1); //false >> 홀수판별
		System.out.println(i % 2 == 0); //true  >> 3의배수

		
		System.out.println("------------------------------");
		
		
		//비트 연산자 (별로 중요하지 않음)
		int a = 5; //0000_0101
		int b = 3; //0000_0011
		
		System.out.println(a & b); // 'and' > 0000_0001 = 1
		System.out.println(a | b); // 'or'  > 0000_0111 = 7
		System.out.println(a ^ b); // 'xor' > 0000_0110 = 6
		
		//비트 쉬프트(이동) << , >>
		int h = 192;
		System.out.println(h >> 2); // 192/4 = 48
		System.out.println(h << 2); // 192*4 = 768
		
	}

}

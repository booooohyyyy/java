package day02;

public class IntegerEx {
	
	public static void main(String[] args) {
		
		byte a = 127;  // 양수는 127까지
		byte a1 = -128; // 음수는 -128까지 (byte 사이즈)
		
		short b = 32767;
		short b1 = -32768; //short 사이즈
		
		int c = 2147483647;   //대략 21억
		int c1 = -2147483648; //int 사이즈
		
		long d = 322223333344444L; //뒤에 'L' 필수
		System.out.println(d);
		
		
		//진수값으로 저장할 수 있음
		//2진수로 저장할려면 0b를 붙임
		//8진수로 저장하려면 0d를 붙임
		//16진수로 저장하려면 0x를 붙임
		int bin = 0b1010;
		System.out.println("이진수 1010은 " + bin + " 입니다.");
		// +로 연결해서 사용할 수 있다.		
		int octa = 076;
		System.out.println(octa);
		int hexa = 0x45A;
		System.out.println(hexa);
		
		
		
		System.out.println("-----------------------------");
		
		//실수형 타입
		float f1 = 3.14F; //7자리까지 유효
		double d1 = 3.14; //15자리까지 유효
		System.out.println(f1);
		System.out.println(d1);
		
		//e표기법
		float f2 = 314.15e-2f;    //e-2 = 10^-2
		System.out.println(f2);
		float f3 = 0.0031415e3f;  //e3 = 10^3
		System.out.println(f3);
		
		System.out.println("-----------------------------");
		
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println(bool1);
		System.out.println(bool2);
		
				
	}

}

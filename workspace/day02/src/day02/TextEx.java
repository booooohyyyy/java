package day02;

public class TextEx {
	
	public static void main(String[] args) {
		
		//단일문자 저장하는 'char'
		char c1 = 'A';
		char c2 = 65;  //아스키 코드 (ASKII code)
		
		System.out.println(c1);
		System.out.println(c2);
		
		//전세계 문자를 표현하는 유니코드
		char c3 = '가';  // 2바이트, 유니코드->UTF8, 65536(부호비트 없이 다 사용)
		char c4 = 44032; // 유니코드의 숫자 값44032번부터가 한글
		char c5 = '\uAC00'; // 유니코드문자 저장 (AC00(16진수) = 가)
		
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c3 + " " + c4 + " " + c5);
		
		
		System.out.println("---------------------------");
		
		
		String s1 = "hello";
		String s2 = " world";
		String s3 = " java";
		
		System.out.println(s1 + s2 + s3);
		System.out.println("문자열의 길이:" + s1.length()); //length() : 문자열의 길이를 알 수 있다.
		
		//다른열과 다른데이터 타입의 연산
		System.out.println(100 + 200);
		System.out.println("100" + 200);	    //문자열은 가장 강한 타입
		System.out.println(100 + 200 + "world");
		System.out.println("world" + 100 + 200);//문자열에 뭐가 붙던 문자열이 됌
		
		System.out.println("A"+ 10); //A10 >> 문자열
		System.out.println('A'+ 10); //75  >> 아스키코드 값 65 + 10
									 //'가'도 가능
		
	}

}

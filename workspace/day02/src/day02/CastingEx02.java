package day02;

public class CastingEx02 {
	
	public static void main(String[] args) {
		
		//크기가 큰 타입을 작은 타입에 넣을 떼는 (type)캐스팅을 이용해서
		//명시적 형 변환을 해야합니다. = down casting
		int i = 70;
		char c = (char)i;    //강제 형 변환 'F'
		short s = (short)i;  //70
		
		float f = 3.14F;
		int j = (int)f;      //실수부 버림 '3'
		
		System.out.println(c);
		System.out.println(s);
		System.out.println(j);
		
		//주의할 점 : 강제 형 변환 시 값을 받을 수 없는 범위가 들어오면 잘린 값이 저장 됌(쓰레기 값)
		int a = 1000;
		byte b = (byte)a;  //byte는 양수 127까지만 저장 가능하므로 잘림
		System.out.println(b);
		
		//예외 사항 : char <-> short로 바꿀 떼도 강제 형 변환이 필요
		char cc = 'A';
		short ss = (short)cc; // char, short모두 2byte이긴 하지만 강제 형 변환 해야함
	}

}

package day01;

public class SystemOut {
	
	public static void main(String[] args) { 
		// main 쓴 후 ctrl + space 누르면 자동완성 됌
		
		System.out.println("안녕하세요~");
		System.out.println("감사합니다.");
		// sysout 쓴 후 ctrl + space 누르면 자동완성 됌
		
		/*
		 * 여러 줄 주석 사용할 때 사용!!\
		 * 
		 * 한 줄 주석 - ctrl + /
		 * 여러 줄 주석 - ctrl + shift + /   << 약간의 버그 있음. 한 줄 주석 사용
		 * 되돌리기 - ctrl + z
		 */
		System.out.println("띄어쓰기가 포함된 출력문");
		
		System.out.print("개행이 없는 출력문, ");
		System.out.print("가로로 출력할때 사용");
		
		System.out.printf("\n오늘은 %d년 %d월 %d일 입니다.", 2021,11,23);
		System.out.printf("\n원주율은 %f입니다.", 3.14);  //기본은 6자리 까지
		System.out.printf("\n원주율은 %.2f입니다.", 3.14);//.2로 2자리까만 나타냄
		//형식지정 출력문 (문장에 구멍을 뚫어놓고, 필요한 값을 넣어쓰는 형식)
		/*
		 * 서식문자
		 * %d - 정수를 입력받음.
		 * %f - 실수를 입력받음.
		 * %s - 문자열을 입력받음.
		 * %c - 문자를 입력받음.
		 * 
		 * \n - 줄 바꿈
		 * \t - 탭 (8칸 띄어쓰기)
		 */
		
		System.out.println();
		System.out.println("쌍따옴표 없이 적으면 문자는 에러");
		System.out.println(123);   // 숫자는 쌍따옴표 없이 사용 가능
		System.out.println("123"); // 쌍따옴표 안은 문자 
		
		// alt + 방향키로 위치이동 가능
		// 범위지정 - 쉬프트 + 방향키 
		// ctrl + d - 코드삭제
		// ctrl + f11 - 실행

	}

}

package quiz09;

public class Example {
	
	//예시
	//멤버변수 배열선언이 된다? o
	int[] arr = new int[5];	//멤버변수
	int index = 0;			//순서대로 사용할 변수
	
	//외부로부터 값을 받아서 배열에 저장한다.
	void info(int a) {
		
		if(index == arr.length-1) {
			System.out.println("배열이 가득 찼음");
			return;
		}
		
		arr[index] = a;
		index++;
		
	}

}

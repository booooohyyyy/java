package quiz01;

public class Quiz09 {
	
	public static void main(String[] args) {
		
		/*
		 * Math.random()과 arr.length를 이용해서 0~3의 랜덤한 정수를 만듬
		 * 해당 랜덤수를 배열에 index에 적용해서 
		 * 선택된 단어가 한국어, 영어, 중국어, 알수없는 언어 인지 swith문으로 구별
		 */
		
		String[] arr = {"안녕", "hello", "니하오", "#$%"}; //배열 선언,초기화
		
		int num = (int)(Math.random() * arr.length);  //0~3 랜덤 수 뽑기
//		System.out.println(num);
		String a = arr[num];             //해당 번째의 언어 뽑기
		System.out.println("선택된 단어: " + a);
		
		switch(a) {     //언어 구별
		case "안녕":
			System.out.println(a + "은(는) 한국어");
			break;
		case "hello":
			System.out.println(a + "은(는) 영어");
			break;
		case "니하오":
			System.out.println(a + "은(는) 중국어");
			break;
		default:
			System.out.println(a + "은(는) 알 수 없는 언어");
			break;
		}
		
	}

}

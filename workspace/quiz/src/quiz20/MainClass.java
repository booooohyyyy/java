package quiz20;

public class MainClass {
	
	public static void main(String[] args) {
		
		
		/*
		 * 1. list, set, map을 이용해서 (택 1)
		 * 간단한 프로그램 코드를 작성
		 * ex) 도서관리, 인사관리, 예약시스템, 물품관리
		 * 
		 * 2. ex) 도서관리라면 
		 * 도서에 대한 정보를 저장하는 getter, setter를 가진 클래스 생성
		 * 
		 * 3. 기능은 3개 이상 (만들고 합쳐)
		 */
		
		Icecream ice = new Icecream();
		Icecream ice1 = new Icecream("아몬드봉봉");
		Icecream ice2 = new Icecream("민트초코");
		Icecream ice3 = new Icecream("치즈케잌");
		Icecream ice4 = new Icecream("레인보우샤베트");
		Icecream ice5 = new Icecream("오레오");
		Icecream ice6 = new Icecream("치즈고구마");
		Icecream ice7 = new Icecream("초콜렛");
		
		ice.addIcecream(ice1);
		ice.addIcecream(ice2);
		ice.addIcecream(ice3);
		ice.addIcecream(ice4);
		ice.addIcecream(ice5);
		ice.addIcecream(ice6);
		ice.addIcecream(ice7);
		
		
		System.out.println("-----------------------------");
		
		ice.cupSize();
		
		System.out.println("-----------------------------");
		
		ice.chooseIcecream();
		
		System.out.println("-----------------------------");
		
		ice.delIcecream();
		
		
		
		
		
	}

}

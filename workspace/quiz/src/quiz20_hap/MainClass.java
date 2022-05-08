package quiz20_hap;

public class MainClass {
	
	public static void main(String[] args) {
		
		
		/*
		 * 1. list, set, map을 이용해서 (택 1)
		 * 간단한 프로그램 코드를 작성
		 * ex) 도서관리, 인사관리, 예약시스템, 물품관리
		 * 
		 * 도서에 대한 정보를 저장하는 getter, setter를 가진 클래스 생성
		 * 
		 * 3. 기능은 3개 이상 (만들고 합쳐)
		 */
		
		Icecream ice = new Icecream();
		Flavor fv1 = new Flavor("아몬드봉봉");
		Flavor fv2 = new Flavor("민트초코");
		Flavor fv3 = new Flavor("치즈케잌");
		Flavor fv4 = new Flavor("레인보우샤베트");
		Flavor fv5 = new Flavor("오레오");
		Flavor fv6 = new Flavor("치즈고구마");
		Flavor fv7 = new Flavor("초콜렛");
		
		ice.addIcecream(fv1);
		ice.addIcecream(fv2);
		ice.addIcecream(fv3);
		ice.addIcecream(fv4);
		ice.addIcecream(fv5);
		ice.addIcecream(fv6);
		ice.addIcecream(fv7);
		
		ice.delIcecream();
		
		System.out.println("------------------------주문 시작------------------------");
		
		ice.cupSize();
		
		System.out.println("-------------------------------------------------------");
		
		ice.chooseIcecream();
		
		System.out.println("------------------------주문 완료------------------------");
		
		
		


	}

}

package quiz09;

public class MyCart extends Cart  {
	//1. Cart를 상속받아 필요한 메서드를 재정의 합니다.
	//1. Cart에는 불필요한 변수를 정의하지 않습니다.
	//2. MyCart의 생성자에서는 int매개변수를 하나 받으며, 금액만 초기화합니다. tv=300원, com=400원, radio=500원 으로 초기화

	
	//3. buy(), add() 메서드를 오버라이딩 합니다.
	
	/*
	 * buy()의 기능
	 * 1. money가 300보다 작으면 "금액부족" 출력후 메서드를 종료.
	 *    매개변수가 tv, com, radio가 아니더라도 "상품없음" 출력 후 종료
	 * 2. 매개변수 tv라면 금액에서 tv가격을 빼고 add(상품)을 호출
	 *    매개변수 com라면 금액에서 com가격을 빼고 add(상품)를 호출
	 *    매개변수 radio라면 금액에서 radio를 빼고 add(상품)을 호출
	 */
	
	/*
	 * add()의 기능
	 * 1. 만약 i의 값이 장바구니의 크기보다 같거나 크다면
	 *    -기존의 장바구니보다 크기가 * 2큰 배열을 생성.
	 *    -기존의 장바구니 값을 새로운 배열에 복사.
	 *    -새로운 장바구니를 기존의 장바구니와 바꾼다.
	 * 2. product를 장구니에 담는다.
	 * 3. info() 메서드를 호출
	 */
	
	//생성자
	public MyCart(int a) {
		super.money = a;	//this.
		super.tv = 300;
		super.com = 400;
		super.radio = 500;
	}
	
	public void buy(String product) {
		if(money < 300) {
			System.out.println("금액 부족");
			return;
		}
		if(product.equals("tv")) {
			money -= tv;
			this.add(product);
		}else if (product.equals("com")) {
			if(money < 400) {
				System.out.println("금액 부족");
				return;
			}
			money -= com;
			this.add(product);
		}else if (product.equals("radio")) {
			if(money < 500) {
				System.out.println("금액 부족");
				return;
			}
			money -= radio;
			this.add(product);
		}else {
			System.out.println("상품 없음");
			return;
		}		
		//this.add(product);
	}
	
	public void add(String product) {
		cart[i] = product;
		i++;
		if(i >= cart.length) {		//가득찬 경우
			String[] cart2 = new String[cart.length*2];
			
			for(int j = 0; j < cart.length; j++) { //새로운카트에 기존카트물품 채우기
				cart2[j] = cart[j];
			}
			super.cart = cart2;
			//this.cart = cart2;
		}
		super.info();
		//this.info();
	}
	
}

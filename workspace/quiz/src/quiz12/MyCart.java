package quiz12;

public class MyCart {
	//1. 모든 변수와 메서드에 접근제한자를 선언하세요.
	private int money;
	private Product[] cart = new Product[1]; //상품을 저장할 배열
	private int i = 0;
	
	//2. MyCart의 생성자는 money만 받아서 초기화
	
	public MyCart(int money) {
		this.money = money;
	}

	/*
	 * 3. buy(모든 상품을 받도록 선언)
	 * 
	 * 가진돈과 전달된 물건의 가격을 비교해서 돈이 적으면 "금액부족" 출력후 종료
	 * 가진돈이 충분하면 물건의 가격을 money에 빼고  add(상품) 메서드를 호출
     */ 	
	
	public void buy(Product p) {
		if(money < 300) {
			System.out.println("금액 부족");
			return;
		}
		if(p.name.equals("tv")) {
			money -= p.price;
			this.add(p);
		}else if (p.name.equals("com")) {
			if(money < 400) {
				System.out.println("금액 부족");
				return;
			}
			money -= p.price;
			this.add(p);
		}else if (p.name.equals("radio")) {
			if(money < 500) {
				System.out.println("금액 부족");
				return;
			}
			money -= p.price;
			this.add(p);
		}else {
			System.out.println("상품 없음");
			return;
		}		
	}
	
	
	/*
	 * 4. add(모든 상품을 받도록 선언)
	 * 만약 i의 값이 장바구니의 크기보다 같거나 크다면
	 * 기존의 장바구니보다 크기가 * 2큰 배열을 생성.
	 * 기존의 장바구니 값을 새로운 배열에 복사.
	 * 새로운 장바구니를 기존의 장바구니와 바꾼다.
	 * 
	 * 상품을 장바구니에 담는다.
	 * 
	 * info()메서드 호출
	 */
	
	public void add(Product p) {
		
		cart[i] = p;
		i++;
		
		if(i >= cart.length) {
			Product[] newCart = new Product[cart.length*2];
			for(int j = 0; j < cart.length; j++) {
				newCart[j] = cart[j];
			}
			cart = newCart;
		}
		this.info();
	}
	

	/*
	 * 5.info()
	 * 장바구니 안에 담긴 물건의 목록(name)을 출력한다.
	 * 장바구니 안에 담긴 물건의 가격을 모두 더해서 출력
	 * 남은금액 출력
	 * 메인에서 buy메서드 실행 
	 * 
	 */
	
	public void info() {
		
		System.out.println("----------");
		System.out.print("현재장바구니:");
		
		int sum = 0 ;
		for(int index = 0; index < i; index++) { //멤버변수 i = 상품 개수
			System.out.print(this.cart[index].name + " ");
			sum += this.cart[index].price;
		}
		System.out.println();
		System.out.println("금액합계:" + sum);
		System.out.println("남은금액:" + this.money);
		
	}
	
	
	
	
	
	
	
	
	
	
	
}

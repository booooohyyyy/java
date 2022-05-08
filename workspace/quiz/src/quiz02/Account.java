package quiz02;

public class Account {
	
	//멤버 변수 - 예금주 이름 (name : String), 비밀번호(password : String), 잔액(balance: int)
	//생성자 3가지 멤버 변수를 모두 매개값으로 받아 초기화하는 생성자 선언
	//메서드 - 입금가능 메서드 (deposit :void), 출금기능 메서드(withDraw: void), 잔액 조회 메서드(getbalance: int)

	
	String name;
	String password;
	int balance;
	
	
	//생성자 
	Account(String n, String p, int b){
		name = n;
		password = p;
		balance = b;
	}
	
	//기능
	void deposit(int a) {
		balance += a;
	}
	
	void withDraw(int a) {
		balance -= a;
	}
	
	int getbalance() {
		return balance;
	}
}

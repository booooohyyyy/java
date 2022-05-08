package quiz20_hap;

import java.util.LinkedList;
import java.util.Scanner;

public class Icecream implements IIcecream  {
	
	//기능 작성
	//멤버변수로 list, map선언 후 사용
	
	private LinkedList<Flavor> list = new LinkedList<>(); //메뉴 리스트
	private LinkedList<String> mylist = new LinkedList<>(); //컵에 담을 리스트
	private String name;
	private int price;
	private int number;      //아이스크림 담을 개수
	
	
	//생성자
	public Icecream() {
	
	}
	

	
	//메서드
	@Override
	public void addIcecream(Flavor f) {             //아이스크림 메뉴 추가
		if(list.contains(f)) {
			System.out.println("이미 있는 메뉴 입니다.");
		}else {
			list.add(f);
			System.out.println(f.getFlavor() + "을/를 메뉴에 추가했습니다.");
		}
	}
	
	@Override
	public void delIcecream() {                     //아이스크림 메뉴 삭제
		Scanner scan = new Scanner(System.in);
		
		boolean bool = true;
		
		System.out.print("삭제할 메뉴>");
		String del = scan.next();
		
		for(Flavor f : list) {
			if(f.getFlavor().equals(del)) {
				list.remove(f);
				System.out.println(del + "를/을 삭제했습니다.");
				bool = false;
				break;
			}
		}
		if(bool) {
			System.out.println("없는 메뉴 입니다.");
		}
		
		System.out.print("삭제 후 메뉴: [ ");
		for(Flavor f : list) {
			System.out.print(f.getFlavor() + " ");
		}
		System.out.println("]");
	}

	@Override
	public int cupSize() {                          //컵 사이즈 선택
		
		Scanner scan = new Scanner(System.in);
		int number = 0;
		
		es :while(true) {
			System.out.println("사이즈 크기: 파인트 | 쿼터 | 패밀리 | 하프갤런 | 종료");
			System.out.print("사이즈 선택:");
			String s = scan.next();
			
			switch (s) {
			case "파인트":
				System.out.println("파인트는 3가지 선택입니다.");
				this.number = 3;
				this.price = 8200;
				break es;
			case "쿼터":
				System.out.println("쿼터는 4가지 선택입니다.");
				this.number = 4;
				this.price = 15500;
				break es;
			case "패밀리":
				System.out.println("패밀리는 5가지 선택입니다.");
				this.number = 5;
				this.price = 22000;
				break es;
			case "하프갤런":
				System.out.println("하프갤런은 6가지 선택입니다.");
				this.number = 6;
				this.price = 26500;
				break es;
			case "종료":
				System.out.println("선택하지 않겠습니다.");
				break es;
				
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
		return number;
	}


	@Override
	public void chooseIcecream() {                 //담을 아이스크림 선택
		Scanner scan = new Scanner(System.in);
		
		System.out.print("메뉴: [ ");
		for(Flavor f : list) {
			System.out.print(f.getFlavor() + " ");
		}
		System.out.println("]");
		
		int cnt = 1;
		System.out.println(number + "가지 맛을 선택하세요.");
		
		while(cnt <= number) {
			boolean bool = true;
			System.out.print("선택>");
			String mat = scan.next();
			
			for(Flavor f : list) {
				if(f.getFlavor().equals(mat)) {
					System.out.println(mat + "를/을 선택하셨습니다.");
					mylist.add(mat);
					cnt++;
					bool = false;
				}
			}
			if(bool) {
				System.out.println("없는 메뉴 입니다.");
			}
		}
		System.out.println("선택한 아이스크림 종류:" + mylist.toString());
		System.out.println("가격은 " + this.price + "원 입니다.");
		
	}

}

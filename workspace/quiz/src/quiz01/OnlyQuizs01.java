package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class OnlyQuizs01 {
	
	public static void main(String[] args) {
		
		
		//*. 1~100까지 랜덤정수를 만들고, 짝수 인지 홀수인지 구분하는 삼항 연산식
		
//		int ran = (int)(Math.random() * 100) +1;
//		String result = (ran % 2 == 0 ? "짝수입니다." : " 홀수입니다.");
//		
//		System.out.println(ran + "은 " + result);
		
		
		
		//*. -5~5까지의 랜덤정수를 만들고, 절대값을 구하는 삼항 연산식
		
//		int ran = (int)(Math.random() * 11) -5;
//		int abs = (ran < 0 ? -ran : ran);
//		
//		System.out.println(ran + "의 절대값은 " + abs + "입니다.");
		
		
		
		//*. 숙제
		//bucket는 바구니에 저장될 수 있는 수량.
		//랜덤한 사과개수가 주어질 때, 필요한 바구니의 개수를 구하세요.
		//ex) 사과 151개 -> 16개, 사과 150개 -> 15개
		//-------------------------------2
		
//		int bucket = 10;
//		int apple = (int)(Math.random()*1000) +1;
//		int result = (apple % bucket == 0 ? (apple/bucket) : (apple/bucket)+1 );
//		
//		System.out.println("사과 " + apple + "개에 필요한 바구니 수는 " + result + "개 입니다.");
		
		
		
		//*정수를 입력 받아서, 양수인지 음수인지 판별하는 프로그램 코드를 작성
		//-------------------------------3
		
//		Scanner scan = new Scanner(System.in);
//	
//		System.out.print("정수를 입력하세요>");
//		int num = scan.nextInt();
//		
//		if (num < 0) {
//			System.out.println(num + "은 음수입니다.");
//		}else {
//			System.out.println(num + "은 양수입니다.");
//		}
//		scan.close();
		
		
		
		//*. 키(double) 와 나이(int)를 입력 받으세요
		//키가 140 이상이고, 나이가 8세 이상이라면 "놀이기구 탑승가능" 아니라면, 
		//"놀이기구 탑승불가"를 출력
		//-------------------------------4
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("키를 입력하세요>");
//		double tall = scan.nextDouble();
//		System.out.print("나이를 입력하세요>");
//		int age = scan.nextInt();
//		
//		if (tall >= 140 && age >= 8) {
//			System.out.println("놀이기구 탑승 가능합니다.");
//		}else {
//			System.out.println("놀이기구 탑승 불가능합니다.");
//		}
//		scan.close();
		
		
		
		//*. 정수 2개를 입력받으세요
		//두 수를 비교해서 "x가 큰 수 입니다"를 출력, 같은 수라면 "같은 수 입니다"를 출력
		//-------------------------------5
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("정수를 입력하세요>");
//		int num1 = scan.nextInt();
//		System.out.print("정수를 입력하세요>");
//		int num2 = scan.nextInt();
//		
//		if (num1 > num2) {
//			System.out.println(num1 + "이(가) 더 큰 수 입니다.");
//		} else if (num1 < num2) {
//			System.out.println(num2 + "이(가) 더 큰 수 입니다.");
//		} else {
//			System.out.println("같은 수 입니다.");
//		}
//		scan.close();
		
		
		
		//*. 양의 정수를 입력 받아 짝수 라면 "x는 짝수 입니다., 홀수 라면 "x는 홀수 입니다"를 출력하세요.
		// 0이라면 "0입니다."
		// 음수라면 "음수 입니다."를 출력하세요.
		//-------------------------------6
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("정수를 입력하세요>");
//		int num = scan.nextInt();
//		
//		if (num > 0) {
//			if (num % 2 == 0) {
//				System.out.println(num + "은(는) 짝수 입니다.");
//			}else {
//				System.out.println(num + "은(는) 홀수 입니다.");
//			}
//		}else if (num < 0) {
//			System.out.println(num + "은(는) 음수 입니다.");
//		}else {
//			System.out.println("0입니다.");
//		}
//		scan.close();
		
		
		
		/*
		 * 숙제. 
		 * 정수 3개를 받아서, 큰값, 중간값, 작은값을 구한 후
		 * 조건문안에서 max, mid, min 에 저장
		 */
		//-------------------------------7
		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("정수 입력>");
//		int num1 = scan.nextInt();
//		System.out.print("정수 입력>");
//		int num2 = scan.nextInt();
//		System.out.print("정수 입력>");
//		int num3 = scan.nextInt();
//		int max = 0;
//		int mid = 0;
//		int min = 0;
//		
//		if (num1 > num2) {
//			if (num2 > num3) {
//				max = num1;
//				mid = num2;
//				min = num3;
//			}else {
//				if (num1 > num3) {
//					max = num1;
//					mid = num3;
//				} else {
//					max = num3;
//					mid = num1;
//				}
//				min = num2;
//			}
//		}else {
//			if (num2 < num3) {
//				max = num3;
//				mid = num2;
//				min = num1;
//			}else {
//				max = num2;
//				if (num1 > num3) {
//					mid = num1;
//					min = num3;
//				}else {
//					mid = num3;
//					min = num1;
//				}
//			}
//		}
//		System.out.println("최대값: " + max);
//		System.out.println("중간값: " + mid);
//		System.out.println("최소값: " + min);
//		scan.close();
 		
		
		//*. 메뉴를 보여준 후, Scanner로 해당 메뉴를 입력 받으세요.
		//없는 메뉴 라면 "~은 메뉴에 없습니다."를 출력하세요
		//switch 구문을 이용하세요.
		//-------------------------------8
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("구입할 메뉴는?");
//		System.out.println("[수박, 사과, 멜론, 포도, 귤]");
//		System.out.print("> ");
//		String manu = scan.next();
//		
//		switch (manu) {
//		
//		case "수박":
//			System.out.println(manu + "는(은) 1만원 입니다.");
//			break;
//		case "사과":
//			System.out.println(manu + "는(은) 2만원 입니다.");
//			break;
//		case "멜론":
//			System.out.println(manu + "는(은) 3만원 입니다.");
//			break;
//		case "포도":
//			System.out.println(manu + "는(은) 4만원 입니다.");
//			break;
//		case "귤":
//			System.out.println(manu + "는(은) 5만원 입니다.");
//			break;
//		default:
//			System.out.println("없는 메뉴 입니다.");
//			break;
//		}
//		scan.close();
		
		
		
		/*
		 * Math.random()과 arr.length를 이용해서 0~3의 랜덤한 정수를 만듬
		 * 해당 랜덤수를 배열에 index에 적용해서 
		 * 선택된 단어가 한국어, 영어, 중국어, 알수없는 언어 인지 swith문으로 구별
		 */
		//-------------------------------9
		
//		String[] arr = {"안녕", "hello", "니하오", "#$%"}; //배열 선언,초기화
//		int ran = (int)(Math.random() * arr.length);
//		String x = arr[ran];
//		
//		switch (x) {
//		
//		case "안녕":
//			System.out.println(x + "는(은) 한국어 입니다.");
//			break;
//		case "hello":
//			System.out.println(x + "는(은) 영어 입니다.");
//			break;
//		case "니하오":
//			System.out.println(x + "는(은) 중국어 입니다.");
//			break;
//		default:
//			System.out.println("모르는 언어 입니다.");
//			break;
//		}
		
		
		
		//*. 구구단 형식 출력 (단수 x 행수 = 단수 * 행수)
		//양수를 입력 받으세요.
		//입력 받은 수에 해당하는 구구단을 출력하세요.
		//-------------------------------11
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("양수를 입력하세요>");
//		int dan = scan.nextInt();
//		System.out.println("-------------------");
//		
//		int a = 1;
//		
//		
//		while (a <= 9) {
//			//System.out.println(dan + " x " + a + " = " + (dan * a));
//			System.out.printf("%d x %d = %d\n", dan, a, (dan*a));
//			a++;
//		}
//		scan.close();
		
		
		
		//*. 200까지 정수중에서 3의 배수이거나 4의 배수인 경우에만 가로로 출력
		//*. 100까지 정수중에서 5의 배수의 합계를 구함.
		//*. 100까지 정수중에 4의 배수이면서 8의 배수가 아닌 수의 개수. (카운팅)
		//*. 스캐너를 이용해서 입력받은 정수까지의 약수 출력
		//-------------------------------12
		
//		int a = 1;	
//		while (a <= 200) {
//			if (a % 3 == 0 || a % 4 == 0) {
//				System.out.print(a + " ");
//			}
//			a++;
//		}
//		System.out.println(); //줄 바꿈
//		
//		int b = 1;
//		int hap = 0;
//		while (b <= 100) {
//			if (b % 5 == 0) {
//				hap += b;
//			}
//			b++;
//		}
//		System.out.println("5의 배수의 합: " + hap);
//		
//		int c = 1;
//		int count = 0;
//		while (c <= 100) {
//			if (c % 4 == 0 && c % 8 != 0) {
//				count++;
//			}
//			c++;
//		}
//		System.out.println("개수: " + count);
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("정수를 입력하세요>");
//		int num = scan.nextInt();
//		int d = 1;
//		while (d <= num) {
//			if (num % d == 0) {
//				System.out.print(d + " ");
//			}
//			d++;
//		}
		
		//*. 입력받은 수 크기의 배열을 생성하고 1~10입력받은 수를 저장하는 프로그램코드
		//-----------------------------14
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("정수입력>");
//		int num = scan.nextInt();
//		
//		int[] arr = new int[num];
//		int i = 0;
//		
//		while ( i < num ) {
//			arr[i] = i+1;
//			i++;
//		}
//		System.out.println(Arrays.toString(arr));
//		scan.close();
		
		
		
		//*. Math.radom()을 이용해서 2~9까지 랜덤수를 만들고, 해당 구구단을 for문 출력
		//-----------------------------15
		
//		int num = (int)(Math.random()*8) +2;
//		
//		for (int i = 1; i <= 9; i++) {
//			System.out.printf("%d x %d = %d\n", num,i,(num*i));
//		}
		
		
		
		//*. 7~100사이의 정수중에 7의 배수 가로 출력		(1)
		//*. 1~100정수 중의 12 배수 가로출력				(2)
		//*. 50~100사이 두 수 사이의 합					(3)
		//*. char형을 이용해서 A~Z까지 문자열을 가로로 출력	(4)
		//*. 125의 약수의 개수를 구하세요.					(5)
		//-----------------------------16
		
//		for (int i = 7; i <= 100; i += 7) {		//(1)
//			System.out.print(i + " ");
//		}
//		
//		System.out.println();
//		
//		for (int i = 1; i <= 100; i++) {		//(2)
//			if (i % 12 == 0)
//				System.out.print(i + " ");
//		}
//		
//		System.out.println();
//		
//		int sum = 0;							//(3)
//		for (int i = 50; i <= 100; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
//		
//		for(char i = 'A'; i <= 'Z'; i++) {		//(4)
//			System.out.print(i);
//		}
//		
//		System.out.println();
//		
//		int cnt = 0;							//(5)
//		for (int i = 1; i <= 125; i++) {
//			if (125 % i == 0) {
//				cnt++;
//			}
//		}
//		System.out.println(cnt + "개");
		
		
		//*. Math.random을 이용해서 랜덤하게 배열을 9번 섞습니다.
		//섞인 배열의 0~2번째 상자를 추출해서 새로운 배열에 저장하는 프로그램 코드를 작성
		//-----------------------------17
		
//		int[] arr = {1,2,3,4,5,6,7,8,9};
//		
//		for (int i = 0; i < arr.length; i++) {
//			int x = (int)(Math.random() * arr.length);
//			int y = (int)(Math.random() * arr.length);
//			
//			int temp = arr[x];
//			arr[x] = arr[y];
//			arr[y] = temp;
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		int[] arr2 = new int[3];
//		
//		for (int i = 0; i <= 2; i++) {
//			arr2[i] = arr[i];
//		}
//		System.out.println(Arrays.toString(arr2));
		
		
		//*. 가로, 세로 입력받아 그 크기의 사각형 출력		(1) for문 사용
		//*. 가로, 세로 입력받아 그 크기의 테두리 사각형 출력	(2) for문 사용
		//-----------------------------19
		
		//(1)
//		Scanner scan = new Scanner(System.in);
//		
//		int x = scan.nextInt();
//		int y = scan.nextInt();
//		
//		for (int i = 1; i <= y; i++) {
//			for (int j = 1; j <= x; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		scan.close();
		
		//(2)
//		Scanner scan = new Scanner(System.in);
//		
//		int x = scan.nextInt();
//		int y = scan.nextInt();
//		
//		for (int i = 1; i <= y; i++) {
//			for (int j = 1; j <= x; j++) {
//				if((i == 1 || i == y) || (j == 1 || j == x)) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
//		scan.close();
		
		
		//*. 입력받은 수가 소수인지 판별?							(1) for문 
		//*. 정수를 입력받으세요									(2) for문
		//2중 for문을 이용하여 입력 받은 수 까지 소수들의 합을 구하세요.
		//-----------------------------20
		
		//(1)
//		Scanner scan = new Scanner(System.in);
//		int num = scan.nextInt();
//		int cnt = 0;
//		
//		for (int i = 2; i <= num; i++) {
//			if (num % i == 0) {
//				cnt++;
//			}
//		}
		
		//(2)
//		Scanner scan = new Scanner(System.in);
//		
//		int num = scan.nextInt();
//		int sum = 0;
//		int cnt = 0;
//		
//		for (int i = 2; i <= num; i++) {
//			for (int j = 1; j <= i; j++) {
//				if (i % j ==0 ) {
//					cnt++;
//				}
//			}
//			if(cnt == 2) {
//				sum += i;
//			}
//			cnt = 0;
//		}
//		System.out.println(sum);
		
		
		//*. up-down 게임   (무한루프)
		//-----------------------------21
		
//		Scanner scan = new Scanner(System.in);
//		
//		int num = (int)(Math.random() * 100) +1;
//		int cnt = 0;
//		
//		while(true) {
//			System.out.print("입력> ");
//			int a = scan.nextInt();
//			
//			if (a != num) {
//				cnt++;
//				if ( a > num) {
//					System.out.println("더 작은 수 입력해!");
//				}else {
//					System.out.println("더 큰 수 입력해!");
//				}
//			}else {
//				cnt++;
//				System.out.println("정답입니다.");
//				break;
//			}
//		}
//		System.out.println("시도횟수: " + cnt);
		
		
		//*. 두 수의 더하기를 맞추는 문제를 지속적으로 출제하는 프로그램
		// 2가지 정수 1~100사이의 난수를 발생시켜 문제 발생
		// 정답이면 정답카운트 +1, 오답이면 오답 카운트 +1 프로그램을 만드세요
		// 또한 0을 입력받으면 반복을 중단.
		// - 문제도 추가
		//-----------------------------22
		
//		Scanner scan = new Scanner(System.in);
//		
//		int cnt1 = 0;
//		int cnt2 = 0;
//		while(true) {
//			int a = (int)(Math.random() * 100) +1;
//			int b = (int)(Math.random() * 100) +1;
//			
//			int x = (int)(Math.random() *2);
//			if (x == 0) {
//				System.out.printf("%d + %d = ?\n", a,b);
//			}else {
//				System.out.printf("%d - %d = ?\n", a,b);
//			}
//			int result = x == 0 ? a+b : a-b;
//			
//			System.out.print("> ");
//			int answer = scan.nextInt();
//			
//			if (answer == 0) break;	
//			
//			if (result == answer) {
//				cnt1++;
//				System.out.println("정답입니다.");
//			}else {
//				cnt2++;
//				System.out.println("오답입니다.");
//			}
//			System.out.println();
//			
//		}
//		System.out.println("정답횟수:" + cnt1 );
//		System.out.println("오답횟수:" + cnt2 );
		
		
		//switch문, while문을 이용해서 작성.
		//1. Scanner를 이용하여 금액을 입력 받으세요.
		//2. 음료수를 선택하면 금액에서 차감하세요.(반복문)
		//3. 금액이 부족하다면 "금액이 부족합니다"를 출력
		//4. 4를 입력받으면 반복문을 종료
		//-----------------------------23
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("돈을 넣어주세요>");
//		int money = scan.nextInt();
//		
//		es:while(true) {
//			System.out.println("남은금액:" + money + "원");
//			System.out.println("[1]데미소다 400원, [2]밀키스 500원, [3]코카콜라 600원, [4]잔돈받기");
//			
//			System.out.print("메뉴선택>");
//			int menu = scan.nextInt();
//			
//			switch (menu) {
//			case 1:
//				if (money < 400) {
//					System.out.println("금액이 부족합니다. 돈을 넣어주세요");
//				}else {
//					System.out.println("뎀이소다를 받았습니다.");
//					money -= 400;
//				}
//				break;
//			case 2 :
//				if (money < 500) {
//					System.out.println("금액이 부족합니다. 돈을 넣어주세요");
//				}else {					
//					System.out.println("밀킥스를 받았습니다.");
//					money -= 500;
//				}
//				break;
//			case 3 :
//				if (money < 600) {
//					System.out.println("금액이 부족합니다. 돈을 넣어주세요");
//				}else {
//					System.out.println("코카골라를 받았습니다.");
//					money -= 600;					
//				}
//				break;
//			case 4 :
//				System.out.println("남는 금액 " + money + "을(를) 반환합니다.");
//				break es;
//			default :
//				break;
//			}
//			System.out.println();
//			
//		}
		
		
		
		//카카오 친구찾기
		//-----------------------------24
		
//		Scanner scan = new Scanner(System.in);
//		
//		String[] arr = {"무지", "네오", "어피치", "라이언", "단무지"};
//		System.out.println("현재 저장된 친구들: " + Arrays.toString(arr));
//		
//		System.out.print("검색할 카카오친구>");
//		String search = scan.next();
//		
//		int i = 0;
//		while ( i < arr.length) {
//			
//			if (arr[i].equals(search)) {
//				System.out.println(search + "는" + (i+1) + "번째");
//				break;
//			}
//			i++;
//			
//		}
//		if ( i == arr.length) {
//			System.out.println("없음");
//		}
	}

}

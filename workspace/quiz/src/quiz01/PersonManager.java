package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class PersonManager {
	
	public static void main(String[] args) {
		
		
		//
		Scanner scan = new Scanner(System.in);
		
		String[] nameList = new String[100];
		String[] genderList = new String[100];
		int[] ageList = new int[100];
		
		int cnt = 0;	//사람 수
		int index = -1;	//현재 접근하고 있는 위치(index를 조정해서 유저의 정보 출력)
		
		ex:while(true) {
			
			System.out.println("[info]고객수:" + cnt + ", 현재위치:" + index);
			System.out.println("[menu]1.Insert, 2.Prev, 3.Next, 4.Current, 5.Update, 6.Delete, 7.Exit");
			
			System.out.print("번호입력>");
			int menu = scan.nextInt();
			
			switch (menu) {
			case 1:
				System.out.println("=======고객정보입력=======");
				/*
				 * 이름, 성별, 나이를 입력받아서 각각 배열에 순서대로 저장. (count)를 이용
				 */;
				while (true) {
					System.out.print("이름입력>");
					String name = scan.next();
					if (name.equals("그만")) {
						System.out.println("입력종료");
						break;
					}else {
						nameList[index+1] = name;
					}
					System.out.print("성별입력>");
					genderList[index+1] = scan.next();
					System.out.print("나이입력>");
					ageList[index+1] = scan.nextInt();
					
					index++;
					cnt++;
					
					System.out.println();
				}
				System.out.println("======================");
				break;
			case 2:
				System.out.println("=======이전고객정보=======");
				/*
				 * index를 이용해서 이전고객정보를 출력해주는 기능.
				 * 조건식을 사용해서 이전범위를 출력할 수 없다면 "이전정보가 없습니다." 경고문 출력 
				 * (hint == 0)
				 */
				System.out.print("몇번째 이전 고객정보를 출력>");
				int num = scan.nextInt();
				
				if (num <= 1) {
					System.out.println("이전정보가 없습니다.");
				}
				
				for(int j = 0; j < num-1; j++) {
					System.out.print(nameList[j] + "\t");
					System.out.print(genderList[j] + "\t");
					System.out.print(ageList[j]);
					System.out.println();	
					
					if (j >= index) {		//null값을 출력 안하기 위한 반복문
						break;
					}
				}
				System.out.println("======================");
				break;
			case 3:
				System.out.println("=======다음고객정보=======");
				/*
				 * index를 이용해서 이후고객정보를 출력해주는 기능.
				 * count와 index를 비교해서, 다음 범위를 출력할 수 없다면 "다음정보는 없습니다." 경고문 출력
				 */
				System.out.print("몇번째 이후 고객정보를 출력>");
				int num2 = scan.nextInt();
				
				if (num2 > index) {
					System.out.println("다음정보는 없습니다.");
				}
				
				for (int j = num2; j < index+1; j++) {
					System.out.print(nameList[j] + "\t");
					System.out.print(genderList[j] + "\t");
					System.out.print(ageList[j]);
					System.out.println();	
				}
				System.out.println("======================");
				break;
			case 4:
				/*
				 * index를 이용해서 현재 고객 정보를 출력해주는 기능.
				 * 현재 정보를 출력할 수 있는 범위를 생각해서 현재정보를 출력합니다.
				 * index가 벗어났다면, "현재정보는 없습니다."를 출력
				 * ->3번이랑 같을지 않나
				 * 힌트) intdex >=  0 && index <= cnt -1
				 */
				
//				if (index >= 0 && index <= cnt -1 ) {
//					System.out.println("이름:" + nameList[index]);
//					System.out.println("성별:" + genderList[index]);
//					System.out.println("나이:" + ageList[index]);
//				}else {
//					System.out.println("현재 정보는 없습니다.");
//				}
//				break;
					
				System.out.print("몇번째 고객정보 출력>");
				int num3 = scan.nextInt();
				
				
				if (num3 > index+1) {
					System.out.println("현재정보는 없습니다.");
				}else {
					System.out.println(nameList[num3-1] + "\t" +genderList[num3-1] + "\t" + ageList[num3-1]);
				}
				
				System.out.println("======================");
				break;
			case 5:
				System.out.println("=======고객정보수정=======");
				/*
				 * 스캐너를 이용해서, 이름, 성별, 나이를 입력받아 현재 위치 정보를 업데이트
				 * 출력가능한 범위는 4번이랑 같음 (현재이기 때문에)				 
				 */
				
//				if (index >= 0 && index <= cnt -1 ) {
//					System.out.println("정보를 수정합니다.>");
//				
//					System.out.println("정보를 수정합니다.>");
//					System.out.println("이름:" + nameList[index]);
//					nameList[index] = scan.next();
//					System.out.println("성별:" + genderList[index]);
//					genderList[index] = scan.next();
//					System.out.println("나이:" + ageList[index]);
//					ageList[index] = scan.next();
//				} else {
//					System.out.println("수정할 데이터가 없습니다.");
//				}
				
				
				System.out.print("몇번째 사람의 정보를 변경?>");
				int k = scan.nextInt();
				
				if (k > index+1) {
					System.out.println("수정할 수 없는 번째입니다.");
				}else {
					System.out.print("이름변경>");
					String newName = scan.next();
					System.out.print("성별변경>");
					String newGender = scan.next();
					System.out.print("나이변경>");
					int newAge = scan.nextInt();
					
					nameList[k-1] = newName;
					genderList[k-1] = newGender;
					ageList[k-1] = newAge;
				}
				
				
				System.out.println("======================");
				break;
			case 6:
				System.out.println("=======고객정보삭제=======");
				/*
				 * 삭제가능 조건은 4번과 같다.
				 * 현재 index부터 ~  cnt index까지 배열의 요소를 당겨서 덮어 씌웁니다.
				 * **고객수의 감소**
				 */
				
//				if (index >= 0 && index <= cnt -1 ) {
//					for(int i = index; i < cnt-1; i++) {
//						nameList[i] = nameList[i+1];
//						genderList[i] = genderList[i+1];
//						ageList[i] = ageList[i+1];
//					}
//					cnt--;
//				}else {
//					System.out.println("삭제할 정보가 없습니다.");
//				}
				
				
				System.out.print("몇번째 고객정보를 삭제?>");
				int num6 = scan.nextInt();
				boolean bool = true;
				
				for (int j = 0; j < index+1; j++) {
					if ( (num6-1) == j ) {
						for (int l = j; l < index; l++) {
							nameList[l] = nameList[l+1];
							genderList[l] = genderList[l+1];
							ageList[l] = ageList[l+1];
						}
						System.out.println("삭제 되었습니다.");
						
						cnt--;
						index--;
						bool = false;
					}
				}
				if (bool) {
					System.out.println("삭제할 번째가 없음");
				}
					
				System.out.println("======================");
				break;
			case 7:
				//무한반복문의 탈출
				System.out.println("=========end=========");
				break ex;
//				System.exit(0);   //종료하는 방법
			default:
				System.out.println("번호를 잘못 입력하셨습니다.");
				break;
			}
			
			
			
		}
		
		scan.close();
		
	}

}

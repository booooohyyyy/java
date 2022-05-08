package quiz24;

import java.util.Random;

public class VoteThread implements Runnable{
	
	/*
	 * run()메서드 안에서는 랜덤값을 이용해서 개표 진행상황을 화면에 출력.
	 * 조건: 개표율이 100% 넘어가면 안됌
	 */
	
	private int sum; //개표율
	private Random ran = new Random();
	private StringBuffer sb = new StringBuffer();
	
	
	@Override
	public void run() {
		
		while(sum < 100) {
			
			int num = ran.nextInt(10)+1; //1~10
			sum += num;                  //sum에 누적
			
			if(sum > 100) { //100초과
				for(int i =1; i < 100-(sum-num); i++) { //초과되는 부분 제외하고 누적
					sb.append("*");
				}
				sum = 100; 
			}else {			//100이하	
				for(int i = 1; i <= num; i++) {         //별 누적
					sb.append("*");
				}
			}
			
			//출력문
			System.out.println(Thread.currentThread().getName() + "개표율" + sum +"%:" + sb);
			if(sum == 100) {
				System.out.println(Thread.currentThread().getName() + "의 개표가 완료됐습니다.");
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	

}

package level1;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoChoicPlus {
	
	public static void main(String[] args) {
		
//		int num = (int)(Math.random() * 99) +2;
//		
//		int[] numbers = new int[num];
//		int[] result = new int[num+1];
//		
//		for(int i = 0; i < num; i++) {           //배열에 변수 초기화
//			numbers[i] = (int)(Math.random()*101);
//		}
//		
//		for(int i = 0; i < num-1; i++) {
//			for (int j = (i+1); j < num; j++ ) {
//				result[i] = numbers[i] + numbers[j];
//			}
//		}
//		System.out.println(Arrays.toString(result));
//		
//		//오름차순
////		Arrays.sort(result);
//		for (int i = 0; i < num-1; i++) {		//arr.length-1 **
//			for (int j = (i+1); j < num; j++ ) {	//int j = (i+1)**
//				if (result[i] > result[j]) {  // > : 오름차순, < : 내림차순
//					int temp = result[i];
//					result[i] = result[j];
//					result[j] = temp;
// 				}			
//			}
//		}
//		
//		//중복 삭제
//		for(int i = 0; i < num-1; i++) {
//			if (result[i] == result[i+1]) {
//				result[i] = result[i+1];
//				result[i+1] = result[i+2];
//			}
//		}
//		System.out.println(Arrays.toString(result));
		
		
		
		System.out.println("----------------------------");

		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int num = (int)(Math.random() * 99) +2;
		int[] numbers = new int[num];
		
		for(int i = 0; i < num; i++) {				//배열에 변수 초기화
			numbers[i] = (int)(Math.random()*101);
		}
		
		for(int i=0; i<numbers.length; i++) {		//더한값을 넣어줌
            for(int j = i+1; j < numbers.length; j++){
                int a = numbers[i]+numbers[j];
                if (list.indexOf(a) < 0){
                	list.add(a);
                }
            }
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        System.out.println(Arrays.toString(answer));
     
        Arrays.sort(answer);
        System.out.println(Arrays.toString(answer));
		
	}

}

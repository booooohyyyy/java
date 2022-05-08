package level1;

public class DartGame {
	
	public static void main(String[] args) {
		
		String DartResult = "1S2D*3T";
		String DartResult2 = "1D2S#10S";
		String DartResult3 = "1D2S0T";
		String DartResult4 = "1S*2T*3S";
		String DartResult5 = "1D#2S*3S";
		String DartResult6 = "1T2D3D#";
		String DartResult7 = "1D2S3T*";
		
		System.out.println(solution(DartResult));
		System.out.println(solution(DartResult2));
		System.out.println(solution(DartResult3));
		System.out.println(solution(DartResult4));
		System.out.println(solution(DartResult5));
		System.out.println(solution(DartResult6));
		System.out.println(solution(DartResult7));
		
		
	}//end main
	
	static int solution(String DartResult) {
		
		char[] darts = DartResult.toCharArray();
        int[] score = new int[3];
        int cnt = -1;
 
        for(int i = 0; i < darts.length; i++) {
            if(darts[i] >= '0' && darts[i] <= '9') {
                cnt++;
                if(darts[i] == '1' && darts[i+1] == '0') {
                    score[cnt] = 10;
                    i++;
                } else {
                    score[cnt] = darts[i] - '0'; // askll 49-48
                }
            } else if(darts[i] == 'D') {
                score[cnt] *= score[cnt];
            } else if(darts[i] == 'T') {
                score[cnt] *= score[cnt] * score[cnt];
            } else if(darts[i] == '*') {
                if(cnt > 0) {
                    score[cnt-1] *= 2;
                }
                score[cnt] *= 2;
            } else if(darts[i] == '#') {
                score[cnt] *= -1;
            }
        }
        return score[0] + score[1] + score[2];

	}

}

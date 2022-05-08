package level2;

public class ThisSong {
	
	public static void main(String[] args) {
		
		String m = "ABCDEFG";
		String[] musicinfos = {"12:00,12:14,HELLO,CDEFGAB", "13:00,13:05,WORLD,ABCDEF"};
		
		String m2 = "CC#BCC#BCC#BCC#B";
		String[] musicinfos2 = {"03:00,03:30,FOO,CC#B", "04:00,04:08,BAR,CC#BCC#BCC#B"};
		
		String m3 = "ABC";
		String[] musicinfos3 = {"12:00,12:14,HELLO,C#DEFGAB", "13:00,13:05,WORLD,ABCDEF"};
		
		System.out.println(solution(m, musicinfos));
		System.out.println(solution(m2, musicinfos2));
		System.out.println(solution(m3, musicinfos3));
		
		

	}//end main
	
	static String solution(String m, String[] musicinfos) {
		
        String answer = "";
        int maxtime = 0;
        for(int i = 0; i<m.length();i++){
            m = m.replace("A#","a");
            m = m.replace("C#","c");
            m = m.replace("D#","d");
            m = m.replace("F#","f");
            m = m.replace("G#","g");
            m = m.replace("E#","e");
        }

        for(int i = 0; i< musicinfos.length;i++) {
            String[] tmp = musicinfos[i].split(",");

            tmp[3] = tmp[3].replace("A#","a");
            tmp[3] = tmp[3].replace("C#","c");
            tmp[3] = tmp[3].replace("D#","d");
            tmp[3] = tmp[3].replace("F#","f");
            tmp[3] = tmp[3].replace("G#","g");
            tmp[3] = tmp[3].replace("E#","e");
            

            String[] starttime = tmp[0].split(":");
            String[] endtime = tmp[1].split(":");

            int hour = Integer.parseInt(endtime[0]) - Integer.parseInt(starttime[0]);
            int min = Integer.parseInt(endtime[1]) - Integer.parseInt(starttime[1]) + (hour * 60);

            String meltmp = "";
            for(int j = 0; j<min;j++){
                meltmp += tmp[3].charAt(j%tmp[3].length());
            }
            //System.out.println(meltmp); 노래가 진행되는 동안의 음들
            if(meltmp.contains(m)){
                if(maxtime < meltmp.length()){
                    maxtime = meltmp.length();
                    answer = tmp[2];
                }
            }
        }
        return answer;

    }

}

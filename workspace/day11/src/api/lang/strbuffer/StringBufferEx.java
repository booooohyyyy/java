package api.lang.strbuffer;

public class StringBufferEx {
	
	public static void main(String[] args) {
		
		//StringBuffer, StringBuilder는 기능상 같다.
		
		String str = new String("java");
		StringBuffer sb = new StringBuffer("java");
		
		System.out.println(str);
		System.out.println(sb);
		
		
		//차이점
		str = str + " program";
		sb.append(" program");
		System.out.println(str); //java program
		System.out.println(sb);  //java program
		
		System.out.println("------------------");
		
		//append - 문자열 뒤에 추가
		sb.append("ing");
		System.out.println(sb);
		
		//insert - 문자열 중간에 추가
		sb.insert(5, "study ");
		System.out.println(sb);
		
		//replace - 문자열 변경
		sb.replace(5, 10, "is");
		System.out.println(sb);
		
		//delete - 문자열 삭제
		sb.delete(5, 8);
		System.out.println(sb);
		
		//reverse - 문자열을 거꾸로
		sb.reverse();
		System.out.println(sb);
		
		//StringBuffer 비교 String
		//문자열의 형태로 변경
		if(sb.toString().equals("gnimargorp avaj")) {
			System.out.println("문자가 같음");
		}
		
	}//end main

}

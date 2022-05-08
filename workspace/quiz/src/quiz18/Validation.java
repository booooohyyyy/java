package quiz18;

public class Validation {
	
	public static String masking(String ssn) throws Exception {
		
		String ssn2 = ssn.replace("-", "");
		
		if((ssn2.length() != 13)) { 
			System.out.println("주민번호는 13자리 입니다!");
			throw new Exception("예외!");
		}else if ((ssn2.charAt(6) != '1') && (ssn2.charAt(6) != '2')) {
			System.out.println("뒤 첫째자리는 1~4 입니다!");
			throw new Exception("예외!");
		}
		
		if(ssn2.charAt(6) == '1'|| ssn2.charAt(6) == '3') {
			System.out.println("남자");
		}else if(ssn2.charAt(6)== '2' || ssn2.charAt(6) == '4'){
			System.out.println("여자");
		}
		
		ssn = ssn.substring(0, 7);
		
		ssn += "*******";
		
		return ssn;
	}

}

package encap.good;

public class MyDate {
	
	//은닉을 사용할 경우
	private int year;
	private int month;
	private int day;
	private String ssn;
	
	/*
	 * 은닉된 변수의 값을 사용할 때, getter/setter 메서드를 사용해서
	 * 데이터에 접근
	 * 
	 * setter메서드
	 * 1.은닉변수에 값 저장을 위한 메서드
	 * 2. 접근제어자는 public 메서드이름은 set + 멤버변수명 으로 지정
	 */
	
	public void setYear(int year) {  //setter의 평범한 형태는 void
		if(year > 2021 || year < 1900) {
			System.out.println("년도는 1900~2021까지 입니다.");
			return;
		}
		
		this.year = year;
	}
	
	
	/*
	 * getter메서드
	 * 1. 은닉변수에 값을 조회하는 메서드
	 * 2. 접근제한자는 public, 메서드이름은 get + 멤버변수명 으로 지정
	 */
	
	public int getYear() {	//getter의 평범한 경우 매개변수x
		return year;
	}
	
	/*
	 * 1.month, day, ssn에 대한 getter, setter 생성
	 * month - 1~12월까지
	 * day - 1~31일까지
	 * ssn - 13자리까지 저장 가능 (문자열.length())
	 */
	
	public void setMonth(int month) {
		if(month > 12 || month < 1) {
			System.out.println("월은 1~12까지 입니다.");
			return;
		}
		this.month = month;		
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setDay(int day) {
		if(day > 31 || day < 1) {
			System.out.println("일은 1~31까지 입니다.");
		}
		this.day = day;
	}
	
	public int getDay() {
		return day;
	}
	
	public void setSsn(String ssn) {
		if(ssn.length() != 13) {
			System.out.println("주민번호는 13자리 입니다.");
		}
		this.ssn = ssn;
	}
	
	public String getSsn() {
		return ssn;
	}

}

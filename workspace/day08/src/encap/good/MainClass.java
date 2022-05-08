package encap.good;

public class MainClass {
	
	public static void main(String[] args) {
		
		MyDate me = new MyDate();
		
		me.setYear(2021);
		int year = me.getYear();
		System.out.println("년도:" + year);
		
		me.setMonth(12);
		int month = me.getMonth();
		System.out.println("월:" + month);
		
		me.setDay(8);
		int day = me.getDay();
		System.out.println("일:" + day);
		
		me.setSsn("2112083022222");
		String ssn = me.getSsn();
		System.out.println("주민번호:" + ssn);
		
	}

}

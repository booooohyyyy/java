package quiz08;

public class MainClass {
	
		public static void main(String[] args) {
		
		SuperSonicAp ap1 = new SuperSonicAp("대한항공");
		ap1.fly();
		ap1.flyMode = 1;
		ap1.fly();
		
		ap1.takeOff();
		System.out.println(ap1.info());
		ap1.land();
		
	}
	
	

}

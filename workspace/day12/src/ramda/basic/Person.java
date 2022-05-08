package ramda.basic;
import ramda.basic.Say01;

public class Person {
	
	//말하기 기능
	public void greeting(Say01 say) {
		say.talking();
	}
	
	//말하기 기능2
	public void greeting(Say02 say) {
		String str = say.talking();
		System.out.println("인사법:" + str);
	}
	
	//말하기 기능3
	public void greeting(Say03 say) {
		String str = say.talking("니하오");
		System.out.println("인사법:" + str);
	}
	
	//말하기 기능4
	public String greeting(Say04 say) {
		String str = say.talking(3, "hello");
		return str;
	}

}

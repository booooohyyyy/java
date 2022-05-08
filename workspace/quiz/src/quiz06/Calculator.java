package quiz06;

public class Calculator {
	
	int result;
	double pi;
	
	
	
	//메서드
	int add(int a) {
		result += a;
		return result;
	}
	
	int sub(int a) {
		result -= a;
		return result;
	}
	
	double circle(int r) {
		double area = r * r * pi;
		return area;
	}

}

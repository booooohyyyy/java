package quiz06;

public class Computer extends Calculator {
	
	
	
	double circle(int r) {
		double area = r * r * Math.PI;
		return area;	
	}
	
	double rect(double a) {
		double area = a * a;
		return area;
	}
	
	double rect(double a, double b) {
		double area = a * b;
		return area;
	}
	
	double rect(double a, double b, double c) {
		double area = a * b * c;
		return area;
	}

}

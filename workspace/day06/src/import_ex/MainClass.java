package import_ex;


//패키지가 다른 클래스는 import선언 필요, 패키지 명.클래스 명
//import fruit.Orange;	
//import fruit.Apple;
import fruit.*;   //fruit안에 있는 모든 클래스 import

import java.util.Scanner;

import com.abc.ABC;
import com.def.DEF;




public class MainClass {
	
	public static void main(String[] args) {
		
		Orange o = new Orange();
		Apple a = new Apple();
		
		ABC abc = new ABC();
		DEF def = new DEF();
		
		Scanner scan = new Scanner(System.in); //System.in >> 생성자의 매개변수
		
		int i = 1;
		System.out.println(i);	//1
		System.out.println(o);	//?	>>참조타입
		System.out.println(a); 	//?	>>참조타입
		
		
	}

}

package jdbc.dao;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
	
		//JDBC문장을 메서드로 옮기기!
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("조회 아이디>");
		int id = scan.nextInt();
		
		//DAO객체 필요
		jdbcDAO dao = new jdbcDAO();
		Employees emps = dao.selectTest(id);
		
	}
		

}

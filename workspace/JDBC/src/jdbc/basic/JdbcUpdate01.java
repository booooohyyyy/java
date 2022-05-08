package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JdbcUpdate01 {
	
	public static void main(String[] args) {
		
		/*
		 * INSERT랑 구문이 크게 다르지 않음
		 * 수정할 아이디, 비번, 이름, 이메일을 받아서 MEMBERS테이블을 수정
		 * 수정이 성공하면 "수정성공", 실패하면 "수정실패" 구문 출력
		 */
		
		//입력받는 아이디, 이름, 이메일, 주소
		Scanner scan = new Scanner(System.in);
		
		System.out.print("아이디>");
		String id = scan.next();
		System.out.print("비번>");
		String pw = scan.next();
		System.out.print("이름>");
		String name = scan.next();
		System.out.print("이메일>");
		String email = scan.next();
		
		//DB에 필요한 변수 선언
		//데이터 베이스 연결 주소
		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String uid = "HR";
		String upw = "HR";
		
		//java.sql 패키지에 있는 2가지 클래스 선언
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "UPDATE MEMBERS SET PW = ?, NAME = ?, EMAIL = ? WHERE ID = ?";
		
		try {
			//1. jdbc드라이버 호출
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. conn 생성
			conn = DriverManager.getConnection(url, uid, upw);
			
			//3. pstmt 생성
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, pw);
			pstmt.setString(2, name);
			pstmt.setString(3, email);
			pstmt.setString(4, id);
			
			//4. 실행
			int result = pstmt.executeUpdate();
			
			//5. 결과출력
			if (result == 1) {
				System.out.println("수정성공!");
			} else {
				System.out.println("수정실패!");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) conn.close();
				if(pstmt != null) pstmt.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}

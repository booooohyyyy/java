package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JdbcDelete01 {
	
	public static void main(String[] args) {
		
		/*
		 * id를 입력받아서 아이디에 해당하는 데이터를 삭제하는 jdbc프로그램을 작성
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("삭제할 아이디>");
		String id = scan.next();
		
		//DB에 필요한 변수 선언
		//데이터 베이스 연결 주소
		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String uid = "HR";
		String upw = "HR";
			
		//java.sql 패키지에 있는 2가지 클래스 선언
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "DELETE FROM MEMBERS WHERE ID = ?";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection(url, uid, upw);
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);

			int result = pstmt.executeUpdate();
			
			if(result == 1) {
				System.out.println("삭제성공");
			} else {
				System.out.println("삭제실패");
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

package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JdbcSelect02 {
	
	public static void main(String[] args) {
		
		/*
		 * employees에서 조회
		 * id를 입력받아서 해당 아이디에 해당하는
		 * 회원아이디, first_name, job_id, department_id 출력
		 * resultSet 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("조회할 id>");
		int id = scan.nextInt();
		
		//데이터 베이스 연결 주소
		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String uid = "HR";
		String upw = "HR";
				
		//java.sql 패키지에 있는 3가지 클래스 선언
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "SELECT EMPLOYEE_ID, FIRST_NAME, JOB_ID, DEPARTMENT_ID" 
				   + " FROM EMPLOYEES"
				   + " WHERE EMPLOYEE_ID = ?";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection(url, uid, upw);
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				int employee_id = rs.getInt("EMPLOYEE_ID");
				String first_name = rs.getString("FIRST_NAME");
				String job_id = rs.getString("JOB_ID");
				int department_id = rs.getInt("DEPARTMENT_ID");
				
				System.out.println("아이디: " + employee_id);
				System.out.println("이름: " + first_name);
				System.out.println("job_id: " + job_id);
				System.out.println("부서_id: " + department_id);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) conn.close();
				if(pstmt != null) pstmt.close();
				if(rs != null) rs.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	
	}

}

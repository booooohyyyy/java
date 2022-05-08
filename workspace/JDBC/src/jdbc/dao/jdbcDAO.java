package jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class jdbcDAO {
	
	//데이터 베이스 연결 주소
	String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
	String uid = "HR";
	String upw = "HR";
			
	//java.sql 패키지에 있는 3가지 클래스 선언
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public Employees selectTest(int id) {
		
		//외부에서 입력 받을 값을 매개변수로 선언
		//JDBC코드
		
		Employees emps = new Employees();
		
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
				
				//생성한 emps 객체에 값을 저장
				emps.setEmployee_id(employee_id);
				emps.setFirst_name(first_name);
				emps.setJob_id(job_id);
				emps.setDepartment_id(department_id);
				
//				System.out.println("아이디:" + emps.getEmployee_id());
//				System.out.println("이름:" + emps.getFirst_name());
//				System.out.println("직업아이디:" + emps.getJob_id());
//				System.out.println("부서아이디:" + emps.getDepartment_id());
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
		
		return emps;
		
	}

}

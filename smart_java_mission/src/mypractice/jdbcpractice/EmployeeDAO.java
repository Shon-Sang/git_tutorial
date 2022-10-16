package mypractice.jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private static EmployeeDAO dao = new EmployeeDAO();
	
	private EmployeeDAO() {
	}
	
	public static EmployeeDAO getInstance() {
		return dao;
	}
	
	public Connection init() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin://@127.0.0.1:1521:xe";
		String id = "hr";
		String password = "a1234";
		
		return DriverManager.getConnection(url, id, password);
	}
	
	public void exit() throws SQLException {
		if(rs != null) {
			rs.close();
		}
		if(pstmt != null) {
			pstmt.close();
		}
		if(stmt != null) {
			stmt.close();
		}
		if(conn != null) {
			conn.close();
		}
	}
	
	public List<EmployeeDTO> searchEmployee(){
		List<EmployeeDTO> eList = new ArrayList<EmployeeDTO>();
		String sql = "SELECT e.first_name, d.department_name, e.salary "
				+ "FROM employees e, departments d "
				+ "WHERE e.department_id = d.department_id "
				+ "AND e.first_name LIKE" + "'%"+"J" + "%'";
		try {
			conn = init();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				EmployeeDTO dto = new EmployeeDTO();
				dto.setFirst_name(rs.getString("first_name"));
				dto.setDepartment_name(rs.getString("department_name"));
				dto.setSalary(rs.getInt("salary"));
				eList.add(dto);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				exit();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return eList;
	}
}

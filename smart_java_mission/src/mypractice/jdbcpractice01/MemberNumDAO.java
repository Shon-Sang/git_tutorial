package mypractice.jdbcpractice01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MemberNumDAO {
	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private final String oracleDriver = "oracle.jdbc.OracleDriver";
	private final String oracleLocalAddress = "jdbc:oracle:thin://@127.0.0.1:1521:xe";
	
	private static MemberNumDAO numDao = new MemberNumDAO();
	
	private MemberNumDAO() {
		
	}
	
	public static MemberNumDAO getInstance() {
		return numDao;
	}
	
	private Connection init() throws ClassNotFoundException, SQLException {
		Class.forName(oracleDriver);
		String id = "hr";
		String pw = "a1234";
		
		
		return DriverManager.getConnection(oracleLocalAddress, id, pw);
	}
	
	private void exit() throws SQLException {
		if(rs != null) {
			rs.close();
		}
		
		if(stmt != null) {
			stmt.close();
		}
		
		if(pstmt != null) {
			pstmt.close();
		}
		
		if(conn != null) {
			conn.close();
		}
	}
	
	public List<EmployeesDTO> searchMemberList(){
		List<EmployeesDTO> resultList = new ArrayList<EmployeesDTO>();
		String sql = "SELECT d.department_name AS \"부서명\", to_char(e.hire_date, 'yyyy'), count(*) "
				+ "FROM employees e, departments d "
				+ "WHERE e.department_id = d.department_id "
				+ "GROUP BY d.department_name, to_char(e.hire_date, 'yyyy') "
				+ "HAVING to_char(e.hire_date, 'yyyy') < 2005 "
				+ "ORDER BY to_char(e.hire_date, 'yyyy')";
		
		try {
			conn = init();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				EmployeesDTO eDTO = new EmployeesDTO();
				
				eDTO.setDptmDTO(new DepartmentsDTO());
				eDTO.getDptmDTO().setDepartment_name(rs.getString("부서명"));
				
				eDTO.setCount(rs.getInt("count(*)"));
				
				eDTO.setTo_char(rs.getString(2));
				
				
				resultList.add(eDTO);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return resultList;
	}
}

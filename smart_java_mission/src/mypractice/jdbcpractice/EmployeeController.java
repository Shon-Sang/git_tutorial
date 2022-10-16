package mypractice.jdbcpractice;

import java.util.List;

public class EmployeeController {
	public EmployeeController() {
		
	}
	
	public void searchEmployeeProcess() {
		EmployeeDAO dao = EmployeeDAO.getInstance();
		List<EmployeeDTO> eList = dao.searchEmployee();
		for(EmployeeDTO dto : eList) {
			System.out.println(dto.toString());
		}
	}
}

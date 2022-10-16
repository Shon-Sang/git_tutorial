package mypractice.jdbcpractice;

public class EmployeeDTO {
	private String first_name;
	private String department_name; // 이렇게 안한다고함
	private int salary;
	
	public EmployeeDTO() {
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getDepartment_name() {
		return department_name;
	}

	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s %d", first_name, department_name, salary);
	}
}

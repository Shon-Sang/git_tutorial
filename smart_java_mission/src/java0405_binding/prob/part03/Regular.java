package java0405_binding.prob.part03;

public class Regular extends Employee{
	private int salary;
	private int extra_pay;
	
	public Regular() {
		
	}
	
	public Regular(String name, String depart, String depart_separ, int salary, int extra_pay) {
		super(name, depart, depart_separ);
		this.salary = salary;
		this.extra_pay = extra_pay;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getExtra_pay() {
		return extra_pay;
	}

	public void setExtra_pay(int extra_pay) {
		this.extra_pay = extra_pay;
	}
	
	@Override
	public int getGrossSalary() {
		return salary+extra_pay;
	}
	
	@Override
	public String toString() {
		return String.format("%s 총급여 %d", super.getName(), getGrossSalary());
	}
}

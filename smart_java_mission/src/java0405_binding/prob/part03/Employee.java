package java0405_binding.prob.part03;

public abstract class Employee {
	private String name;
	private String depart;
	private String depart_separ;
	
	public Employee() {
	}
	
	public Employee(String name, String depart, String depart_separ) {
		this.name = name;
		this.depart = depart;
		this.depart_separ = depart_separ;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	public String getDepart_separ() {
		return depart_separ;
	}

	public void setDepart_separ(String depart_separ) {
		this.depart_separ = depart_separ;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s %s", name, depart, depart_separ);
	}
	
	public abstract int getGrossSalary();

}

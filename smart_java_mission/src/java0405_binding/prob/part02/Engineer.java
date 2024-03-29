package java0405_binding.prob.part02;

public class Engineer extends Employee{
	public Engineer() {
		super();
	}

	public Engineer(String name, int salary) {
		super(name, salary);
	}

	@Override
	public int getBonus() {
		return 150000;
	}
	
	@Override
	public int getSpecialBonus() {
		return (int)(salary*1.13);
	}
	

	@Override
	public String toString() {
		return super.toString()+"\t"+getBonus();
	}
}
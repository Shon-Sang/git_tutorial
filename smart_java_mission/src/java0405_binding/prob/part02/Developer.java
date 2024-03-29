package java0405_binding.prob.part02;

public class Developer extends Employee{
	public Developer() {
		super();
	}

	public Developer(String name, int salary) {
		super(name, salary);
	}

	@Override
	public int getBonus() {
		return 100000;
	}
	
	@Override
	public int getSpecialBonus() {
		
		return (int)(salary*1.15);
	}

	@Override
	public String toString() {
		return super.toString()+"\t"+getBonus();
	}
}
package java0405_binding.prob.part03;

public class Contract extends Employee{
	int workDay;
	int dailyPay;
	
	public Contract() {
		
	}
	
	public Contract(String name, String depart, String depart_separ, int workDay, int dailyPay) {
		super(name, depart, depart_separ);
		this.workDay = workDay;
		this.dailyPay = dailyPay;
	}

	public int getWorkDay() {
		return workDay;
	}

	public void setWorkDay(int workDay) {
		this.workDay = workDay;
	}

	public int getDailyPay() {
		return dailyPay;
	}

	public void setDailyPay(int dailyPay) {
		this.dailyPay = dailyPay;
	}
	
	@Override
	public int getGrossSalary() {
		return workDay*dailyPay;
	}
	
	@Override
	public String toString() {
		return String.format("%s 총급여 %d", super.getName(), getGrossSalary());
	}
}

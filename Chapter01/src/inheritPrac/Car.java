package inheritPrac;

public class Car {
	
	int number;
	String color;
	
	public Car() {
		this.number = 1000;
		this.color = "Black";
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void showInfo() {
		System.out.printf("��ȣ�� %d �̰� ������ %s �Դϴ�.\n", this.number, this.color);
	}
	
	

}

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
		System.out.printf("번호는 %d 이고 색상은 %s 입니다.\n", this.number, this.color);
	}
	
	

}

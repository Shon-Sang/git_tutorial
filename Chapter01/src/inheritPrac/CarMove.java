package inheritPrac;

public abstract class CarMove {
	String name;
	int point_x, point_y;
	
	public abstract void Move();
	
	public int getPoint_x() {
		return point_x;
	}
	public void setPoint_x(int point_x) {
		this.point_x = point_x;
	}
	public int getPoint_y() {
		return point_y;
	}
	public void setPoint_y(int point_y) {
		this.point_y = point_y;
	}
	
	
}

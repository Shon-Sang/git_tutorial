package inheritPrac;

public class Tank extends CarMove{
	
	public Tank() {
		name = "��ũ";
	}
	
	@Override
	public void Move() {
		System.out.println(name +"�� ��ġ�� " + point_x+ ", "+ point_y +"��ǥ �Դϴ�.");
	}
	
	
	
	

}

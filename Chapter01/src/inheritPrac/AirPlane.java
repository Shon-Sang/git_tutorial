package inheritPrac;

public class AirPlane extends CarMove{
	
	public AirPlane() {
		name = "�����";
	}
	
	@Override
	public void Move() {
		System.out.println(name +"�� ��ġ�� " + point_x+ ", "+ point_y +"��ǥ �Դϴ�.");
	}
	

}

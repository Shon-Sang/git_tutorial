package inheritPrac;

public class AirPlane extends CarMove{
	
	public AirPlane() {
		name = "비행기";
	}
	
	@Override
	public void Move() {
		System.out.println(name +"의 위치는 " + point_x+ ", "+ point_y +"좌표 입니다.");
	}
	

}

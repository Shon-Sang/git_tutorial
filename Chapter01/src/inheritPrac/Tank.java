package inheritPrac;

public class Tank extends CarMove{
	
	public Tank() {
		name = "탱크";
	}
	
	@Override
	public void Move() {
		System.out.println(name +"의 위치는 " + point_x+ ", "+ point_y +"좌표 입니다.");
	}
	
	
	
	

}

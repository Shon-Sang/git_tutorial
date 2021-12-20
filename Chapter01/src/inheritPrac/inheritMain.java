package inheritPrac;

public class inheritMain {

	public static void main(String[] args) {
		Sonata sonata = new Sonata();
		Carens carens = new Carens();
		CarMove tank = new Tank();
		CarMove airplane = new AirPlane();
		
		sonata.setColor("Red");
		sonata.setNumber(2000);
		sonata.showSonata();
		sonata.showInfo();
		
		System.out.println();
		
		carens.setColor("Yellow");
		carens.setNumber(3000);
		carens.showCarens();
		carens.showInfo();
		
		System.out.println();
		
		tank.setPoint_x(125);
		tank.setPoint_y(3);
		tank.Move();
		
		System.out.println();
		
		airplane.setPoint_x(222);
		airplane.setPoint_y(65);
		airplane.Move();
	}

}

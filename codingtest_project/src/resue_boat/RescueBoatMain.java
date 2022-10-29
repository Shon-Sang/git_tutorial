package resue_boat;

public class RescueBoatMain {

	public static void main(String[] args) {
		RescueBoat rb = new RescueBoat();
		int[] people = {50,50,150,50};
		int limit = 100;
		System.out.println(rb.solution02(people, limit));
	}

}

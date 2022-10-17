package number_game;

public class NumberGameMain {

	public static void main(String[] args) {
		int[] A = {2,2,2,2};
		int[] B = {1,1,1,1};
		NumberGame ng = new NumberGame();
		System.out.println(ng.solution(A, B));
	}

}

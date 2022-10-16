package integer_triangle;

public class IntegerTriangleMain {

	public static void main(String[] args) {
		int[][] parameter  = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
		IntegerTriangle it = new IntegerTriangle();
		System.out.println(it.solution02(parameter));
	}

}

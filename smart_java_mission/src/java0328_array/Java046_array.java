package java0328_array;

public class Java046_array {

	public static void main(String[] args) {

		int[][] num = { 
				{ 1, 2, 3, 4, 5 }, 
				{ 6, 7, 8, 9, 10 }, 
				{ 11, 12, 13, 14, 15 }, 
				{ 16, 17, 18, 19, 20 } };

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				//num[i][j]의 요소가 3의 배수이면
				if (num[i][j] % 3 == 0) {
					System.out.printf("%4c", '*');
				} else {
					System.out.printf("%4d", num[i][j]);
				}
			}
			System.out.println();
		}

	}// end main()

}// end class

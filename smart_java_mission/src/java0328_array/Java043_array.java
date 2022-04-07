package java0328_array;

public class Java043_array {

	public static void main(String[] args) {
		
		//2차원 배열
		
		//3행 2열의 2차원배열
		int[][] num = new int[3][2];
		
		
		
		System.out.println("==============================");
		// 배열명.length : 행의 크기
		// 배열명[인덱스].length : 인덱스에 해당하는 열의 크기
		int value = 1;
		for(int row = 0; row<num.length; row++) {
			for(int col = 0; col<num[row].length; col++) {
				num[row][col] = value++;
				System.out.printf("%4d", num[row][col]);
			}
			System.out.println();
		}
		System.out.println("=====================================");
		
//		for(int col = 0; col<num[0].length; col++) {
//			for(int row = 0; row<num.length; row++) {
//				System.out.printf("%4d", num[row][col]);
//			}
//			System.out.println();
//		}
		
		for(int col = 0; col<2; col++) {
			for(int row = 0; row<3; row++) {
				System.out.printf("%4d", num[row][col]);
			}
			System.out.println();
		}
	} // end main()

} // end class

package java0328_array;

/*
 * [데이터]
 * 홍길동 90 85 40
 * 이영희 100 35 75
 */
public class Java045_array {

	public static void main(String[] args) {
		String[] name = new String[] {"홍길동", "이영희"};
		int[][] jumsu = new int[][] {{90, 85, 40}, {100, 35, 75}};
		
		// 점수 합계, 평균
		int hap;
		double avg;
		for(int row = 0; row<name.length; row++) {
			hap = 0;
			avg = 0;
			System.out.printf("%8s", name[row]);
			for(int col = 0; col<jumsu[row].length; col++) {
				System.out.printf("%4d", jumsu[row][col]);
				hap += jumsu[row][col];
			}
			avg = (double)(hap)/jumsu[row].length;
			//System.out.printf("%4d %.1f\n",hap, avg);
			System.out.printf("%4d", hap);
			System.out.printf("%6.1f\n", avg);
		}
	}// end main()

}// end class

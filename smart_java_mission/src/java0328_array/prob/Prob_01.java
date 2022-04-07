package java0328_array.prob;

/*
 * num배열에서 최대값을 출력하는 프로그램을 구현하시오.
 * [출력결과]
 * 최대값:95
 */

public class Prob_01 {
	public static void main(String[] args) {

		int[] num = { 94, 85, 90, 88, 95 };
		
		//여기를 구현하세요.
		int max = 0;
		
		for(int i=0; i<num.length; i++) {
			if(max < num[i]) {
				max = num[i];
			}
		}
		System.out.println(max);
		System.out.println("=======================");
		
		
		for(int i=0; i<num.length; i++) {
			if(i+1 != num.length) {
				if(num[i]>num[i+1]) {
					System.out.println(num[i]);
				}else {
					System.out.println(num[i+1]);
				}
			}
		}
		

	}// end main()

}// end class

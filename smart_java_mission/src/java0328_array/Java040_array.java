package java0328_array;

/*
 * [출력결과]
 * 홀수 : 3
 * 짝수 : 42
 */
public class Java040_array {

	public static void main(String[] args) {
		int[] num = new int[] {22, 3, 8, 12};
		int odd = 0;
		int even = 0;
		
		for(int i = 0; i<num.length; i++) {
			//int a = num[i];
			if(num[i] % 2 == 0) {
				even += num[i];
			}
			else {
				odd += num[i];
			}
		}
		
		System.out.printf("홀수 : %d\n", odd);
		System.out.printf("짝수 : %d\n", even);
		

	}

}

package java0328_array;

/*
 * data배열에서 대문자의 개수를 출력하는 프로그램을 구현
 * 
 * [출력결과]
 * 대문자 개수: 2
 * 
 */

public class Java042_array {

	public static void main(String[] args) {
		char[] data = new char[] {'a', 'b', 'F', 'R', 'a'};
		int cnt = 0; // 대문자의 개수
		
		
		
		for(int i = 0; i<data.length; i++) {
			if(Character.isUpperCase(data[i])) {
				cnt += 1;
			}
//			if(data[i] >='A' && data[i] <= 'Z') {
//				cnt += 1;
//			}
		}
		
		System.out.printf("대문자 개수: %d", cnt);
		
	}// end main()

}// end class

package java0329_method;

/*
 * [출력결과]
 * a의 대문자는 A입니다.
 */
public class Java058_method {

	public static void main(String[] args) {
		// 조건 data 변수에는 소문자만 입력
		char data = 'a';
		char code = process(data);
		System.out.println(code);
	} // end main()
	
	private static char process(char data) {
		// 1. 대문자 A, 소문자 a의 유니코드
		// 2. 대문자와 소문자차이
		// 3. int자료형 이하의 자료형끼리 계산한 결과는 int
		if(Character.isLowerCase(data)) {
			data += 'A' - 'a';
		}
		return data;
	}

}// end class

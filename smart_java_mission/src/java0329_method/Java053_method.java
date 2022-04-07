package java0329_method;

/*
 * [출력결과]
 * 홍길동님은 회원입니다.
 * 3000포인트가 적립되었습니다.
 */

public class Java053_method {

	public static void main(String[] args) { // 1
		process("홍길동", true); // 2 메소드 호출시 값을 보내주는걸 argument(인자, 인수)
		test(3000); // 7
		
	}// end main() // 11
	
	
	// 회원여부 process()
	private static void process(String name, boolean chk) { // 3값을 받는 변수 parameter(매개변수)
		if(chk) {// 4
			System.out.println(name +"님은 회원입니다."); // 5
		}
		else {
			System.out.println(name +"님은 비회원입니다.");
		}
	} // 6
	
	
	// 포인트 적립 test()
	private static void test(int point) { // 8
		System.out.println(point +"포인트가 적립되었습니다."); // 9
	} // 10
	
}// end class

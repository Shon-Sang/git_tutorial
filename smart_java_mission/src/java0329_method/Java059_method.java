package java0329_method;
/*
 * 입력한 수에 대해 짝수 홀수 출력
 */
public class Java059_method {

	public static void main(String[] args) {

		int data = 10;
		if(process(data)) {
			System.out.println(data + "는 짝수입니다.");
		}else {
			System.out.println(data + "는 홀수입니다.");
		}
		
		String result = process(data) ? "짝수" : "홀수";
		
		//------------------

		
		
	} // end main()
	
	public static boolean process(int data) {
		if(data %2 == 0) { // 짝수
			return true;
		}
		else {
			return false;
		}
	}

	public static void abc(String a, String b) {
		String temp;
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
} // enc class

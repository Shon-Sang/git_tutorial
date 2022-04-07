package java0329_method;

public class Java055_method {

	public static void main(String[] args) {
		int a = 4, b = 2, c = 5;
		int[] num = new int[] {2,3};
		int[] data = {2,6,2,3};
		System.out.println(process(a,b,c));
		System.out.println(plus(num));
		System.out.println(plus(data));
	} // end main()

	
	private static int process(int x, int y, int z) { // 실제 저장되어있는 값을 받음
		return x+y+z;
	}
	
	private static int plus(int[] arr) { // (참조데이터타입) 메모리 주소를 받음
		int sum = 0;
		for(int a: arr) {
			sum += a;
		}
		return sum;
	}
} // end class

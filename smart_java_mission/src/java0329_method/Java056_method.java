package java0329_method;

public class Java056_method {

	public static void main(String[] args) {
		int a = 10, b = 20;
		int c = a, d = b;// 값 복사 (call by value) 값에 의한 호출
		
		int temp = c;
		c = d;
		d = temp;
		
		System.out.printf("a=%d, b=%d\n", a, b);
		System.out.printf("c=%d, d=%d\n", c, d);
		
		System.out.println("///////////////////////");
		int[] num = {10,20};
		int[] arr = num; // 주소 복사(call by reference)주소 복사
		// arr 0번째 값과 arr 1번째 값을 교환
		int imsi = arr[0];
		arr[0] = arr[1];
		arr[1] = imsi;
		
		System.out.println(num[0] +" " + num[1]);
		System.out.println(arr[0] +" " +arr[1]);
	} // end()

} // end class

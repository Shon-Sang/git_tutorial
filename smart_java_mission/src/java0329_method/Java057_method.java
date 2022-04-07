package java0329_method;
/*
 * 자바에서 제공하는 데이터 타입(data type)
 * 1. primitive type : byte, char long, int , double...
 * 2. reference type : array, class, interface
 * 
 * [argument 전달 방식]
 * 1. call by value : 값에 의한 복사
 * 	argument 전달할때 primitive data type을 넘겨주는 형식
 * 	장점 : 복사하여 처리하기 때문에 원래값의 값이 보존되어 안전하다
 * 	단점 : 복사를 하기때문에 메모리 사용량이 늘어난다.
 * 
 * 
 * 2. call by reference : 주소에 의한 복사
 * 	argument 전달할때 reference data type을 넘겨주는 형식
 *  장점 : 참조를 하기때문에 메모리를 절약한다.
 *  단점 : 참조를 하기때문에 원래 값에 영향을 준다.
 */
public class Java057_method {

	public static void main(String[] args) {
		int a = 10, b = 20;
		callByValue(a, b);
		System.out.printf("a = %d, b = %d\n", a, b);
		
		int[] num = {10,20};
		callByReference(num);
		System.out.printf("num[0] = %d,"
				+ " num[1] = %d",num[0], num[1]);
	}
	
	private static void callByReference(int[] arr) {
		int imsi;
		imsi = arr[0];
		arr[0] = arr[1];
		arr[1] = imsi;
		
		System.out.printf("arr[0] = %d,"
				+ " arr[1] = %d\n",arr[0], arr[1]);
		
	}
	
	
	private static void callByValue(int c, int d) {
		int temp = c;
		c = d;
		d = temp;
		System.out.printf("c = %d, d = %d\n", c ,d);
	}
}

package java0328_array;

/* 변수: 하나의 값을 저장하기 위한 메모리 공간
 * 배열: 서로 관련이 있는 데이터 타입(자료형이 같은) 데이터들의 집합
 */

public class Java037_array {

	public static void main(String[] args) {
		
		// 이런 데이터들은 스택영역에 생성
		int ko = 90;
		int en = 80;
		int jp = 40;
		
		// 참조 데이터들은 jvm의 메모리 구조 중 heap영역에 생성
		
		int[] arr; // 배열 선언
		
		// new 키워드를 이용해서 배열을 생성(참조 데이터 타입을 가지고 메모리 확보할 때 new사용)
		// 각 요소(원소, element)마다 인덱스가 0부터 생성된다.
		arr = new int[3]; // 배열 생성(메모리 확보) 메모리주소를 저장하는 변수(무조건 4바이트)
		
		// int[] arr = new int[3]; // 선언,생성 동시에
		arr[0] = 90;
		arr[1] = 80; 
		arr[2] = 40;
		
		System.out.println(arr[0]);
		
		//배열의 크기를 벗어난 인덱스를 호출하면 Exception이 발생
		//System.out.println(arr[3]);
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
	} // end main()

} // end class()

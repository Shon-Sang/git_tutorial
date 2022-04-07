package java0328_array;

public class Java038_array {

	public static void main(String[] args) {
		// 초기값을 할당하면서 배열생성
		int[] jumsu = new int[] {90, 80, 40};
		for(int i = 0; i < jumsu.length;i++) {
			System.out.printf("jumsu[%d]=%d\n", i, jumsu[i]);
		}
		System.out.println();
		
		
		for(int i = jumsu.length-1; i >= 0; i--) {
			System.out.printf("jumsu[%d]=%d\n", i, jumsu[i]);
		}
		
	}// end main()

}// end class

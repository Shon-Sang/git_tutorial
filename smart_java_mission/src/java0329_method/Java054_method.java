package java0329_method;

public class Java054_method {

	public static void main(String[] args) {// 1
		int year = 2013;// 2
		boolean result = isLeapYear(year);// 3// 9
		if(result) { // 10
			System.out.printf("%d년은 윤년입니다.", year);
		}else { // 11
			System.out.printf("%d년은 평년입니다.", year); // 12
		} // 13
		
	} // end main() // 14

	private static boolean isLeapYear(int year) { // 4
		
		if(year%4 == 0 && year%100 != 0 || year%400 == 0) {// 5
			return true;
		}
		else {
			return false; // 6
		} // 7
		
	} // 8
} // end class

package java0329_method;
/*
 * [출력결과]
 * java test
 * tset vavj
 * 
 */
public class Java063_method {

	public static void main(String[] args) {
		char[] arr = {'j','a','v','a',' ','t','e','s','t'};
		System.out.println(arr);
		System.out.println(reverse(arr));
		System.out.println(arr);
		
		
	}// end main()
	
	public static char[] reverse(char[] data) {
		char[] result;
		result = new char[data.length];
		int j = 0;
		for(int i = data.length-1; i>=0; i--) {
			result[j] = data[i];
			j += 1;
		}
		return result;
	}/// end reverse()
	
	public static char[] reverse2(char[] data) {
		char[] data_clone = new char[data.length];
		char[] result;
		for(int i = 0; i<data.length; i++) {
			data_clone[i] = data[i];
		}
		int k = 0;
		for(int j = data.length-1; j>=0; j--) {
			data[k] = data_clone[j];
			k+=1;
		}
		result = data;
		return result;
	}
}// end class

package java0328_array;

public class Java041_array {

	public static void main(String[] args) {
		int[] data1 = new int[3]; // int형은 기본값 0 %d
		long[] data2 = new long[3]; // 0L  0이 long 형인걸 알려주는 것일 뿐 %d
		float[] data3 = new float[3]; // 0.0f %f
		double[] data4 = new double[3]; // 0.0 %f
		char[] data5 = new char[3]; // \u0000 유니코드 0 %c
		boolean[] data6 = new boolean[3]; // false %b
		String[] data7 = new String[3]; // null %s
		
		
		for(int i = 0; i<data5.length; i++) {
			System.out.printf("data[%d] = %s\n", i, data7[i]);
		}
		
		System.out.println("=======================================");
		char a = ' ';
		char b = '\u0020'; // 공백
		char c = '\u0000';
		char d = 0; // 숫자 
		char e = 48;
		System.out.println(a==b);
		System.out.println(c==d);
		System.out.println(e);
	}// end main()

}// end class

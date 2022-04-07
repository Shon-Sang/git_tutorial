package java0328_array;
/*
 *  {{ 1, 2, 3, 4, 5 }, 
	{ 6, 7, 8, 9, 10 }, 
	{ 11, 12, 13, 14, 15 }, 
	{ 16, 17, 18, 19, 20 } };
	[출력결과]
	2번째줄 4번째줄은 -로 뜨게
 */
public class Java047_array {

	public static void main(String[] args) {
		int[][] num = {
				{ 1, 2, 3, 4, 5 }, 
				{ 6, 7, 8, 9, 10 }, 
				{ 11, 12, 13, 14, 15 }, 
				{ 16, 17, 18, 19, 20 } };
		
		for(int i = 0; i<num.length; i++) {
			for(int j = 0; j<num[i].length; j++) {
				if(i%2 == 1) {
					System.out.printf("%4c", '-');
				}
				else {
					System.out.printf("%4d", num[i][j]);
				}
			}
			System.out.println();
		}

	}

}

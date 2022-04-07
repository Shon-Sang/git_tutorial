package java0328_array;

/*
 * [출력결과]
 * * a b c d
 * a * b c d
 * a b * c d
 * a b c * d
 * a b c d *
 */
public class Java049_array {

	public static void main(String[] args) {
		char[][] alpa = {
				{'a','b','c','d'},{'a','b','c','d'},
				{'a','b','c','d'},{'a','b','c','d'}};
		
		for(int i = 0; i<alpa.length; i++) {
			for(int j = 0; j<alpa[i].length; j++) {
				if(i==j) {
					System.out.printf("%4c",'*');
				}
				
				System.out.printf("%4c",alpa[i][j]);
				
			}
			System.out.println();
			
			if(i == alpa.length - 1) { // 제일마지막에 한번더
				for(int k = 0; k<alpa[i].length; k++) {
					System.out.printf("%4c",alpa[i][k]);
				}
				System.out.printf("%4c",'*');
				System.out.println();
			}
		}
		
		System.out.println();
		
		boolean check = false;
		
		for(int i = 0; i<alpa.length + 1; i++) {
			for(int j = 0; j<alpa[0].length + 1; j++) {
				if(i==j) {
					System.out.printf("%4c",'*');
					check = true;
					continue;
				}
				
				if(check) {
					// 어차피 col 인덱스 맨마지막이라 row인덱스 초과경우를 안 정의해도됨
					System.out.printf("%4c",alpa[i][j-1]);
				}else {
					if(i == alpa.length) { // row 인덱스 초과일 경우
						System.out.printf("%4c",alpa[i-1][j]);
					}else {
						System.out.printf("%4c",alpa[i][j]);
					}
				}
				
			}
			System.out.println();
			check = false;
		}
		
		
	}// end main()

}// end class

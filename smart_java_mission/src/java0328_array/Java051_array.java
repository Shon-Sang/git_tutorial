package java0328_array;

public class Java051_array {

	public static void main(String[] args) {
		char[][] eng = new char[][] {
			{'r','e','d'},
			{'g','r','e','e','n'},
			{'p','i','n','k'}};
			
		for(int i = 0; i<eng.length; i++) {
			for(int j = 0; j<eng[i].length; j++) {
				System.out.printf("%c",eng[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("===============================");
		for(int i = 0; i<eng.length; i++) {
			System.out.println(eng[i]); // + ! 이런거 하면 값이 아닌 주소가 뜸
			
		}
	}

}

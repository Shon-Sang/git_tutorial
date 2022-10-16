package mylotto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LottoMain02 {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static String end;
	public static void main(String[] args) throws IOException, InterruptedException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String end;
		Lotto02 lotto02 = new Lotto02(br.readLine());
		
		menu01(lotto02);
		menu02(lotto02);
		
//		while(!(end = br.readLine()).equals("end")) {
//			for(int i = 0 ; i<5; i++) {
//				System.out.println(lotto02.LottoMakerNoLastWeek());
//			}
//		}
//		
//		while(!(end = br.readLine()).equals("end")) {
//			for(int i = 0 ; i<5; i++) {
//				System.out.println(lotto02.LottoMakerFree());
//			}
//		}
		
		System.out.println("프로그램 종료");
	}
	
	public static void menu01(Lotto02 lotto02) throws IOException, InterruptedException {
		while(!(end = br.readLine()).equals("end")) {
			for(int i = 0 ; i<5; i++) {
				System.out.println(lotto02.LottoMakerNoLastWeek());
			}
		}
	}
	
	public static void menu02(Lotto02 lotto02) throws IOException {
		while(!(end = br.readLine()).equals("end")) {
			for(int i = 0 ; i<5; i++) {
				System.out.println(lotto02.LottoMakerFree());
			}
		}
	}

}

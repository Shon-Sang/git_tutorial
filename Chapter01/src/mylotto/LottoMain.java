package mylotto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.TreeSet;


public class LottoMain {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk;
		int lottoNumberNum = 10; // 얻고자 하는 번호들의 개수
		ArrayList<Integer> exceptNumber = new ArrayList<Integer>();
		Integer[] exceptArr;
		String input;
		Random random = new Random();
		TreeSet<Integer> tSet = new TreeSet<Integer>();
		int lottoNumber;
		boolean flag;
		
//		System.out.println("제외하고픈 숫자들을 입력후 s를 입력해주세요.");
//		while(!(input=br.readLine()).equals("s")) {
//			exceptNumber.add(Integer.parseInt(input));
//		}
		
		while(true) {
			System.out.println("제외하고픈 숫자들을 입력후 엔터를 눌러주세요.");
			stk = new StringTokenizer(br.readLine());
			while(stk.hasMoreTokens()) {
				exceptNumber.add(Integer.parseInt(stk.nextToken()));
			}
			exceptArr = (Integer[]) exceptNumber.toArray(new Integer[0]);
			
			for(int i=0; i<lottoNumberNum; i++) {
				while(tSet.size() != 6) {
					flag = false;
					lottoNumber = random.nextInt(45) + 1;
					for(Integer exNum : exceptArr) {
						if(exNum == lottoNumber) {
							flag = true;
							break;
						}
					}
					if(flag) {
						continue;
					}
					tSet.add(lottoNumber);
				}
				for(Integer num: tSet) {
					System.out.print(num + " ");
				}
				System.out.println();
				tSet.clear(); // 초기화 해줘야함
			}
			System.out.println();
		}
	}
	

}

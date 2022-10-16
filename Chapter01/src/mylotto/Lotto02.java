package mylotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

public class Lotto02 {

	private String BackLottoStr;
	private String NowLottoStr;
	private int buf;
	private Random random = new Random();
	
	public Lotto02(String BackLottoStr) { // "1 2 3 4 5 6" // 이런식으로(저번주 숫자)
		this.BackLottoStr = BackLottoStr;
	}
	
	public Lotto02() {
		
	}
	
	public String LottoMakerFree() {
		Set<Integer> set = new TreeSet<Integer>();
		while(set.size() != 6) {
			buf = random.nextInt(45) + 1;
			set.add(buf);
		}
		
		NowLottoStr = setNumberToStr(set);
		return NowLottoStr;
	}
	
	public String LottoMakerNoLastWeek() throws InterruptedException {
		Set<Integer> set = new TreeSet<Integer>();
		String[] backLottoStrArr = BackLottoStr.split(" ");
		Integer[] backLottoInt = new Integer[6];
		
		boolean flag;
		
		for(int i = 0; i<backLottoStrArr.length; i++) {
			backLottoInt[i] = Integer.parseInt(backLottoStrArr[i]);
		}
		
		while(set.size() != 6) {
			flag = false;
			TimeUnit.MILLISECONDS.sleep(17);
			buf = random.nextInt(45) + 1;
			for(int backLottoNumber : backLottoInt) {
				if(buf == backLottoNumber) { // 중복 확인
					flag = true;
					break;
				}
			}
			
			if(flag) {
				continue;
			}
			
			set.add(buf);
		}
		NowLottoStr = setNumberToStr(set);
		return NowLottoStr;
	}
	
	public String setNumberToStr(Set<Integer> set) {
		List<Integer> list = new ArrayList<Integer>(set);
		StringBuffer sb = new StringBuffer();
		for(Integer number : list) {
			sb.append(number);
			sb.append(" ");
		}
		sb.deleteCharAt(sb.length() - 1);
		
		return sb.toString();
	}
}

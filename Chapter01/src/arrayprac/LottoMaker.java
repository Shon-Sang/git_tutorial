package arrayprac;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Random;

public class LottoMaker {
	
	private int number;
	private HashSet<Integer> setLotto = new HashSet<>();
	private ArrayList<Integer> listLotto;
	
	public LottoMaker(int num) {
		this.number = num;
	}
	
	public void makeLotto() {
		Random random = new Random();
		
		
		while(!(setLotto.contains(45))) {
			
			if(!(setLotto.isEmpty())) {
				setLotto.clear();
				//setLotto = new HashSet<>();
				//setLotto.removeAll(setLotto);
			}
			
			while(setLotto.size() < this.number) {
				setLotto.add(random.nextInt(45) + 1);
			}
		}
		listLotto = new ArrayList<>(setLotto);
		listLotto.sort(Comparator.naturalOrder());
	}
	
	public void viewLotto() {
		for( Integer num: listLotto) {
			System.out.printf("%d ", num);
		}
	}
}

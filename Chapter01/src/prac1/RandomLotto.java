package prac1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class RandomLotto {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Random ran = new Random();
		TreeSet<Integer> lotto = new TreeSet<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("몇 개의 번호를 원하시나요.");
		int count = Integer.parseInt(br.readLine());
		
		for(int i = 0; i<count; i++) {
			while(lotto.size()<7) {
				lotto.add(ran.nextInt(45) + 1);
			}
			
			Iterator<Integer> it = lotto.iterator();
			while(it.hasNext()) {
				System.out.printf("%d ", it.next());
			}
			System.out.println();
			lotto.clear();
		}
		
//		System.out.println();
//		for(Integer i : lotto) {
//			System.out.printf("%d ", i);
//		}
	}

}

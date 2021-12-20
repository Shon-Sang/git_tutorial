package gitPractice;

import java.util.Random;

public class LottoMaker01 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		int number;
		int[] numberArray = new int[6];
		boolean flag = true;
		int temp = 0;
		
		for(int i = 0; i < numberArray.length; i++) {
			numberArray[i] = rd.nextInt(45) + 1;
			
			for(int j = 0; j<i; j++) { // 중복
				if(numberArray[j]==numberArray[i]) {
					i--;
					flag = false;
					break;
				}
				if(j == i-1) {
					flag = true;
				}
			}
			
			
			if(flag) { // 정렬				
				for(int q = 0; q<i; q++) {
					if(numberArray[i]<numberArray[q]) {
						temp = numberArray[i];
						numberArray[i] = numberArray[q];
						numberArray[q] = temp;
					}					
				}
				
			}
		}
		
		for(int num : numberArray) {
			System.out.println(num);
		}
	}

}

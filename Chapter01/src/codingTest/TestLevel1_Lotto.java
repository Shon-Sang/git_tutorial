package codingTest;

public class TestLevel1_Lotto {
	
	public int[] Solution(int[] lottos, int[] win_nums) {
		int[] answer = {0 ,0};
		int hitNum = 0;
		int zeroNum = 0;
		int[] big_small = {0,0};
		int[] result_ranking = {6, 6, 5, 4, 3, 2, 1};
		
		for(int a: lottos) { // 0이 있다면 추가
			for(int b: win_nums) {
				if(a == b) {
					hitNum += 1;
				}				
			}
			if(a == 0) {
				zeroNum += 1;
			}
		}
		
		big_small[0] = hitNum + zeroNum; // 최대한 많이 일치할 경우
		big_small[1] = hitNum; // 최대한 적게 일치할 경우
		
		for(int i = 0; i<big_small.length; i++) {
			answer[i] = result_ranking[big_small[i]];
		}
		
//		for(int i = 0; i<answer.length; i++) {
//			answer[i] = switchResult(big_small[i]);
//		}	
		return answer;
	}
	
	private int switchResult(int num) {
		int result = 0;
		
		switch(num) {
		case 0:
			result = 6;
			break;
		case 1:
			result = 6;
			break;
		case 2:
			result = 5;
			break;
		case 3:
			result = 4;
			break;
		case 4:
			result = 3;
			break;
		case 5:
			result = 2;
			break;
		case 6:
			result = 1;
			break;
		default:
			break;
		}
		
		return result;
	}
}

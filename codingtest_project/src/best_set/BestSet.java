package best_set;

public class BestSet {
	
	public BestSet() {
		
	}
	
	public int[] solution(int n, int s) {
        int[] answer;
        // s 나누기 n 의 몫이 0인지 판단
        int mok = s/n;
        
        if(mok == 0) {
        	answer = new int[1];
        	answer[0] = -1;
        }else {
        	answer = new int[n];
        	int remainder = s%n;
        	
        	for(int i = 0; i < answer.length; i++) {
        		answer[i] = mok;
        	}
        	
        	if(remainder != 0) {
	        	for(int i = answer.length-1; remainder > 0; i--) {
	        		answer[i] += 1;
	        		remainder -= 1;
	        	}
        	}
        }
        return answer;
    }
}

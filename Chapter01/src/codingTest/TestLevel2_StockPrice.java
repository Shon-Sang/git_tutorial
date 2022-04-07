package codingTest;

public class TestLevel2_StockPrice {
	public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        for(int i = 0 ; i<prices.length; i++) {
        	int cnt = 0;
        	for(int j = i+1; j <prices.length; j++) {
        		cnt += 1;
        		int now = prices[i];
        		int next = prices[j];
        		if(now > next) { // 가격이 떨어졌다는건 다음에 나오는게 처음값보다 작다는것
        			break;
        		}
        	}
        	answer[i] = cnt;
        }
        
        return answer;
    }
}

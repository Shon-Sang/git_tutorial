package codingTest;

public class TestLevel2_NextBigNumber {
	
	public int solution(int n) {
        int answer = 0;
        int num = binaryonemaker(n);
        int compValue = n + 1;
        while(num != binaryonemaker(compValue)) {
        	compValue += 1;
        }
        answer = compValue;
        return answer;
    }
	
	public int binaryonemaker(int n) {
		
		int mok = n;
		int remain;
		int cnt = 0;
		while(mok != 0) {
			remain = mok%2;
			if(remain == 1) {
				cnt += 1;
			}
			mok /= 2;
		}
		
		return cnt;
	}
}

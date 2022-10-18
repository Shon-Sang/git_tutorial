package fibonachi_number;

public class FibonachiNumber {
	
	public int solution(int n) {
        int answer = fibonachi(n);
		return answer % 1234567;
    }
	
	public int fibonachi(int n) {
		
		if(n == 0) {
			return 0;
		}else if(n == 1) {
			return 1;
		}
		
		return fibonachi(n - 1) + fibonachi(n - 2);
	}
	
	public int solution02(int n) {
		int answer = 0;
        int back1 = 0;
        int back2 = 1;
        
        if(n == 0) {
        	answer = 0;
        }else if(n == 1) {
        	answer = 1;
        }else {
        	for(int i = 2; i<=n; i++) {
        		answer = (back1 + back2) % 1234567;
        		back1 = back2;
        		back2 = answer;
        	}
        }
        
        return answer;
	}
	
	public int fibonachi02(int n) { // 주석 차이
		
		// 베이스 조건
		if(n == 0) {
			return 0;
		}else if(n == 1) {
			return 1;
		}
		
		// 분해 : n-1, n-2
		
		// 조합 : n = 2일 때, n = 4일 때 생각해보기
		// n = 2 일 경우 F(2) = F(1) + F(0) => 1 = 1 + 0
		// n = 4 일 경우 F(4) = F(3) + F(2) => 3 = 2 + 1
		
		// 점화식 : F(n) = F(n-1) + F(n-2)
		return fibonachi(n - 1) + fibonachi(n - 2);
	}
}

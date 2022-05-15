package codingTest;

public class TestLevel2_FibonacciNumber {
	public int solution(int n) {
        int answer = fibonacci(n) % 1234567;
        
        return answer;
    }
	
	public int fibonacci(int num) {
		if(num == 1) {
			return 1;
		}
		int resultNum = 0;
		int back = 1;
		int bback = 0;
		for(int i = 2, j = 0; i<=num; i++) {
			j = bback + back;
			bback = back;
			back = j;
			resultNum = j;
		}
		
		
		return resultNum;
	}
}

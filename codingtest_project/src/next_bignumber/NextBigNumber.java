package next_bignumber;

public class NextBigNumber {
	
	// 1. n을 1씩 늘린다
	// 2. n 2진수 변환 1의 개수와 늘린 n의 2진수 변환 1의 개수를 비교
	// 3. 2조건이 맞으면 answer = n 임
	public int solution(int n) {
        int answer = n + 1;
        
        while(getOneNumber(Integer.toBinaryString(n)) 
        		!= getOneNumber(Integer.toBinaryString(answer))) {
        	answer += 1;
        }
        
        return answer;
    }
	
	public int getOneNumber(String binary) {
		int num = 0;
		char[] binaryChar = binary.toCharArray();
		for(char c : binaryChar) {
			if(c == '1') {
				num += 1;
			}
		}
		return num;
	}
}

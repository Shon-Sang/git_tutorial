package codingTest;

import java.util.Arrays;

public class TestLevel2_HIndex {
	public int solution(int[] citations) {
        int answer = 0;
        int[] arr = citations.clone();
        
        Arrays.sort(arr); // 오름차순
        int max = 0;
        for(int i = 1; i<arr.length; i++) { // 1부터
        	int count = 0;
        	for(int j = 0; j<arr.length; j++) { // 배열개수
        		if(arr[j] >= i) { // 각 논문마다 인용된횟수가 1-2-3-4-5.. 이런식으로 비교해야함
        			count += 1;
        		}
        	}
        	
        	if(count >= i) {
        		max = i;
        	}
        	else {
        		break;
        	}
        }
        
        answer = max;
        
        return answer;
    }
}

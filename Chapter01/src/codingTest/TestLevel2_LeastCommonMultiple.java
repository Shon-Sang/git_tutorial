package codingTest;

import java.util.ArrayList;

public class TestLevel2_LeastCommonMultiple {
	public int solution(int[] arr) {
        int answer = 1;
        int max = arr[arr.length - 1];
        int[] matchArr = new int[arr.length];
        ArrayList<Integer> mutilList = new ArrayList<Integer>();
        int matchCnt = 0;
        
        
    	for(int i = 2; i<max/2; i++) {
    		for(int j = 0; j<arr.length; j++) {
    			if(arr[j]%i == 0) {
    				matchCnt += 1;
    				matchArr[j] = arr[j]/i;
    			}else {
    				matchArr[j] = arr[j];
    			}
    		}
    		
    		if(matchCnt > 1) { // 존재하는 약수임
    			mutilList.add(i);
    			i = 2;
    			arr = matchArr.clone(); // 이렇게안하면 결국둘이 같은값을 계속공유함
    			max = maxElement(arr);
    		}
    		matchCnt = 0;
    	}
    	
    	for(int ar: arr) {
    		answer = answer*ar;
    	}
        
    	for(int ml: mutilList) {
    		answer = answer*ml;
    	}
    	
        return answer;
    }
	
	public int maxElement(int[] arr) {
		int max = 0;
		for(int e : arr) {
			if(e>max) {
				max = e;
			}
		}
		return max;
	}
	
	
}

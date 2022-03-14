package codingTest;

public class TestLevel2_AntiMatch {
	
	public int solution(int n, int a, int b) // n은 전체수, a번참가자, b번 참가자
    {
        int answer = 0;
        
        int[] partArr = new int[n];
        int count = 1;
        boolean check = false;
        for(int i = 0; i<n; i++) {
        	if(i == (a - 1)) {
        		partArr[i] = a;
        	}
        	else if(i == (b - 1)) {
        		partArr[i] = b;
        	}
        	else {
        		partArr[i] = 0;
        	}
        }
        
        while(true) {
        	
        	int[] tempArr = new int[partArr.length / 2];
        	for(int i = 0; i<partArr.length; i++) {
        		if(i%2 == 1) {
        			
        			if((partArr[i-1] != 0) && (partArr[i] != 0)) {
        				check = true;
        				break;
        			}
        			else if(partArr[i-1] != 0) {
        				tempArr[i/2] = partArr[i-1];
        			}
        			else if(partArr[i] != 0) {
        				tempArr[i/2] = partArr[i];
        			}
        			else {
        				tempArr[i/2] = 0;
        			}
        		}
        	}
        	
        	if(check) {
        		break;
        	}
        	
        	partArr = tempArr;
        	count += 1;
        }
        
        answer = count;
        
        return answer;
    }

}

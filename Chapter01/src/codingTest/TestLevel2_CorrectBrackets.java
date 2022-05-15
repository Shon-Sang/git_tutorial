package codingTest;

public class TestLevel2_CorrectBrackets {
	 boolean solution(String s) {
	        boolean answer = true;
	        
	        int cnt = 0;
	        char c;
	        
	        for(int i = 0; i<s.length(); i++) {
	        	
	        	if(cnt == -1) {
	        		answer = false;
	        		return answer;
	        	}
	        	c = s.charAt(i);
	        	
	        	if(c == '(') {
	        		cnt += 1;
	        	}else {
	        		cnt -= 1;
	        	}
	        	
	        	
	        	if(i == s.length() - 1 && cnt != 0) {
	        		answer = false;
	        		return answer;
	        	}
	        	
	        }

	        return answer;
	    }
}

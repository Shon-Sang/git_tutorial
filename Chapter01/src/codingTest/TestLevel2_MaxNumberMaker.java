package codingTest;

public class TestLevel2_MaxNumberMaker {
	public String solution(String number, int k) {
        String answer = "";
        StringBuilder sb = new StringBuilder(number);
        
        int count = 0;
        boolean check = false;
        for(int j = 0; j<10; j++) {
	        for(int i = 0; i <= sb.length() - k; i++) {
	        	char num = sb.charAt(i);
	        	
	        	if((num - '0') == j) {
	        		sb.deleteCharAt(i);
	        		i -= 1;
	        		count += 1;
	        	}
	        	
	        	if(count == k) {
	        		check = true;
	        		break;
	        	}
	        }
	        if(check) {
	        	break;
	        }
        }
        answer = sb.toString();
        return answer;
    }
}

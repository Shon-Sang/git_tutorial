package codingTest;

public class TestLevel2_JadenCase {
	public String solution(String s) {
        String answer = "";
        String[] wordArr = s.split(" ");
        String[] resultArr = new String[wordArr.length];
        for(int i = 0; i<wordArr.length; i++) {
        	//String word = wordArr[i];
        	char[] word = wordArr[i].toCharArray();
        	for(int j = 0; j<word.length; j++) {
	        	char c = word[j];
	        	if(j == 0) {
	        		if(c < '0' || c > '9') {
		        		if(c <= 'z' && c >= 'a') {
		        			c -= 'a' - 'A';
		        			word[j] = c;
		        		}
		        	}
	        	}else {
	        		if(c <= 'Z' && c >= 'A') {
	        			c += 'a' - 'A';
	        			word[j] = c;
	        		}
	        	}
	        	
        	}
        	
        	resultArr[i] = String.valueOf(word); // charArray -> String
        	
        }
        StringBuilder sb = new StringBuilder();
        for(String str : resultArr) {
        	sb.append(str);
        	sb.append(" ");
        }
        sb.setLength(sb.length() - 1); // 맨마지막 공백 제거
        answer = sb.toString();
        return answer;
    }
}

package codingTest;

import java.util.Arrays;
import java.util.Comparator;

public class TestLevel2_MaxNumber {
	 public String solution(int[] numbers) {
	        String answer = "";
	        String[] strNum = new String[numbers.length];
	        StringBuilder sb = new StringBuilder();
	        
	        for(int i = 0; i<numbers.length; i++) {
	        	strNum[i] = Integer.toString(numbers[i]);
	        }
	        
	        Arrays.sort(strNum, new Comparator<String>() { // int형은 안됨;
	        	@Override
	        	public int compare(String o1, String o2) {
	        		
	        		sb.append(o1);
	        		sb.append(o2);
	        		int front = Integer.parseInt(sb.toString());
	        		sb.setLength(0);
	        		
	        		sb.append(o2);
	        		sb.append(o1);
	        		int back = Integer.parseInt(sb.toString());
	        		sb.setLength(0);
	        		
	        		return back - front;
	        		
//	        		// 내림차순
//	        		if(front > back) { // 자리 안바꿈
//	        			return -1;
//	        		}
//	        		else if(front == back) { // 그냥 넘어감
//	        			return 0;
//	        		}
//	        		else { // front < back 자리 바꿈
//	        			return 1;
//	        		}
	        		
	        	}
			});
	        
	        for(String s: strNum) {
	        	sb.append(s);
	        }
	        
	        answer = sb.toString();
	        
	        return answer;
	    }
}

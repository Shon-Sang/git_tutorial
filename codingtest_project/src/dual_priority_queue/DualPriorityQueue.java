package dual_priority_queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DualPriorityQueue {
	public int[] solution(String[] operations) {
		
        int[] answer = new int[2];
        String[] buf;
        int chk;
        List<Integer> aList = new ArrayList<Integer>(); 
        
        for(String str : operations) {
        	buf = str.split(" ");
        	
        	if(buf[0].equals("I")) {
        		aList.add(Integer.parseInt(buf[1]));
        		Collections.sort(aList); // 오름차순정렬
        	}else { // D 인 경우
        		if(!aList.isEmpty()) {
	        		chk = Integer.parseInt(buf[1]);
	        		if(chk == 1) {
	        			aList.remove(aList.size() - 1);
	        		}else {
	        			aList.remove(0);
	        		}
        		}
        	}
        }
        
        if(!aList.isEmpty()) {
        	answer[0] = aList.get(aList.size() - 1);
        	answer[1] = aList.get(0);
        }
        
        
        return answer;
    }
}

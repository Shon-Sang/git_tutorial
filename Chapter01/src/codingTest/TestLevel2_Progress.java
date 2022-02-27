package codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestLevel2_Progress {
	
	public int[] solution(int[] progresses, int[] speeds) {
        
        List<Integer> answerList = new ArrayList<>();
        boolean sameDay;
        int listIndex = -1;
        int[] inputProgress = progresses.clone();
        
        for(int i = 0; i<inputProgress.length; i++) {
        	sameDay = true;        	
        	while(inputProgress[i] < 100) { // 여기들어가는 순간 같은날이 아님
        		
        		for(int j = i; j<inputProgress.length; j++) {
        			inputProgress[j] += speeds[j];
        		}
        		sameDay = false;
        	}
        	
        	if(sameDay) { // 이미 progress가 초과해서 같은날임
        		answerList.set(listIndex, answerList.get(listIndex) + 1);
        	}
        	else {
        		answerList.add(1);
        		listIndex += 1;
        	}
        }
        
        int[] answer = new int[answerList.size()];
        int idx = 0;
        for(int n: answerList) {
        	answer[idx++] = n;
        }
//        String[] asdf = new String[10]; // int는 안됨;
//        ArrayList<String> prac = new ArrayList<>(Arrays.asList(asdf));
        
        return answer;
    }
	
	
}

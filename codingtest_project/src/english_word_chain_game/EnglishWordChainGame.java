package english_word_chain_game;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EnglishWordChainGame {
	public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        List<String> strList = new ArrayList<String>();
        strList.add(words[0]);
        String front;
        String now;
        int target = 0;
        
        for(int i = 1; i<words.length; i++) {
        	front = words[i - 1];
        	now = words[i];
        	if(front.charAt(front.length() - 1) != now.charAt(0) || strList.contains(now)) {
        		target = i + 1;
        		if(target % n == 0) {
        			// 0번 인덱스는 나머지
        			// 1번 인덱스는 몫
        			answer[0] = n;
        			answer[1] = target / n;
        		}else {
        			answer[0] = target % n;
        			answer[1] = target / n + 1;
        		}
        		break;
        	}
        	strList.add(now);
        }

        return answer;
    }
	
	public int[] solution02(int n, String[] words) {
        int[] answer = new int[2];
        Set<String> strSet = new HashSet<String>();
        strSet.add(words[0]);
        String front;
        String now;
        int target = 0;
        
        // 이 방법은 리스트로 검색하는 거와는 다르게 비교를 하기전에 먼저 set에 넣어서 중복을 확인해야함
        // 리스트는 마지막에 넣어야하는게 비교할때 전에 있던 리스트의 데이터들과 비교해야하기 때문
        for(int i = 1; i<words.length; i++) {
        	front = words[i - 1];
        	now = words[i];
        	strSet.add(now);
        	if(front.charAt(front.length() - 1) != now.charAt(0) || strSet.size() != i + 1) {
        		target = i + 1;
        		if(target % n == 0) {
        			// 0번 인덱스는 나머지
        			// 1번 인덱스는 몫
        			answer[0] = n;
        			answer[1] = target / n;
        		}else {
        			answer[0] = target % n;
        			answer[1] = target / n + 1;
        		}
        		return answer;
        	}
        }
        
        return answer;
    }
}

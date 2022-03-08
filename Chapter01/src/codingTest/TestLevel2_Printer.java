package codingTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestLevel2_Printer {
	public int solution(int[] priorities, int location) { // 로케이션은 실제배열인덱스 그대로, 최종 리턴은 몇번째 나오는지
        int answer = 0;
        char point = (char)(location + 'A');
        int count = 0;
        Map<Character, Integer> printerMap = new HashMap<Character, Integer>();
        List<Character> printerList = new ArrayList<Character>();
        
        for(int i = 0; i<priorities.length; i++) {
        	char ch = (char)(i + 'A');
        	printerMap.put(ch, priorities[i]);
        	printerList.add(ch);
        }
        
        while(true) {
        	
        	for(int i = 1; i<printerList.size(); i++) {
        		int front = printerMap.get(printerList.get(0));
        		int back = printerMap.get(printerList.get(i)); // 왜 int형변환 안하면 에러뜨는지 모르겠음;(Map뒤에 제네릭 안써서였음)
        		
        		if(front < back) { // front가 맨뒤로가고 back이 앞으로 와야함
        			char ch = printerList.get(0);
        			printerList.remove(0);
        			printerList.add(ch);
        			i = 0; // 여기 for문이 끝날때 +1을 하기때문
        		}
        	}
        	count += 1;
        	if(printerList.get(0) == point) {
        		break;
        	}
        	printerList.remove(0);
        }
        
        answer = count;
        return answer;
    }
}

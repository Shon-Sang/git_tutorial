package codingTest;
import java.util.ArrayList;
import java.util.Collections;

public class TestLevel2_Hot {
	

    public int solution(int[] scoville, int K) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        int temp = 0;
        int count = 0;
        
        for(int a : scoville) {
        	list.add(a);
        }
        Collections.sort(list); // 오름차순

        
        while((list.get(0) < K) && (list.size() >= 2)) { // list를 계속 업데이트할거임 0번값이 계속 바뀜
        	temp = list.get(0) + (list.get(1)*2);
        	list.set(1, temp);
        	list.remove(0);
        	Collections.sort(list);
        	count += 1;
        	
        	if((list.size() == 1) && (list.get(0) < K)) {
        		count = -1;
        	}
        }
        
        answer = count;
        
        return answer;
    }
}

package resue_boat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RescueBoat {
	public int solution(int[] people, int limit) {
        int answer = 0;
        List<Integer> peopleList = arrToList(people);
        int allowance = 0;
        int idx = 1;
        while(peopleList.size() != 0) {
        	allowance = limit - peopleList.get(0);
        	while(idx < peopleList.size()) {
        		if(allowance - peopleList.get(idx) >= 0) {
        			allowance -= peopleList.get(idx);
        			peopleList.remove(idx);
        			idx -= 1;
        		}
        		idx += 1;
        	}
        	idx = 1;
        	answer += 1;
        	peopleList.remove(0);
        }
        
        return answer;
    }
	
	public List<Integer> arrToList(int[] people){
		List<Integer> list = new ArrayList<Integer>();
		
		for(int e : people) {
			list.add(e);
		}
		
		return list;
	}
	
	public int solution02(int[] people, int limit) {
		int answer = 0;
		
		Arrays.sort(people); // 오름차순 정렬
		int idx = 0;
		int maxIdx = people.length - 1;
		while(maxIdx - idx >= 0) {
			if(people[idx] + people[maxIdx] <= limit) {
				idx += 1;
				maxIdx -= 1;
				answer += 1;
			}else {
				maxIdx -= 1;
				answer += 1;
			}
		}
		
		return answer;
	}
}

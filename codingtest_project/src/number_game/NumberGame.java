package number_game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberGame {
	
	public int solution(int[] A, int[] B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        List<Integer> bList = makeIntegerList(B);
        boolean chk = true;
        int b;
        
        for(int a: A) {
        	while(chk && (bList.size() != 0)) {
        		b = bList.get(0);
        		if(b > a) {
        			answer += 1;
        			chk = false;
        		}
        		bList.remove(0);
        	}
        	
        	if(bList.size() == 0) {
        		break;
        	}
        	chk = true;
        }
        
        return answer;
    }
	
	public List<Integer> makeIntegerList(int[] arr){
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int e : arr) {
			list.add(e);
		}
		
		return list;
	}
}

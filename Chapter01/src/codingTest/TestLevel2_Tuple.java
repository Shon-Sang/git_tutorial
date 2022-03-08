package codingTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestLevel2_Tuple {
	public int[] solution(String s) {
        int[] answer;
        ArrayList<int[]> tupleList = new ArrayList<int[]>();
        ArrayList<Integer> tempArray = new ArrayList<Integer>();
        int brCnt = 0;
        StringBuilder sb = new StringBuilder();
        String temp;
        
        
        for(int i = 0; i<s.length(); i++) { // 튜플형으로 생긴 문자열들을 배열형으로 바꿈
        	char c = s.charAt(i);
        	
        	if(c == '{') {
        		brCnt += 1;
        	}
        	else if(c == '}') {
        		brCnt -= 1;
        	}
        	
        	if(brCnt == 1) {
        		temp = sb.toString();
        		sb.setLength(0);
        		if(!temp.equals("")) {
	        		tempArray.add(Integer.parseInt(temp));
	        		tupleList.add(listToArray(tempArray));
	        		tempArray.clear();
        		}
        		
        	}
        	else if(brCnt == 2) {
        		
        		if(c>='0' && c<='9') {
        			sb.append(c);
        		}
        		else if(c==',') {
        			temp = sb.toString();
        			sb.setLength(0);
        			tempArray.add(Integer.parseInt(temp));
        		}
        		
        	}
        }
        
        // 중복제거해서 값 1개씩 빼내는 과정
        int[] result = new int[tupleList.size()];
        
        Collections.sort(tupleList, new Comparator<int[]>() {
        	@Override
        	public int compare(int[] o1, int[] o2) {
        		// TODO Auto-generated method stub
        		return o1.length - o2.length;
        	}
		}); // 배열길이 오름차순 정렬
        
        //첫값은 무조건 넣어야할듯
        result[0] = tupleList.get(0)[0];
        
        for(int i = 1; i<tupleList.size(); i++) { // 여기가 제일 힘들었음(차집합 논리)
        	
        	int[] arr = tupleList.get(i);
        	
        	for(int j = 0; j<arr.length; j++) {
        		boolean check = false;		
        		for(int k = 0; k<i; k++) {
        			if(result[k] == arr[j]) { // 한번이라도 같은게 있다면
        				check = true;
        				break;
        			}        			
        		}
        		if(!check) {
        			result[i] = arr[j];
        			break;
        		}
        	}
        }
        
        answer = result;
        
        return answer;
    }
	
	private int[] listToArray(ArrayList<Integer> list) {
		int[] result = new int[list.size()];
		
		for(int i = 0; i<list.size(); i++) {
			result[i] = list.get(i);
		}
		
		return result;
	}
}

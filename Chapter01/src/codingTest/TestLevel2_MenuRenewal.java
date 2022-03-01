package codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestLevel2_MenuRenewal {

	public String[] solution(String[] orders, int[] course) { // 처음에 문제 잘못이해하고 풀어서 중간에 다시 수정함
        String[] answer;
        List<String> resultList = new ArrayList<String>();
        
//        Arrays.sort(orders, new Comparator<String>() {
//        	@Override
//        	public int compare(String o1, String o2) {
//        		return o1.length() - o2.length();
//        	}
//		}); // 문자열 개수로 오름차순 정렬
        
        for(int num: course) {
        	
        	for(int i = 0; i<orders.length; i++) { // 안의 문자열 모두 순회
        		
        		for(int j = i + 1; j<orders.length; j++) { //자기자신빼고 비교해야함 여기서 최소 2개이상 조건이 만족됨
        			String result;
    				result = mycontains(orders[j], orders[i]);
    				
    				if(result.length() == num) {
    					if(!resultList.contains(result)) { // 포함하고 있지 않으면 추가함 **굿
    						char[] chArr = result.toCharArray();
    						Arrays.sort(chArr);
    						result = String.valueOf(chArr); // char 배열 => string
    						resultList.add(result);
    					}
    				}
    					
    				
    			}
        		
//        		if(num == orders[i].length()) { // 내가원하는 개수와 메뉴개수 비교하는데 메뉴개수가 이하여야함
//        			for(int j = i + 1; j<orders.length; j++) { //자기자신빼고 비교해야함 여기서 최소 2개이상 조건이 만족됨
//        				if(mycontains(orders[j], orders[i])) { // 여기서 break 하는이유: 몇번 겹쳤는지는 중요하지않음, 1번이라도 겹치면ok
//        					resultList.add(orders[i]);
//        					break;
//        				}
////        				if(orders[j].contains(orders[i])) { // 여기서 break 하는이유: 몇번 겹쳤는지는 중요하지않음, 1번이라도 겹치면ok
////        					resultList.add(orders[i]);
////        					break;
////        				}
//        			}
//        		}
//        		else if(num > orders[i].length()){
//        			continue;
//        		}
//        		else {
//        			break;
//        		}

        	}
        }
        answer = resultList.toArray(new String[resultList.size()]); // String list->array
        Arrays.sort(answer);
        
        return answer;
    }
	
	private String mycontains(String s, String k) { // s: 비교할 대상, k: k가 있는지 s안을 비교
		String result;
		StringBuilder sb = new StringBuilder();
		String[] kArr = k.split(""); // 1글자씩 String으로 이거 쓰는이유: contains가 String을 비교하기때문 char는 안되는거같음
		
		for(String str: kArr) {
			if(s.contains(str)) {
				sb.append(str);
			}
		}
		
		result = sb.toString();
		
		return result;
	}
}

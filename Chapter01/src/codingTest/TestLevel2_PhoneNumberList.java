package codingTest;

import java.util.Arrays;
import java.util.Comparator;

public class TestLevel2_PhoneNumberList {
	
	public boolean solution(String[] phone_book) {
        boolean answer = true;
        String[] pb = phone_book.clone();
        
        //1. 문자열배열 길이 오름차순 정렬
        Arrays.sort(pb, new Comparator<String>() {
        	@Override
        	public int compare(String o1, String o2) {
        		// TODO Auto-generated method stub
        		return o1.length() - o2.length();
        	}
		});
        
        //2. 기준 문자열이 인수로 들어가서 있는지 확인(맨앞에)
        for(int i = 0; i < pb.length; i++) {
        	for(int j = i + 1; j <pb.length; j++) {
        		if(pb[j].indexOf(pb[i]) == 0) { // 
        			answer = false;
        			break;
        		}
        	}
        	if(!answer) {
        		break;
        	}
        }
        return answer;
    }
}

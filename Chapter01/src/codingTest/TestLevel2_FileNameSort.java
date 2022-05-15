package codingTest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class TestLevel2_FileNameSort {
	public String[] solution(String[] files) {
        String[] answer = {};
        
//        for(String s: files) {
//        	String[] forma = formatmaker(s);
//        	for(String k: forma) {
//        		System.out.print(k + " ");
//        	}
//        	System.out.println();
//        }
        Arrays.sort(files, new Comparator<String>() {
        	@Override
        	public int compare(String o1, String o2) {
        		String[] o1Data = formatmaker(o1);
        		String[] o2Data = formatmaker(o2);
        		
        		if(o1Data[0].equalsIgnoreCase(o2Data[0])) { // head가 같다면
        			int o1Int = Integer.parseInt(o1Data[1]);
        			int o2Int = Integer.parseInt(o2Data[1]);
        			if(o1Int > o2Int) { // 앞의 숫자가 더 클경우( 뒤로가야함)
        				return 1;
        			}else if(o1Int < o2Int) {
        				return -1;
        			}else {// 앞뒤 숫자가 같다면
        				return 0;
        			}
        			
        		}else { // head가 다르다면
        			if(o1Data[0].length() > o2Data[0].length()) { // 앞의 head 문자길이가 더 길경우
            			for(int i = 0; i<o2Data[0].length(); i++) {
            				if(o1Data[0].charAt(i) > o2Data[0].charAt(i)) { // 더크다라는건 더 뒤의 영문자라는것(앞이 더 클경우
            					return 1;
            				}else if(o1Data[0].charAt(i) < o2Data[0].charAt(i)) {
            					return -1;
            				}
            			}
            		}else{// 뒤의 head 문자길이가 더 길경우 + 두개길이가 같은경우
            			for(int i = 0; i< o1Data[0].length(); i++) {
            				if(o1Data[0].charAt(i) > o2Data[0].charAt(i)) { // 더크다라는건 더 뒤의 영문자라는것(앞이 더 클경우
            					return 1;
            				}else if(o1Data[0].charAt(i) < o2Data[0].charAt(i)) {
            					return -1;
            				}
            			}
            		}
        		}
        		
        		return 0;
        	}
		});
        answer = files;
        return answer;
    }
	
	public String[] formatmaker(String s) {
		String[] format = new String[3];
		StringBuffer sb = new StringBuffer();
		boolean check = false;
		char nowChar;
		char frontChar;
		int index = 0;
		
		for(int i = 0; i<s.length(); i++) { // 그전의 문자를 비교해서 초기화
			nowChar = s.charAt(i);
			if(i != 0) {
				frontChar = s.charAt(i - 1);
				if(nowChar>='0' && nowChar<='9') { // 현재 문자가 숫자일 때
					if(!(frontChar>='0' && frontChar<='9')) { // 전 문자가 숫자가 아닐때
						check = true;
					}
				}
				else { // 현재 문자가 숫자가 아닐때
					if(frontChar>='0' && frontChar<='9'){ // 전 문자가 숫자일 때
						check = true;
					}
				}
			}
			
			if(check) {
				format[index++] = sb.toString();
				sb.setLength(0);
				check = false;
			}
			sb.append(nowChar);
			
			if(i == s.length() - 1) { // 맨 마지막일때
				format[index] = sb.toString();
			}
		}
		
		return format;
	}
}

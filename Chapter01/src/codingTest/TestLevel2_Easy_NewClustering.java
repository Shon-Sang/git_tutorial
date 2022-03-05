package codingTest;

import java.util.ArrayList;
import java.util.Iterator;

public class TestLevel2_Easy_NewClustering {
	public int solution(String str1, String str2) {
		ArrayList<String> aSet;
		ArrayList<String> bSet;
		aSet = strlistmaker(str1);
		bSet = strlistmaker(str2);
		int intersectionNum = intersectionNumMaker(aSet, bSet);
		int unionNum = aSet.size() + bSet.size() - intersectionNum;
		float result = (float)(intersectionNum)/(float)(unionNum);
        int answer = (int)(result * 65536);
        
        return answer;
    }
	
	private ArrayList<String> strlistmaker(String s){
		ArrayList<String> result = new ArrayList<String>();
		String input = s;
		String tempstr;
		
		//input = input.toUpperCase(); //모두 대문자로 변환
		for(int i=0; i<input.length() - 1; i++) {
			boolean checkSpecial = false;
			tempstr = input.substring(i, i+2); 
			//여기에 if문 사용해서 특수문자 거르는 기능 넣어야함
			for(int j = 0; j<tempstr.length(); j++){
				char c = tempstr.charAt(j);
				if( !((c>='a'&& c<='z') || (c>='A'&& c<='Z'))) { // 특수문자 라면
					checkSpecial = true;
					break;
				}
			}
			
			if(!checkSpecial) { // 특수문자가 없다면
				result.add(tempstr);
			}
		}				
		return result;
	}
	
	private int intersectionNumMaker(ArrayList<String> a, ArrayList<String> b) { // 교집합 개수
		int result = 0;
		ArrayList<String> tempa = new ArrayList<String>();
		for(String s: a) {
			tempa.add(s);
		}
		
		Iterator<String> tempaIter = tempa.iterator();
		while(tempaIter.hasNext()) {
			String compStr = tempaIter.next();
			
			for(String s: b) {
				if(s.equalsIgnoreCase(compStr)) { // 중복을 허용하기때문에 같으면 바로 나와야함
					tempaIter.remove();
					result += 1;
					break;
				}
			}
		}				
		return result;
	}
	
}

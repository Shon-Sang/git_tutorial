package codingTest;

import java.util.ArrayList;

public class TestLevel2_RankingSearch {
	
	public int[] solution(String[] info, String[] query) {
        int[] answer = {};
        
        String[][] infoArr = new String[info.length][];
        for(int i = 0; i < info.length; i++) { // 인포 배열만듬(원소가 단어 1개가 되도록)
        	infoArr[i] = info[i].split(" ");
        	
        	for(String s: infoArr[i]) {
        		System.out.print(s + ",");
        	}
        	System.out.println();
        }
        
        
        System.out.println();
        String[][] queryArr = new String[query.length][];
        for(int i = 0; i < info.length; i++) { // 쿼리 배열만듬(원소가 단어 1개가 되도록) 맨 마지막원소를 따로 나눠야함
        	
        	String[] temp1 = query[i].split("and");
        	for(int k = 0; k<temp1.length; k++) {
        		temp1[k] = temp1[k].trim();
        	}
        	
        	String[] temp2 = temp1[temp1.length - 1].split(" ");
        	String[] temp3 = new String[temp1.length + temp2.length - 1];
        	
        	
        	for(int j = 0; j<temp3.length; j++) {
        		if(j >= temp3.length -2) {
        			temp3[j] = temp2[j - (temp3.length - 2)];
        		}
        		else {
        			temp3[j] = temp1[j];
        		}
        	}
        	queryArr[i] = temp3;
        }
        
        answer = searchRanking(infoArr, queryArr);
        
        
        return answer;
    }
	
	private int[] searchRanking(String[][] info, String[][] query) {
		int count = 0;
		ArrayList<Integer> resultList = new ArrayList<Integer>();
		for(int i = 0; i<query.length; i++) { // 쿼리 개수만큼
			
			for(int j = 0; j<info.length; j++) { // 인포 개수만큼
				boolean infoCheck = true;
				
				for(int k = 0; k<info[j].length; k++) { // 쿼리와 인포배열 원소의 문자열 수가 같음
					String queryStr = query[i][k];
					String infoStr = info[j][k];
					
					if(queryStr.equals("-")) {
						continue;
					}
					else if(k == info[j].length - 1) { // 숫자비교 숫자는 인덱스 마지막
						int queryScore = Integer.parseInt(queryStr);
						int infoScore = Integer.parseInt(infoStr);
						if(infoScore < queryScore) {
							infoCheck = false; // 어차피 마지막이라 break 안해도됨
						}
					}
					else if(!queryStr.equals(infoStr)) { // 같지 않다면
						infoCheck = false;
						break;
					}
				}
				
				if(infoCheck) {
					count += 1;
				}
				
			}
			resultList.add(count);
			count = 0;
		}
		
		int[] resultArr = new int[resultList.size()];
		
		for(int i = 0; i<resultArr.length; i++) {
			resultArr[i] = resultList.get(i);
		}
		
		return resultArr;
	}
}

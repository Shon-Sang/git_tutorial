package codingTest;

public class TestLevel2_Carpet {
	public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int[] yelWidth;
        int[] yelHeight;
        int arrLen = 0;
        // 약수의 개수를 알아야함 그래야 배열을 초기화할 수 있음;
        for(int i = 1; i*i<= yellow; i++) {
        	arrLen += 1;
        }
        
        yelWidth = new int[arrLen];
        yelHeight = new int[arrLen];
        
        int arrIndex = 0;
        int iter = 1;
        
        // 노란색의 가로, 세로 길이 구함
        while(arrIndex != arrLen) {
        	if(yellow % iter == 0) { // 약수라면
        		yelWidth[arrIndex] = yellow/iter;
        		yelHeight[arrIndex] = iter;
        		arrIndex += 1;
        	}
        	
        	iter += 1;
        }
        
        int area = yellow + brown;
        
        for(int i = 0; i<arrLen; i++) {
        	int compArea = (yelWidth[i]+2)*(yelHeight[i]+2);
        	if(area == compArea) {
        		answer[0] = yelWidth[i]+2;
        		answer[1] = yelHeight[i]+2;
        		break;
        	}
        }
        
        
        
        return answer;
    }
}

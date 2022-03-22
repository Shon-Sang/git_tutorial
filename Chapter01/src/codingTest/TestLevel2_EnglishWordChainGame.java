package codingTest;

import java.util.ArrayList;

public class TestLevel2_EnglishWordChainGame {
	public int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다. 
        System.out.println("Hello Java");
        int pNum;
        int wordNum;
        char now;
        char next;
        boolean check = true;
        ArrayList<String> wordList = new ArrayList<String>(); // 중복확인
        
        wordList.add(words[0]);
        for(int i = 0; i<words.length - 1; i++) {
        	now = words[i].charAt(words[i].length() - 1);
        	next = words[i+1].charAt(0);
        	pNum = (i+1)%n; // 사람번째수
        	wordNum = (i+1)/n; // 해당사람의 단어 번째수
        	if( (now != next) || (wordList.contains(words[i+1])) ) {
        		answer[0] = pNum + 1;
        		answer[1] = wordNum + 1;
        		check = false;
        		break;
        	}
        	wordList.add(words[i+1]);
        }
        
        if(check) {
        	answer[0] = 0;
        	answer[1] = 0;
        }
        
        return answer;
    }
}

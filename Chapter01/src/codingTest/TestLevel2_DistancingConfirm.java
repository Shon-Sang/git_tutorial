package codingTest;

import java.util.ArrayList;

public class TestLevel2_DistancingConfirm {
	public int[] solution(String[][] places) {
        int[] answer = new int[places.length];
        ArrayList<int[]> coordPList = new ArrayList<int[]>(); // 얘는 계속 초기화해서 쓸거임
        
        for(int i = 0; i<places.length; i++) { // 여긴 개수가 달라질수있음(몇번째 문자열배열인지)
        	char[][] board = new char[5][5];
        	
        	// board와 P좌표 리스트 생성
        	for(int j = 0; j<5; j++) { // 무조건 5개 (문자열배열안에 몇번째 문자열인지)
        		for(int k = 0; k<5; k++) { // 무조건 5개 (문자열의 몇번쨰 문자인지)
        			char c = places[i][j].charAt(k);
        			board[j][k] = c;
        			if(c == 'P') {
        				int[] coordP = {j,k}; // y,x
        				coordPList.add(coordP);
        			}
        			
        		}
        	}
        	// board 확인용
        	for(char[] charr: board) {
        		for(char ch: charr) {
        			System.out.print(ch);
        		}
        		System.out.println();
        	}
        	int resultCheck = 1;       	
        	answer[i] = complogic(coordPList, board, resultCheck);
        	System.out.println();
        	coordPList.clear();
        }
        
        return answer;
    }
	
	private boolean mentheton(int[] r, int[] c) {
		boolean check = true;
		int distance = Math.abs(r[0] - c[0]) + Math.abs(r[1] - c[1]);
		if(distance <= 2) {
			check = false;
		}
		
		return check;
	}
	
	
	
	private int complogic(ArrayList<int[]> coordPList, char[][] board, int num) {
		int check = num;
		
		// p좌표와 board를 이용해서 조건에 맞는지 확인 먼저 멘헤튼거리로 비교
    	for(int p = 0; p<coordPList.size() - 1; p++) {
    		for(int q = p+1; q<coordPList.size(); q++) {
    			int[] front = coordPList.get(p);
    			int[] back = coordPList.get(q);
    			if(mentheton(front, back)) { // 
    				continue;
    			}
    			else { // 멘헤튼 거리가 2이하일경우
    				// x좌표가 같은 경우
    				if(front[1] == back[1]) {
    					if(board[front[0] + 1][front[1]] == 'X' ) {
    						continue;
    					}
    					else {
    						check = 0;
    						break;
    					}
    				}
    				// y좌표가 같은 경우
    				else if(front[0] == back[0]) {
    					if(board[front[0]][front[1] + 1] == 'X' ) {
    						continue;
    					}
    					else {
    						check = 0;
    						break;
    					}
    				}
    				// 둘다 다른 경우 x좌표 비교, front가 back보다 작을때, 클때
    				else if(front[1] < back[1]) {
    					if(board[front[0]][front[1] + 1] == 'X' && 
    							board[front[0] + 1][front[1]] == 'X') {
    						continue;
    					}
    					else {
    						check = 0;
    						break;
    					}
    				}
    				else if(front[1] > back[1]) {
    					if(board[front[0]][front[1] - 1] == 'X' && 
    							board[front[0] + 1][front[1]] == 'X') {
    						continue;
    					}
    					else {
    						check = 0;
    						break;
    					}
    				}
    				// 그외 둘다 같은 경우 는 없음
    			}
    		}
    		if(check == 0) {
    			break;
    		}
    	}
		
		return check;
	}
}

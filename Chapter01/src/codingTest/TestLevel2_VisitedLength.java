package codingTest;

import java.util.ArrayList;

public class TestLevel2_VisitedLength {
	 public int solution(String dirs) {
	        int answer;
	        boolean[][] board = new boolean[11][11]; // 방문했으면 true, 안했으면 false
	        int[] pos = {5, 5}; // (y, x)
	        board[5][5] = true; // 맨처음 서있는곳은 방문했기때문
	        ArrayList<int[][]> lineList = new ArrayList<int[][]>();
	        
	        for(int i = 0; i<dirs.length(); i++) {
	        	char direct = dirs.charAt(i);
	        	int[][] line = new int[2][2];
	        	switch(direct) {
	        	case 'L':
	        		
	        		if(pos[1] == 0) {
	        			break;
	        		}
	        		line[0] = pos.clone();
	        		pos[1] -= 1;
	        		if(!board[pos[0]][pos[1]]) {
	        			board[pos[0]][pos[1]] = true;
	        			line[1] = pos.clone();
	        			if(myoverlapCheck(lineList, line)) {
	        				lineList.add(line);
	        			}
	        		}
	        		break;
	        		
	        	case 'R':
	        		
	        		if(pos[1] == board[0].length - 1) {
	        			break;
	        		}
	        		line[0] = pos.clone();
	        		pos[1] += 1;
	        		if(!board[pos[0]][pos[1]]) {
	        			board[pos[0]][pos[1]] = true;
	        			line[1] = pos.clone();
	        			if(myoverlapCheck(lineList, line)) {
	        				lineList.add(line);
	        			}
	        		}
	        		break;
	        	case 'U':
	        		if(pos[0] == 0) {
	        			break;
	        		}
	        		
	        		line[0] = pos.clone();
	        		pos[0] -= 1;
	        		if(!board[pos[0]][pos[1]]) {
	        			board[pos[0]][pos[1]] = true;
	        			line[1] = pos.clone();
	        			if(myoverlapCheck(lineList, line)) {
	        				lineList.add(line);
	        			}
	        		}
	        		break;
	        		
	        	case 'D':
	        		if(pos[0] == board.length - 1) {
	        			break;
	        		}
	        		line[0] = pos.clone();
	        		pos[0] += 1;
	        		if(!board[pos[0]][pos[1]]) {
	        			board[pos[0]][pos[1]] = true;
	        			line[1] = pos.clone();
	        			if(myoverlapCheck(lineList, line)) {
	        				lineList.add(line);
	        			}
	        		}
	        		break;
	        	default:
	        		break;
	        	}
	        }
	        
	        answer = lineList.size();
	        
	        return answer;
	    }
	 
	 public boolean myoverlapCheck(ArrayList<int[][]> list, int[][] inArr) {
		 // 중복이 없으면 true
		 // 중복이 있으면 false
		 if(list.size() == 0) {
			 return true;
		 }
		 
		 boolean chk1 = false;
		 boolean chk2 = false;
		 
		 for(int[][] arr: list) {
			 for(int i = 0; i<arr.length; i++) {
				 for(int j = 0; j<arr[0].length; j++) {
					 if(arr[i][j] != inArr[i][j]) { // 다른게 발견됨, 해당점은 중복하는 점이 아님
						 chk1 = true;
						 break;
					 }
				 }
				 if(chk1) {
					 break;
				 }
			 }
			 // 여기까지 다 돌고 오면 다 비교했는데 모두 같았다는 뜻 (해당 직선은 중복이라는뜻)
			 if(!chk1) {
				 return false;
			 }
			 chk1 = false;
			 
			 // 각점의 비교순서를 바꿔서 비교
			 for(int i = 0, k = arr.length - 1; i<arr.length; i++) {
				 for(int j = 0; j<arr[0].length; j++) {
					 if(arr[i][j] != inArr[k][j]) { // 다른게 발견됨, 해당점은 중복하는 점이 아님
						 chk2 = true;
						 break;
					 }
				 }
				 if(chk2) {
					 break;
				 }
				 k -= 1;
			 }
			 // 여기까지 다 돌고 오면 다 비교했는데 모두 같았다는 뜻(해당 직선은 중복이라는뜻)
			 if(!chk2) {
				 return false;
			 }
			 chk2 = false;
		 }
		 
		 return true; // 여기까지 왔다는건 모두 검사했는데 중복이 없다는뜻
	 }
	 
	 

}

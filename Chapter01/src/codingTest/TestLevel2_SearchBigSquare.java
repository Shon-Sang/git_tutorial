package codingTest;

public class TestLevel2_SearchBigSquare {
    public int solution(int [][]board)
    {
        int answer = 1234;
        // 직사각형일경우 정의
        int heightLength = board.length;
        int weightLength = board[0].length;
        
        if(heightLength > weightLength) {
        	for(int i = heightLength - 1; i>=0; i--) { // 최대 길이부터 1개씩줄여가며
            	for(int j = 0; j< heightLength - i; j++) { // 행좌표
            		for(int k = 0; k< weightLength - 1; k++) { // 열좌표
            			if(searchsq(board, j, k, i + 1)) {
            				answer = (i+1)*(i+1);
            				return answer;
            			}
            		}
            	}
            }
        }
        else if(heightLength < weightLength) {
	    	for(int i = weightLength - 1; i>=0; i--) { // 최대 길이부터 1개씩줄여가며
	        	for(int j = 0; j< heightLength - 1; j++) { // 행좌표
	        		for(int k = 0; k< weightLength - i; k++) { // 열좌표
	        			if(searchsq(board, j, k, i + 1)) {
	        				answer = (i+1)*(i+1);
	        				return answer;
	        			}
	        		}
	        	}
	        }
        }
        else {
          for(int i = heightLength - 1; i>=0; i--) { // 최대 길이부터 1개씩줄여가며
        	for(int j = 0; j< heightLength - i; j++) { // 행좌표
        		for(int k = 0; k< heightLength - i; k++) { // 열좌표
        			if(searchsq(board, j, k, i + 1)) {
        				answer = (i+1)*(i+1);
        				return answer;
        			}
        		}
        	}
        }
        }
        
//        for(int i = squreLength - 1; i>=0; i--) { // 최대 길이부터 1개씩줄여가며
//        	for(int j = 0; j< squreLength - i; j++) { // 행좌표
//        		for(int k = 0; k< squreLength - i; k++) { // 열좌표
//        			if(searchsq(board, j, k, i + 1)) {
//        				answer = (i+1)*(i+1);
//        				return answer;
//        			}
//        		}
//        	}
//        }

        return answer;
    }
    
    public boolean searchsq(int[][] board, int startY, int startX, int nowLength) {
    		
    	for(int i = startY; i<nowLength + startY; i++) {
    		for(int j = startX; j<nowLength + startX; j++) {
    			if(board[i][j] != 1) {
    				return false;
    			}
    		}
    	}
    	
    	return true;
    }
}

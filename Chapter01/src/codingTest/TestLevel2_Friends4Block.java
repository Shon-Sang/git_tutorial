package codingTest;

import java.util.ArrayList;

public class TestLevel2_Friends4Block {
	public int solution(int m, int n, String[] board) {
        int answer = 0;
        char[][] boardMap = new char[m][n];
        
        //보드 만들기
        for(int i = 0; i<m; i++) {
        	for(int j = 0; j<n; j++) {
        		char[] tempArr = board[i].toCharArray();
        		boardMap[i][j] = tempArr[j];
        	}
        }
        
        boardMapView(boardMap);
        
        
        //지워야할 좌표 모두 찾기
        ArrayList<int[]> matchList = new ArrayList<int[]>();
        boolean check1 = true;
        while(check1) {
        	check1 = false;
	        for(int i = 0; i<m-1; i++) {
	        	for(int j = 0; j<n-1; j++) {
	        		
	        		char ch1 = boardMap[i][j];
	        		if(ch1 == '0') {
	        			continue;
	        		}
	        		char ch2 = boardMap[i][j+1];
	        		char ch3 = boardMap[i+1][j];
	        		char ch4 = boardMap[i+1][j+1];
	        		if( (ch1==ch2) && (ch2==ch3) && (ch3==ch4) && (ch4==ch1) ) {
	        			int[] matchCoord = {i ,j};
	        			matchList.add(matchCoord);
	        			check1 = true;
	        		}
	        	}
	        }
	        
	        //지워야할 좌표로 해당좌표부터 1234 부분 지우기
	        for(int[] coord: matchList) {
	        	int y = coord[0];
	        	int x = coord[1];
	        	boardMap[y][x] = '0';
	        	boardMap[y][x+1] = '0';
	        	boardMap[y+1][x] = '0';
	        	boardMap[y+1][x+1] = '0';
	        }
	        matchList.clear();
	        boardMapView(boardMap);
	        
	        //이제 자기의 밑부분이 0이라면 밑으로 내려야함
	        boolean check2 = true;
	        while(check2) {
	        	check2 = false;
	        	for(int i = 0; i<m - 1; i++) {
	        		
	            	for(int j = 0; j<n; j++) {
	            		
	            		if(boardMap[i][j] != '0') {
	            			if(boardMap[i+1][j] == '0') {
	            				boardMap[i+1][j] = boardMap[i][j];
	            				boardMap[i][j] = '0';
	            				check2 = true;
	            			}
	            		}
	            	}
	        	}
	        }
        }
        boardMapView(boardMap);
        
        int count = 0;
        
        for(char[] chArr: boardMap) {
        	for(char ch: chArr) {
        		if(ch == '0') {
        			count += 1;
        		}
        	}
        }
        
        answer = count;
        return answer;
    }
	
	private void boardMapView(char[][] boardMap) {
		
		for(int i = 0; i < boardMap.length; i++) {
			for(int j = 0; j < boardMap[0].length; j++) {
				System.out.print(boardMap[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
}

package codingTest;

public class TestLevel2_EdgeRotation {
	
	private int min = 10001;
	
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        int[][] board = new int[rows][columns];
        int before = 0;
        
        for(int i = 0; i<rows; i++) { //board 만들기
        	for(int j = 0; j < columns; j++) {
        		board[i][j] = i*columns + j + 1;
        		System.out.print(board[i][j] + " ");
        	}
        	System.out.println();
        }
        System.out.println();
        System.out.println();
        
        for(int i = 0; i<queries.length; i++) { // 여기안에 많이 들어갈거임
        	int[][] apex = apexMaker(queries[i]);
        	before = sideMaker1(apex[0], apex[1], board);
        	before = sideMaker2(apex[1], apex[2], board, before);
        	before = sideMaker3(apex[2], apex[3], board, before);
        	sideMaker4(apex[3], apex[1], board, before);
        	answer[i] = min;
        	min = 10001;
        	
        	
//            for(int k = 0; k<rows; k++) { // 확인용 board 만들기
//            	for(int j = 0; j < columns; j++) {
//            		if(board[k][j] < 10) {
//            			System.out.print(" " + board[k][j] + " ");
//            		}
//            		else {
//            			System.out.print(board[k][j] + " ");
//            		}
//            	}
//            	System.out.println();
//            }
//            
//            System.out.println();
//            System.out.println();
        }
        return answer;
    }
    
    private int[][] apexMaker(int[] coord){ // coord = [x1,y1,x2,y2] X -> [y1, x1, y2, x2]
    	int[][] apex = new int[4][2];
    	//x1,y1
    	apex[0][0] = coord[1] - 1; // 우리는 index를 적용시켜야하기때문
    	apex[0][1] = coord[0] - 1;
    	
    	//x2,y1
    	apex[1][0] = coord[3] - 1;
    	apex[1][1] = coord[0] - 1;
    	
    	//x2,y2
    	apex[2][0] = coord[3] - 1;
    	apex[2][1] = coord[2] - 1;
    	
    	//x1,y2
    	apex[3][0] = coord[1] - 1;
    	apex[3][1] = coord[2] - 1;
    	
    	return apex;    	
    }
    
    private int sideMaker1(int[] start, int[] end, int[][] board) { // apex[0](x1,y1) , apex[1](x2,y1)
    	int front;
    	int back = 0;
    	for(int i = start[0]; i<end[0]; i++) {
    		
    		if(i == start[0]) { // 가장 처음만
    			front = board[start[1]][i];
    		}
    		else {
    			front = back;
    		}
    		
    		if(min > front) {
    			min = front;
    		}
    		
    		back = board[start[1]][i+1];
    		board[start[1]][i+1] = front;
    	}
    	
    	return back;
    }
    
    private int sideMaker2(int[] start, int[] end, int[][] board, int bf) { // apex[1](x2,y1) , apex[2](x2,y2)
    	int front;
    	int back = 0;
    	for(int i = start[1]; i<end[1]; i++) {
//    		front = board[i][start[0]];
//    		back = board[i+1][start[0]];
    		if(i == start[1]) {
    			front = bf;
    		}
    		else {
    			front = back;
    		}
    		
    		if(min > front) {
    			min = front;
    		}
    		
    		back = board[i+1][start[0]];
    		board[i+1][start[0]]= front;
    	}
    	
    	return back;
    }
    
    private int sideMaker3(int[] start, int[] end, int[][] board, int bf){ //apex[2](x2,y2), apex[3](x1,y2),
    	int front = 0;
    	int back = 0;
    	for(int i = start[0]; i > end[0]; i--) {
    		if( i == start[0]) { // 가장첫번째 돌때
    			back = bf;
    		}
    		else {
    			back = front;
    		}
    		
    		if(min > back) {
    			min = back;
    		}
    		
    		front = board[start[1]][i-1];    		
    		board[start[1]][i-1] = back;
    	}
    	
    	
    	return front;
    }
    
    private void sideMaker4(int[] start, int[] end, int[][] board, int bf){ //apex[3](x1,y2), apex[1](x1,y1),
    	int front = 0;
    	int back = 0;
    	for(int i = start[1]; i > end[1]; i--) {
    		if( i == start[1]) { // 가장첫번째 돌때
    			back = bf;
    		}
    		else {
    			back = front;
    		}
    		
    		if(min > back) {
    			min = back;
    		}
    		
    		front = board[i-1][start[0]];    		
    		board[i-1][start[0]] = back;
    	}
    }
}

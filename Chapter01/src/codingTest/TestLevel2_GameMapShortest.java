package codingTest;

public class TestLevel2_GameMapShortest {
	
	public int solution(int[][] maps) {
        int answer = 0;
        
        int[][] boardMap = maps.clone();
        
        int x_pos = 0;
        int y_pos = 0;
        boolean x_pos_zero; // x좌표가 0일때 true
        boolean y_pos_zero; // y좌표가 0일때 true
        boolean x_pos_final; // x좌표가 마지막일떄 true
        boolean y_pos_final; // y좌표가 마지막일때 true
        int count = 0;
        
        
        while(true) {
        	
        	x_pos_zero = false;
        	y_pos_zero = false;
        	x_pos_final = false;
        	y_pos_final = false;
        	
	        if(x_pos == 0) { // x좌표가 처음, 끝인지 확인
	        	x_pos_zero = true;
	        }
	        else if(x_pos == boardMap.length - 1) {
	        	x_pos_final = true;
	        }
	        
	        if(y_pos == 0) { // y좌표가 처음, 끝인지 확인
	        	y_pos_zero = true;
	        }
	        else if(y_pos == boardMap.length - 1) {
	        	y_pos_final = true;
	        }
	        
	        boardMap[y_pos][x_pos] = 0; // 이거 중요 다시 뒤로 안돌아오게 하기위해
	        
	        if(x_pos_zero) { //x,y좌표 둘다 처음이라면(생각해보니 무조건 맨첫번째가 0이 되기에 x,y둘중하나가 처음이어도 상관없을듯)
	        	if(y_pos_final) {
		        	if(boardMap[y_pos][x_pos + 1] == 1) {
		        		x_pos += 1;
		        	}
		        	else{
		        		break;
		        	}
	        	}
	        	else {
		        	if(boardMap[y_pos + 1][x_pos] == 1) {
		        		y_pos += 1;
		        	}
		        	
		        	else if(boardMap[y_pos][x_pos + 1] == 1) {
		        		x_pos += 1;
		        	}

		        	else if(boardMap[y_pos + 1][x_pos] == 0 && boardMap[y_pos][x_pos + 1] == 0) {
		        		count = -1;
		        		break;
		        	}
	        		
	        	}
	        	

	        }
	        else if(y_pos_zero) { // y좌표만 처음이라면
	        	if(x_pos_final) {
	        		if(boardMap[y_pos + 1][x_pos] == 1) {
		        		y_pos += 1;
		        	}
	        		else {
	        			break;
	        		}
	        	}
	        	else {
		        	if(boardMap[y_pos + 1][x_pos] == 1) {
		        		y_pos += 1;
		        	}
		        	
		        	else if(boardMap[y_pos][x_pos + 1] == 1) {
		        		x_pos += 1;
		        	}
	
		        	else if(boardMap[y_pos + 1][x_pos] == 0 && boardMap[y_pos][x_pos + 1] == 0) {
		        		count = -1;
		        		break;
		        	}
	        	}
	        }
	        else if(x_pos_final) { // x 좌표만 마지막 이라면 , y좌표가 처음일 일은 위에서 처리함
	        	
	        	if(y_pos_final) { // 도착한것
	        		count += 1;
	        		break;
	        	}
	        	else {
		        	if(boardMap[y_pos + 1][x_pos] == 1) {
		        		y_pos += 1;
		        	}
		        	
		        	else if(boardMap[y_pos][x_pos - 1] == 1) {
		        		x_pos -= 1;
		        	}

		        	else if(boardMap[y_pos + 1][x_pos] == 0 && boardMap[y_pos][x_pos - 1] == 0) {
		        		count = -1;
		        		break;
		        	}
	        		
	        	}
	        	
	        }
	        else if(y_pos_final) {
	        	
	        	if(boardMap[y_pos - 1][x_pos] == 1) {
	        		y_pos -= 1;
	        	}
	        	
	        	else if(boardMap[y_pos][x_pos + 1] == 1) {
	        		x_pos += 1;
	        	}

	        	else if(boardMap[y_pos - 1][x_pos] == 0 && boardMap[y_pos][x_pos + 1] == 0) {
	        		count = -1;
	        		break;
	        	}
	        }
	        else {
	        	if(boardMap[y_pos][x_pos + 1] == 1) {
	        		x_pos += 1;
	        	}
	        	else if(boardMap[y_pos - 1][x_pos] == 1) {
	        		y_pos -= 1;
	        	}
	        	
	        	else if(boardMap[y_pos + 1][x_pos] == 1) {
	        		y_pos += 1;
	        	}
	        	
	        	else if(boardMap[y_pos][x_pos - 1] == 1) {
	        		x_pos -= 1;
	        	}

	        	else{
	        		count = -1;
	        		break;
	        	}
	        	
	        }
	        count += 1;

        }
        
        answer = count;
        
        return answer;
    }
}

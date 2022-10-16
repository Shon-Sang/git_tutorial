package integer_triangle;

public class IntegerTriangle {
	
	public IntegerTriangle() {
		
	}
	
	public int solution(int[][] triangle) {
        int answer = 0;
        for(int i = 1; i<triangle.length; i++) {
        	for(int j = 0; j<triangle[i].length; j++) {
        		
        		if(j == 0) {
        			triangle[i][j] += triangle[i - 1][j];
        		}else if(j == triangle[i].length - 1) {
        			triangle[i][j] += triangle[i - 1][j - 1];
        		}else {
        			triangle[i][j] += maxNumber(triangle[i - 1][j - 1], triangle[i - 1][j]);
        		}
        	}
        }
        
        for(int i = 0; i<triangle[triangle.length - 1].length; i++) {
        	if(answer < triangle[triangle.length - 1][i]) {
        		answer = triangle[triangle.length - 1][i];
        	}
        }
        
        return answer;
    }
	
	
	public int maxNumber(int a, int b) {
		if(a > b) {
			return a;
		} else {
			return b;
		}
	}
	
	public int solution02(int[][] triangle) {
		int answer = 0;
		
		for(int i = 1 ; i<triangle.length; i++) {
			triangle[i][0] += triangle[i-1][0];
			triangle[i][i] += triangle[i-1][i-1];
			for(int j = 1; j < i; j++) {
				triangle[i][j] += maxNumber(triangle[i - 1][j - 1], triangle[i - 1][j]);
			}
		}
		for(int i = 0; i<triangle[triangle.length - 1].length; i++) {
			if(answer < triangle[triangle.length - 1][i]) {
				answer = triangle[triangle.length - 1][i];
			}
		}
		return answer;
	}
}

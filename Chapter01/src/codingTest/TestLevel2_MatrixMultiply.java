package codingTest;

public class TestLevel2_MatrixMultiply {
	public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        
        if(arr1[0].length == arr2.length) {
        	int multiplyNum = arr1[0].length;
        	int row = arr1.length;
        	int column = arr2[0].length;
        	int[][] resultArr = new int[row][column];
        	for(int i = 0; i<row; i++) {
        		for(int j = 0; j<column; j++) {
        			int sum = 0;
        			for(int k = 0; k<multiplyNum; k++) {
        				sum += arr1[i][k] * arr2[k][j];
        			}
        			resultArr[i][j] = sum;
        		}
        	}
        	
        	answer = resultArr;
        	
        }else {
        	System.out.println("곱셈을 할 수 없습니다.");
        }
        
        return answer;
    }
}

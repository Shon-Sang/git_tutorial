package codingTest;

public class TestLevel2_QuerdCompress {
	private int[] resultArr = new int[2];
	
	public int[] solution(int[][] arr) {
        int[] answer = {};
        binaryCompress(0, 0, arr.length, arr);
        answer = resultArr;
        
        
		return answer;
    }
	
	
	private boolean checkArray(int x, int y, int size, int arr[][]) {
		for(int i = y; i < y + size; i++) {
			for(int j = x; j < x + size; j++) {
				if(arr[y][x] != arr[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
	
	private void binaryCompress(int startX, int startY, int size, int[][] arr) {
		if(checkArray(startX, startY, size, arr)) {
			resultArr[arr[startY][startX]] += 1;
			return;
		}
		
		binaryCompress(startX, startY, size/2, arr);
		binaryCompress(startX + size/2, startY, size/2, arr);
		binaryCompress(startX, startY + size/2, size/2, arr);
		binaryCompress(startX + size/2, startY + size/2, size/2, arr);
	}
}

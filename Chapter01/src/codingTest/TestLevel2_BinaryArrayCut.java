package codingTest;

public class TestLevel2_BinaryArrayCut {
	public int[] solution(int n, long left, long right) {
        int[] answer;
        int[][] board;
        int[] temp;
        board = maker1(n);
        temp = maker2(board);
        answer = maker3(temp, left, right);
        for(int a: answer) {
        	System.out.print(a + " ");
        }
//        for(int[] arr: board) {
//        	for(int a: arr) {
//        		System.out.print(a+" ");
//        	}
//        	System.out.println();
//        }
        return answer;
    }
	
	private int[][] maker1(int n){
		int[][] result = new int[n][n];
		for(int i = 0; i < n; i++) {
			int num = i + 1;
			result[i][i] = num;
			
			// 가로(점에서 위로채우기) x고정
			for(int j = i; j > 0; j--) {
				result[j - 1][i] = num;
			}
			// 세로(점에서 왼쪽으로 채우기) y고정
			for(int k = i; k > 0; k--) {
				result[i][k - 1] = num;
			}
		}
		
		return result;
	}
	
	private int[] maker2(int[][] arr) {
		int[] result = new int[arr.length * arr.length];
		int cnt = 0;
		int cnt2 = 0;
		for(int i = 0; i<result.length; i++) {
			if(cnt == arr.length) {
				cnt = 0;
				cnt2 += 1;
			}
			result[i] = arr[cnt2][cnt];
			cnt += 1;
		}
		
		return result;
	}
	
	private int[] maker3(int[] arr, long left, long right) {
		int[] result = new int[(int)(right - left + 1)];
		int index = 0;
		for(long i = left; i<=right; i++) {
			result[index] = arr[(int)i];
			index += 1;
		}
		
		return result;
	}
}

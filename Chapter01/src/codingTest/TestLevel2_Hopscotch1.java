package codingTest;

public class TestLevel2_Hopscotch1 {
	private int resultMax = 0;
	
	int solution(int[][] land) {
        int answer = 0;
        Hopscotch(land);
        answer = resultMax;
        return answer;
    }
	
	
	public void Hopscotch(int[][] land) {
		int before = 100;
		int now = 0;
		int sum = 0;
		for(int i = 0; i<land.length; i++) {
			int lineMax = 0;
			for(int j = 0; j<land[i].length; j++) {
				if(j == before) {
					continue;
				}
				if(lineMax < land[i][j]) {
					lineMax = land[i][j];
					now = j;
				}
			}
			sum += lineMax;
			before = now;
		}
		if(resultMax < sum) {
			resultMax = sum;
		}
	}
	
//	int solution(int[][] land) {
//        int answer = 0;
//        int[] index = new int[land.length];
//        for(int i = 0; i<index.length; i++) {
//        	index[i] = i;
//        }
//        int[] outIndex = new int[land.length];
//        boolean[] visited = new boolean[land.length];
//
//        myperf(index, outIndex, visited, 0, land.length, land);
//        
//        answer = resultMax;
//        return answer;
//    }
//	
//	public void myperf(int[] in, int[] out, boolean[] visited, int dep, int r, int[][] land) {
//		if(dep == r) {
//			int[][] landClone = new int[r][4];
//			for(int i = 0; i<r; i++) {
//				landClone[i] = land[out[i]];
//			}
//			Hopscotch(landClone);
//			return;
//		}
//		
//		for(int i = 0; i<in.length; i++) {
//			if(!visited[i]) { //방문하지 않았다면
//				visited[i] = true;
//				out[dep] = in[i];
//				myperf(in, out, visited, dep+1, r, land);
//				visited[i] = false;
//			}
//		}
//	}
//	
//	public void Hopscotch(int[][] land) {
//		int before = 100;
//		int now = 0;
//		int sum = 0;
//		for(int i = 0; i<land.length; i++) {
//			int lineMax = 0;
//			for(int j = 0; j<land[i].length; j++) {
//				if(j == before) {
//					continue;
//				}
//				if(lineMax < land[i][j]) {
//					lineMax = land[i][j];
//					now = j;
//				}
//			}
//			sum += lineMax;
//			before = now;
//		}
//		if(resultMax < sum) {
//			resultMax = sum;
//		}
//	}
}

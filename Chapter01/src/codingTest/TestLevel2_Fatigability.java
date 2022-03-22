package codingTest;

public class TestLevel2_Fatigability {
	private int max;
	private int fatigablity;
	private int[][] dungeonsInfo;
	
	public int solution(int k, int[][] dungeons) {
        int answer = -1;
        max = 0;
        fatigablity = k;
        dungeonsInfo = dungeons;
        
        int[] indexArr = new int[dungeons.length];
        for(int i = 0; i<dungeons.length; i++) {
        	indexArr[i] = i;
        }
        
        int[] outArr = new int[dungeons.length];
        boolean[] visited = new boolean[dungeons.length];
        
        for(int i = 0; i<indexArr.length; i++) {
        	myperm(indexArr, outArr, 0, visited, i+1);
        }
        answer = max;
        return answer;
    }
	
	
	private void myperm(int[] arr, int[] out, int dep, boolean[] visited, int r) {
		if(max == arr.length) {
			return;
		}
		
		if(dep == r) {
			int tempCnt = 0;
			int fati = fatigablity;
			boolean check = true;
			for(int i = 0; i<r; i++) {
//				if(visited[i]) { // 잘못함 이건 조합때 알고리즘
//					System.out.print(out[i]+" ");
//				}
				System.out.print(out[i]+" ");
				if(fati >= dungeonsInfo[out[i]][0]) {
					fati -= dungeonsInfo[out[i]][1];
					tempCnt += 1;
				}
				else {
					check = false;
					break;
				}
			}
			if(check) {
				System.out.print("true");
				if(max < tempCnt) {
					max = tempCnt;
				}
			}

			System.out.println();
			return;
		}
		
		for(int i = 0; i<arr.length; i++) {
			if(!visited[i]) { //처음 방문하면
				visited[i] = true;
				out[dep] = arr[i];
				myperm(arr, out, dep + 1, visited, r);
				visited[i] = false;
			}
		}
	}
}

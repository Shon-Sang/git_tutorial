package codingTest;

public class TestLevel2_MinimumMaker {
	private int min = 999999;
	public int solution(int[] A, int[] B)
    {
        int answer = 0;
        
        int[] perArr = new int[A.length];
        boolean[] visted = new boolean[A.length];
        
        perfum(A, perArr, B, visted, 0);
        
        answer = min;

        return answer;
    }
	
	public void perfum(int[] in, int[] out, int[] calArr, boolean[] visited, int dep) {
		if(dep == in.length) {
			int sum = 0;
			for(int i = 0; i<dep; i++) {
				System.out.print(out[i] + " ");
				sum += out[i]*calArr[i];
			}
			System.out.println();
			if(min > sum) {
				min = sum;
			}
			return;
		}
		
		for(int i = 0; i<in.length; i++) {
			if(!visited[i]) {
				visited[i] = true;
				out[dep] = in[i];
				perfum(in, out, calArr, visited, dep + 1);
				visited[i] = false;
			}
		}
		
	}
}

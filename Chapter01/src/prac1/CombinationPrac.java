package prac1;

public class CombinationPrac {

	public static void main(String[] args) {
		
		// 6P3
		int[] input = {1,2,3,4,5,6};
		int[] output = new int[input.length];
		boolean[] visited = new boolean[input.length];
		
		for(int i = 0; i<input.length; i++) {
			comb(input, visited, 0, i + 1);
		}
		
		
	}
	
	public static void comb(int[] in, boolean[] visited, int start, int r) {
		
		if(r == 0) {
			for(int j = 0; j<in.length; j++) {
				if(visited[j]) {
					System.out.print(in[j]+" ");
				}
			}
			System.out.println();
			
			return;
		}
		
		for(int i = start; i<in.length; i++) {
			if(!visited[i]) {
				visited[i] = true;
				//out[dep] = in[i];
				comb(in, visited, i + 1, r - 1);
				visited[i] = false;
			}
		}
	}

}

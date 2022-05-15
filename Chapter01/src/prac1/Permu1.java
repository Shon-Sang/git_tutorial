package prac1;

public class Permu1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrLength = 4;
		int[] arr = {2,3,4,1};
		int[] out = new int[arrLength];
		boolean[] visited = new boolean[arrLength];
		permut(arr, out, 0, visited, 4);
//		for(int i = 0; i<arr.length; i++) {
//			permut(arr, out, 0, visited, i+1);
//		}

	}
	
	public static void permut(int[] in, int[] out, int dep, boolean[] visited, int r) {
		if(dep == r) {
			for(int i = 0; i<r; i++) {
				System.out.print(out[i] + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i = 0; i<in.length; i++) {
			if(!visited[i]) {
				visited[i] = true;
				out[dep] = in[i];
				permut(in, out, dep + 1, visited, r);
				visited[i] = false;
			}
		}
	}

}

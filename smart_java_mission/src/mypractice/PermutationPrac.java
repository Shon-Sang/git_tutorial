package mypractice;

public class PermutationPrac {

	public static void main(String[] args) {
		
		String[] soulPlayers = {"하루", "어윈", "릴리", "스텔라", "이리스", "진", "치이", "에프넬", "이나비"};
		String[] result = new String[soulPlayers.length];
		boolean[] visited = new boolean[soulPlayers.length];
		permu(soulPlayers, result, visited, 0, 2);
		
		// 항상 기억할것 n P r 
	}
	
	private static void permu(String[] in, String[] out, boolean[] visit, int dep, int r) {
		int n = in.length;
		if(dep == r) {
			for(int i = 0; i<r; i++) {
				System.out.print(out[i]+" ");
			}
			System.out.println();
			return;
		}
		
		for(int i = 0; i < n; i++) {
			if(!visit[i]) {
				visit[i] = true;
				out[dep] = in[i];
				permu(in, out, visit, dep + 1, r);
				visit[i] = false;
			}
		}
	}

}

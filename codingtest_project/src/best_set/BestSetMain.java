package best_set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BestSetMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		BestSet bs = new BestSet();
		int[] answer = bs.solution(Integer.parseInt(stk.nextToken()), Integer.parseInt(stk.nextToken()));
		sb.append('[');
		for(int k : answer) {
			sb.append(k);
			sb.append(' ');
		}
		sb.deleteCharAt(sb.length() - 1);
		sb.append(']');
		System.out.println(sb.toString());
	}

}

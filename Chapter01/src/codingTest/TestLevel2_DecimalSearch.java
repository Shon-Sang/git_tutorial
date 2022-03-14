package codingTest;

import java.util.ArrayList;

public class TestLevel2_DecimalSearch {
	
	private ArrayList<Integer> decimalList = new ArrayList<Integer>();
    private StringBuilder sb = new StringBuilder();
	
	public int solution(String numbers) {
        int answer = 0;
        char[] numbersArr = numbers.toCharArray();
        char[] outArr = new char[numbersArr.length];
        boolean[] visited = new boolean[numbersArr.length];
        
        for(int i = 0; i < numbersArr.length; i++) {
        	permu(numbersArr, outArr, 0, visited, i + 1);
        }
        
        for(int e: decimalList) {
        	System.out.print(e +" ");
        }
        System.out.println();
        
        answer = decimalList.size();
        
        return answer;
    }
	
	private void permu(char[] n, char[] out, int dep, boolean[] visited, int r) {
		
		if(dep == r) { // 1개의 경우의 수가 완성된것
			for(int j = 0; j<r; j++) {
				sb.append(out[j]);
			}
			int temp = Integer.parseInt(sb.toString());
			decimalList(temp);
			sb.setLength(0);
			
			return;
		}
		
		for(int i = 0; i<n.length; i++) {
			if(!visited[i]) {
				visited[i] = true;
				out[dep] = n[i];
				permu(n, out, dep + 1, visited, r);
				visited[i] = false;
			}
		}
		
	}
	
	private void decimalList(int input) {
		if(!decimalList.contains(input)) {
			boolean check = true;
			
			if((input == 0) || (input == 1)) { // input이 0 or 1일때는 for문에 조건에 안맞아서 돌지조차 않음
				check = false;
			}
			
			for(int i = 2; i*i < input; i++) {
				
				if(input % i == 0) { // 약수가 아님
					check = false;
					break;
				}
			}
			
			if(check) {
				decimalList.add(input);
			}
			
		}
	}
}

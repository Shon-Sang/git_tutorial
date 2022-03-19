package codingTest;

import java.util.ArrayList;

public class TestLevel2_Camouflage {
	
	private int count = 0;
	private ArrayList<ArrayList<Integer>> intList = new ArrayList<ArrayList<Integer>>();
	public int solution(String[][] clothes) {
        int answer = 0;
        
        String[] clKind = new String[clothes.length];
        boolean[] visit = new boolean[clKind.length];
        ArrayList<String> tempList = new ArrayList<String>();
        
        for(int i = 0; i<clKind.length; i++) {
        	clKind[i] = clothes[i][1];
        }
        
        for(int i = 0; i<clKind.length; i++) {
        	comb(clKind, visit, 0, i + 1, tempList);
        	
        }
        
        answer = count;
        
        for(ArrayList<Integer> list : intList) {
        	for(int i: list) {
        		
        		System.out.print(clothes[i][0]+" ");
        	}
        	System.out.println();
        }
        System.out.println();
        return answer;
    }
	
	private void comb(String[] arr, boolean[] visited, int start, int r, ArrayList<String> tempList) {
		
		if(r == 0) {
			ArrayList<Integer> tempIntList = new ArrayList<Integer>();
			boolean check = true;
			for(int i = 0; i<arr.length; i++) {				
				if(visited[i]) {
					String temp = arr[i];
					if(!tempList.contains(temp)) {
						tempList.add(temp);
						tempIntList.add(i);
					}
					else {
						check = false;
						break;
					}
				}
			}
			
			
			if(check) {
				count += 1;
				intList.add(tempIntList);
			}
			tempList.clear();
			
			return;
		}
		
		for(int i = start; i<arr.length; i++) {
			if(!visited[i]) {
				visited[i] = true;
				comb(arr, visited, i + 1, r - 1, tempList);
				visited[i] = false;
			}
		}
	}
}

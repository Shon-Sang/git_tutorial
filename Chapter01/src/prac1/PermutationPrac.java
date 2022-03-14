package prac1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PermutationPrac {
	
	static StringBuilder sb = new StringBuilder();
	static ArrayList<Integer> intList = new ArrayList<Integer>();
	public static void main(String[] args) {
		
		char[] input = "0131".toCharArray();
		char[] output = new char[input.length];
		boolean[] visit = new boolean[input.length];
		for(int i = 0; i<input.length; i++) {
			perm(input, output, visit, 0, i+1);
		}
		int[] arrInt = new int[intList.size()];
		for(int j = 0; j<arrInt.length; j++) {
			arrInt[j] = intList.get(j);
		}
		
		System.out.println();
		ArrayList<Integer> resultList = decimal(arrInt);
		
		Collections.sort(resultList, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2 - o1;
			}
		});
		
		for(int e: resultList) {
			System.out.print(e + " ");
		}
	}
	
	public static void perm(char[] arr, char[] out, boolean[] visited, int dep, int r) { // arr,out,visited 은 크기가 같아야함
		
		if(dep == r) {
			int temp;
			for(int j = 0; j<r; j++) {
				sb.append(out[j]);
			}
			temp = Integer.parseInt(sb.toString());
			if(!intList.contains(temp)) {
				intList.add(temp);
				System.out.println(temp);
			}
			sb.setLength(0);
			
			return;
		}
		
		for(int i = 0; i<arr.length; i++) {
			if(!visited[i]) { // 기본 false
				visited[i] = true;
				out[dep] = arr[i]; // 여기 알고리즘 중요
				perm(arr, out, visited, dep+1, r);
				visited[i] = false;
			}
		}
		
	}
	
	public static ArrayList<Integer> decimal(int[] input) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		int num;
		boolean check = true;
		
		for(int i = 0; i<input.length; i++) {
			num = input[i];
			
			if(num == 1 || num == 0) {
				continue;
			}
			
			for(int k = 2; k*k < num; k++) {

				if((num%k == 0) && (num != 2)) { // 약수가 존재한다.
					check = false;
					break;
				}
			}
			
			if(check) {
				result.add(num);
			}
			
			check = true;
			
		}
		
		return result;
	}

}

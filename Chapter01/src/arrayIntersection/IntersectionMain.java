package arrayIntersection;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionMain {

	public static void main(String[] args) {
		List<Integer> arlist1 = new ArrayList<>();
		List<Integer> arlist2 = new ArrayList<>();
		arlist1.retainAll(arlist2);
		Integer[] arr1 = {5,3,3,6,1,5,3,6,5,8};
		Integer[] arr2 = {3,6,2,4,4,1,2,8,9,5,2,1,7,2};
		ArrayList<Integer> list = new ArrayList<>();
		Set<Integer> set1, set2, set3;
		set1 = new HashSet<Integer>(Arrays.asList(arr1));
		set2 = new HashSet<Integer>(Arrays.asList(arr2));
		//set3 = set1
		
		arr1 = set1.toArray(new Integer[0]);
		arr2 = set2.toArray(new Integer[0]);
		
		System.out.println(arr1);
		System.out.println(arr2);
		for(Integer k : arr1) {
			System.out.print(k+" ");
		}
		System.out.println();
		for(Integer t : arr2) {
			System.out.print(t+" ");
		}
		//교집합 만들거임
		for(int i = 0; i<arr2.length; i++) {
			for(int j = 0; j<arr1.length; j++) {
				if(arr2[i] == arr1[j]) {
					list.add(arr2[i]);
					break;
				}
			}
		}

		System.out.println();
		for(Integer p : list) {
			System.out.print(p+" ");
		}
		for(Integer p : list) {
		
		}
	}

}

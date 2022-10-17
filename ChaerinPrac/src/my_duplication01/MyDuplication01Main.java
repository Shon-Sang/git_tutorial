package my_duplication01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyDuplication01Main {

	public static void main(String[] args) {
		MyDuplication01 md01 = new MyDuplication01("sskssdddgtgtgtgtge39ke93p");
		Integer[] prac01 = {3, 4, 5, 6, 67,11 ,4};
		List<Integer> bufList;
		System.out.println(md01.getDupl());
		
		System.out.println(Arrays.toString(prac01));
		bufList = Arrays.asList(prac01);
		bufList = new ArrayList<Integer>(bufList);
		bufList.add(55);
		System.out.println(bufList.get(bufList.size() - 1));
	}

}

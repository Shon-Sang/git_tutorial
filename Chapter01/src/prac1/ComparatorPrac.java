package prac1;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorPrac {

	public static void main(String[] args) {
		
		Comparator<String> comp1 = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				if(o2.length() == o1.length()) {
					return o2.compareTo(o1);
				}
				else {
					return o2.length() - o1.length();
				}
			}
		};
		
		String[] strArr = {"grape", "banana", "apple", "watermelon", "peach",
				"pears", "orange", "melon", "tomato", "kiwi"};
		String s1 = "dgieg";
		String s2 = "oepwd";
		String[] strArr2 = strArr.clone();
		s1.compareTo(s2);
		// Comparator과 Comparable의 차이는 전자의 경우 인수로 2개의 객체를 받음(자기자신도 가능), 후자는 자기자신(this)과 다른객체를 받음 의 차이
		// compare/ compareTo 로 각각 재정의 해야하는 메소드도 다름 보통 직접만든 클래스에선 Comparable implements함
		Arrays.sort(strArr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				if(o1.length() == o2.length()) {
					return o1.compareTo(o2); // 대소문자 구분
					//return o1.compareToIgnoreCase(o2);// 대소문자 구분X
				}
				else {
					return o1.length() - o2.length();
				}
			}
		});
		
		Arrays.sort(strArr2, comp1);
		
		for(String str: strArr) {
			System.out.print(str + " ");
		}
		System.out.println();
		for(String str: strArr2) {
			System.out.print(str + " ");
		}
	}
}

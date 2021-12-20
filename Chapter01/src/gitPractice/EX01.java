package gitPractice;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class EX01 {

	public static void main(String[] args) {
		//LinkedHashSet<E>
		int input;
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		for(int i = input; i>0; i--) {
			for(int j = 0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 1; i<input; i++) {
			for(int j =0; j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

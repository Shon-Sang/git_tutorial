package gitPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		
		ArrayList<Integer> numberList = new ArrayList<>();
		int temp;
		while(numberList.size() < 25) {
			temp = random.nextInt(25) + 1;
			if(!(numberList.contains(temp))) {
				numberList.add(temp);
			}			
		}
		for(int i =0; i<5;i++) {
			for(int j=0; j<5; j++) {
				System.out.print(numberList.get(5*i + j) + " ");
			}
			System.out.println();
		}
		System.out.println();
		//-------------------------------------------------------------------
		int[][] intArray = new int[5][5];
		int temp2;
		int count = 0;
		int i = 0;
		int j = 0;
		while(count != intArray.length * intArray[0].length) {
			
			temp2 = random.nextInt(25) + 1;
			if(searchOverlap(intArray, count, temp2)) {
				intArray[i][j] = temp2;
				j++;
				if(j==5) {
					j=0;
					i++;
				}
				count = 5*i + j;
			}			
		}
		
		// ���
		for(int m = 0; m<5;m++) {
			for(int n= 0; n<5; n++) {
				System.out.print(intArray[m][n] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println(decToHex(32));
		//
		Scanner sc = new Scanner(System.in);
		String result;
		
		while((result = sc.nextLine()) != "0") {
			switch(result) {
			case "ABC":
				System.out.println("ABC");
				break;
			case "DEF":
				System.out.println("DEF");
				break;
			case "6":
				System.out.println("6");
				break;
			default:
				System.out.println("NULL");
				break;
			}
		}
		
		
		
		
	}
	
	public static boolean searchOverlap(int[][] arr, int count, int temp) {
		int i,j;
		i = count/arr.length;
		//j = count%arr[0].length;
		
		for(int m = 0; m <= i; m++) {
			if(m != i) {
				j = arr[0].length;
			}else {
				j = count%arr[0].length;
			}
			for(int n = 0; n<j; n++) {
				if(arr[m][n] == temp) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean serachOverlapArrayList(ArrayList<Integer> list, int temp) {
		
		for(int i =0; i<list.size(); i++) {
			if(temp == list.get(i)) {
				return false;
			}
		}
		
		return true;
	}
	
	public static String decToHex(int dec) {
		String[] hexList = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
		
		int quo, remain;
		remain = 0;
		quo = dec;
		StringBuilder sb = new StringBuilder();
		String returnHex;
		
		while(quo != 0) {
			remain = quo%16;
			quo = quo/16;
			sb.append(hexList[remain]);
		}
		sb.append("x0");
		returnHex = sb.reverse().toString();
		
		return returnHex;
	}
	
	

}

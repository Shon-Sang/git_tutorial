package calcPrac;

import java.util.Scanner;

public class CalcMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String bufStr;
		int sum = 0;
		String intStr1 = "";
		String intStr2 = "";
		char yeonsan = ' ';
		int a = 0;
		int b = 0;
		
		while(!(bufStr = sc.nextLine()).equals("0")) {
			
			for(int i = 0; i < bufStr.length(); i++) {
				char ch = bufStr.charAt(i);
				
				if(ch < '0' || ch > '9') {
					yeonsan = ch;
					for(int j = i+1; j<bufStr.length(); j++) {
						ch = bufStr.charAt(j);
						intStr2 += ch;
					}
					b = Integer.parseInt(intStr2);
					break;
				}
				
				intStr1 += ch;
			}
			
			a = Integer.parseInt(intStr1);
			
			if(yeonsan == 'x' || yeonsan == 'X' || yeonsan == '*') {
				a = a*b;
			}
			
			sum += a;
			
			System.out.println("합계 : " + sum);
			
			intStr1 = "";
			intStr2 = "";
			yeonsan = ' ';
			b = 0; 
			
		}
		System.out.println("프로그램을 종료합니다.");
	}

}

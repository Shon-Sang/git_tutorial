package gitPractice;

import java.util.Scanner;

public class EX07 {

	public static void main(String[] args) {
		System.out.print("금액 : ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int[] price = {50000,10000,5000,1000,500,100,10,5,1};
		int count = 0;
		int p = 0;
		
		while(p<price.length) {
			while(input>=price[p]) {
				input -= price[p];
				count++;
			}
			
			System.out.println(price[p] + "원 : " + count +"개 입니다.");
			
//			if(input == 0) {
//				break;
//			}
			
			count = 0;
			p++;
		}
		
		
	}
	
	

}

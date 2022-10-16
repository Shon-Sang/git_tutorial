package countersidecalc;

import java.util.Scanner;

public class NicolEventNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int powder;
		int water;
		int fruit;
		
		System.out.println("홀리파우더 개수");
		powder = Integer.parseInt(sc.nextLine());
		
		System.out.println("그리드워터 개수");
		water = Integer.parseInt(sc.nextLine());
		
		System.out.println("스트롱프롯 개수");
		fruit = Integer.parseInt(sc.nextLine());
		
		System.out.println();
		System.out.printf("벨벳블롯섬 : %d\n", (powder+water-fruit)/4);
		System.out.printf("그리드워터 : %d\n", (powder-water+fruit)/4);
		System.out.printf("스트롱프롯 : %d\n", (-powder+water+fruit)/4);
	}

}

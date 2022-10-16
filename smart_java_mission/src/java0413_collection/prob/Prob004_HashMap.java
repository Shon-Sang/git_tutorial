package java0413_collection.prob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
/*
 * [출력결과]
 * 찾는 도서명을 입력 :java
 * 책이름 : java
 * 책저자 : kim
 * 페이지 : 100
 * 
 * 찾는 도서명을 입력 :jsp
 * 찾는 도서가 없습니다
 */

public class Prob004_HashMap {
	public static void main(String[] args) {
		BookShop bk1=new BookShop("java","kim",100);
		BookShop bk2=new BookShop("c++","lee",250);
		BookShop bk3=new BookShop("oracle","park",300);
		BookShop[] bs=new BookShop[3];
		bs[0]=bk1;
		bs[1]=bk2;
		bs[2]=bk3;
		display(bs);
		
		
		
	}
	
	public static void display(BookShop[] bs){
		Map<String,BookShop> map=new HashMap<String,BookShop>();
		map.put(bs[0].getTitle(), bs[0]);
		map.put(bs[1].getTitle(), bs[1]);
		map.put(bs[2].getTitle(), bs[2]);
		
		//출력결과를 참조하여 구현하세요.
		List<String> keyList = new ArrayList<String>();
		for(String key : map.keySet()) {
			keyList.add(key);
		}
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.printf("찾는 도서명을 입력 :");
			String input = sc.nextLine();
			if(keyList.contains(input)) {
				System.out.printf("책이름 : %s\n",map.get(input).getTitle());
				System.out.printf("책저자 : %s\n",map.get(input).getAuthor());
				System.out.printf("페이지 : %d\n",map.get(input).getPage());
				continue;
			}
//			try(Scanner sc = new Scanner(System.in)){ // 이거 안되는이유 왠지 close?랑 관련있는듯
//				String input = sc.nextLine();
//				if(keyList.contains(input)) {
//					System.out.printf("책이름 : %s\n",map.get(input).getTitle());
//					System.out.printf("책저자 : %s\n",map.get(input).getAuthor());
//					System.out.printf("페이지 : %d\n",map.get(input).getPage());
//					continue;
//				}
//			}
			System.out.println("찾는 도서가 없습니다.");
		}
	}
}













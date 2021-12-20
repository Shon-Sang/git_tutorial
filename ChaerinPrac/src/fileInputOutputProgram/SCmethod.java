package fileInputOutputProgram;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SCmethod {
	
	private ArrayList<Person> pList;
	
	public SCmethod(ArrayList<Person> pList) {
		this.pList = pList;
	}
	
	public void showStart() {
		System.out.println("***********************************\r\n"
				+ "*        전화번호 관리 프로그램        *\r\n"
				+ "***********************************");
	}
	
	public void showMenu() {
		System.out.println("-----------------------------------");
		System.out.println("1.리스트 2.등록 3.삭제 4.검색 5.종료");
		System.out.println("-----------------------------------");
		System.out.println(">메뉴번호: ");
	}
	
	public void case1() {
		System.out.println("<1.리스트>");
		for(int i=0; i<pList.size(); i++) {
			System.out.println(Integer.toString(i+1) + pList.get(i).showInfoString());
		}
	}
	
	public void case2(Scanner sc, FileIO io) throws IOException {
		Person person = new Person();
		System.out.println("<2.등록>");
		System.out.println("이름을 입력하세요.");
		person.setName(sc.nextLine());
		
		System.out.println("전화번호를 입력하세요.");
		person.setHp(sc.nextLine());
		
		System.out.println("회사번호를 입력하세요.");
		person.setCompany(sc.nextLine());
		
		pList.add(person); // 참조형 밖이랑 연결되어잇음 값이 아님 객체매개변수는 주소임
		io.pListToFile();
		System.out.println("[등록을 완료했습니다]");
	}
	
	public void case3(Scanner sc, FileIO io) throws IOException {
		System.out.println("<3.삭제>");
		System.out.println("번호 : ");
		int num;
		num = Integer.parseInt(sc.nextLine()) - 1;
		
		if(num>0 && num <= pList.size()) {
			pList.remove(num);
			io.pListToFile();
			System.out.println("[삭제되었습니다.]");
		}
		else {
			System.out.println("[존재하지 않는 번호입니다.]");
		}
	}
	
	public void case4(Scanner sc) {
		System.out.println("<4.검색>");
		System.out.println("찾고자하는 정보의 문자열을 입력하세요.");
		String sol = sc.nextLine();
		boolean search = false;
		
		for(int i = 0; i<pList.size(); i++) {
			if(pList.get(i).showInfoString().contains(sol)) {
				System.out.println(Integer.toString(i) + pList.get(i).showInfoString());
				search = true;
			}
		}
		
		if(search) {
			System.out.println("[검색을 완료했습니다.]");
		}
		else {
			System.out.println("[정보가 존재하지 않습니다.]");
		}
	}
	
	public void case5() {
		System.out.println("<5.종료>");
		System.out.println("[종료합니다.]");
	}

}

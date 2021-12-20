package fileInputOutputProgram;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProgramMain {

	public static void main(String[] args) throws IOException {
		
		String fileName = "D:\\PhoneDB.txt";
		FileIO io = new FileIO(fileName);
		ArrayList<Person> pList = io.fileTopList();
		SCmethod scm = new SCmethod(pList);
		int select = 0;
		
		scm.showStart();
		while(select != 5) {
			scm.showMenu();
			
			Scanner sc = new Scanner(System.in);
			select = Integer.parseInt(sc.nextLine());
			
			switch(select) {
				case 1: // 리스트
					scm.case1();
					break;
				case 2: // 등록
					scm.case2(sc, io);
					break;
				case 3: // 삭제
					scm.case3(sc, io);
					break;
				case 4: // 검색
					scm.case4(sc);
					break;
				case 5: // 종료
					scm.case5();
					break;
				default:
					System.out.println("1, 2, 3, 4, 5 중에서만 입력하세요");
					break;
			}
			
		}
		
	}

}

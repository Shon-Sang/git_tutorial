package fileinputPrac1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;


public class StreamMain1 {

	public static void main(String[] args) throws IOException {
		
		String fileName = "D:\\PhoneDB.txt";
		
		Reader is = new FileReader(fileName);
		
		
		BufferedReader br = new BufferedReader(is);
		ArrayList<Person> personList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String line = br.readLine();
			if(line == null) {
				break;
			}
			String[] word = line.split(",");
			personList.add(new Person(word[0], word[1], word[2]));
		}
		showPersonInfo(personList); 
		// 내 정보입력
		System.out.println("정보를 입력하세요.");
		String sBuffer = sc.nextLine();
		String[] myInfo = sBuffer.split(",");
		personList.add(new Person(myInfo[0], myInfo[1], myInfo[2]));
		
		br.close();
		
		showPersonInfo(personList);
		
		Writer ws = new FileWriter(fileName);
		BufferedWriter bw = new BufferedWriter(ws);
		for(int i =0; i<personList.size(); i++) {
			bw.write(personList.get(i).toString());
		}
		bw.flush();
		bw.close();
	}
	
	public static void showPersonInfo(ArrayList<Person> list) {
		for(int i = 0; i<list.size(); i++) {
			list.get(i).showInfo();
			System.out.println();
		}
	}
	

}

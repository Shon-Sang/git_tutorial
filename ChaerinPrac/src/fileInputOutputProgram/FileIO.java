package fileInputOutputProgram;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileIO {// 
	
	private String fileName;
	private ArrayList<Person> pList = new ArrayList<>();
	
	public FileIO(String fileName) { // 파일명 받아서 PersonList 반환할거, 한번 받으면 계속 그 파일명을 쓸거임
		this.fileName = fileName;
	}
	
	public ArrayList<Person> fileTopList() throws IOException { // txt.파일 -> pList
		
		String buf;
		String[] word;
		
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		while((buf = br.readLine()) != null) {
			word = buf.split(",");
			pList.add(new Person(word[0], word[1], word[2]));
		}
		br.close();
		
		return pList;
	}
	
	public void pListToFile() throws IOException { // pList -> txt.파일
		//FileIO.pList = pList;
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
		
		for(int i=0; i<pList.size(); i++) {
			bw.write(pList.get(i).toTxtString());
			bw.newLine();
		}
		
		bw.close();
	}

}

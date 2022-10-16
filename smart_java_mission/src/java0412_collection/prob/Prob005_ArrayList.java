package java0412_collection.prob;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
 /*
       [프로그램 실행결과]
		 *   [MBC]
		 *   4  오로라 공주      MBC   13.0
		 *   [KBS1]
		 *   1  지성이면 감천    KBS1  22.6 
		 *   2  KBS 뉴스 9     KBS1  19.0
		 *   5  인간극장         KBS1  12.4  
		 *   6  KBS 뉴스 7     KBS1  11.6  
		 *   7  KBS 뉴스광장    KBS1  10.4 
		 *   10 가요무대        KBS1  10.2 
		 *   [KBS2]
		 *   3  굿 닥터         KBS2  17.9 
		 *   8  TV소설 은희     KBS2  10.3   
		 *   [SBS]
		 *   8 황금의 제국      SBS   10.3
		 */


public class Prob005_ArrayList {

	public static void main(String[] args) {
		ArrayList<Television> aList=new ArrayList<Television>();
     /*
      * tv.txt파일의 데이터를 ArrayList에 저장하는 프로그램을 구현하시오.
      */
		try(BufferedReader br = new BufferedReader(new FileReader("src/java0412_collection/prob/tv.txt"))){
			String line;
			while((line = br.readLine()) != null) {
				String[] data = line.split(":");
				Television tv = new Television();
				tv.setRank(Integer.parseInt(data[0]));
				tv.setProgram(data[1]);
				tv.setChannel(data[2]);
				tv.setRating(Double.parseDouble(data[3]));
				aList.add(tv);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		prnDisplay(aList, "KBS1");

	}//end main()
	
	public static void prnDisplay(ArrayList<Television> aList, String channel){
		//channel매개변수에 해당하는 프로그램이 출력되도록 구현하시오.
		System.out.printf("[%s]\n",channel);
		for(Television tv: aList) {
			if(tv.getChannel().equals(channel)) {
				System.out.printf("%d  %s      %s   %.1f\n",
								tv.getRank(),
								tv.getProgram(),
								tv.getChannel(),
								tv.getRating());
			}
		}
	}//end prnDisplay()

}//end class

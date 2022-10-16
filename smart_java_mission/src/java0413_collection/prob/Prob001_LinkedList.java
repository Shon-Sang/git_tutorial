package java0413_collection.prob;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

/*
 * LinkedList
 * 1 List : 순서적으로 데이터를 저장
 * 2 Stack : LIFO
 * 3 Queue : FIFO
 */

public class Prob001_LinkedList {

	public static void main(String[] args) {
		/*
		 * booklist.txt파일의 데이터를 Stack으로 처리하여 출력되도록 
		 * 프로그램을 구현하시오.
		 *  title             	publisher   writer     price
		 	JSP Programming  	JSPPub     JSPExpert   21000
			Servlet Programming WeBBest 	GoodName	 20000
			JDBC Programming 	JDBCBest 	NaDo SQL 	30000
			SQL Fundmental 		SQLBest		 Na SQL 	47000
			Java Programming 	JavaBest	 Kim kava	 25000
		 */
		String fileName = "src/java0413_collection/prob/booklist.txt";
		LinkedList<String[]> nStack = new LinkedList<String[]>();
		try(Scanner sc = new Scanner(new File(fileName))){
			while(sc.hasNextLine()) {
				nStack.push(sc.nextLine().split("/"));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.printf("%s %30s %15s %15s\n","title","publisher","writer","price");
		while(!nStack.isEmpty()) {
			String[] data = nStack.pop();
			System.out.printf("%s %20s %15s %15s\n",data[0],data[1],data[2],data[3]);
		}
	}//end main()

}//end class












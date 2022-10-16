package java0412_collection.prob;

import java.util.ArrayList;


public class BookManager {
	public static int getRentalPrice(ArrayList<BookDTO> bookList, String kind) {
		// 구현하세요.
		int sum = 0;
		for(int i = 0; i<bookList.size(); i++) {
			if(bookList.get(i).getKind().equals(kind)) {
				sum += bookList.get(i).getRentalPrice();
			}
		}
		return sum;
	}//end getRentalPrice()
}//end class







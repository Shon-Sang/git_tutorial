package pinary_number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PinaryNumberMain {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PinaryNumber pinaryNumber = new PinaryNumber();
		
		//pinaryNumber.getAllNumber(0, new StringBuffer(), 3);
		
		
		pinaryNumber.getAllNumber02(0, "", Integer.parseInt(br.readLine()));
		System.out.println(pinaryNumber.getCount());
	}

}

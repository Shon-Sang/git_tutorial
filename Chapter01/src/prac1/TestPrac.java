package prac1;

import java.math.BigDecimal;
import java.util.regex.Pattern;

public class TestPrac {

	public static void main(String[] args) {
		BigDecimal a = BigDecimal.ZERO;
		for(int i = 1; i<=10; i++) {
			BigDecimal bd = new BigDecimal(i);
			System.out.println(a.add(bd));
			System.out.println(a.multiply(bd));
		}
		
		System.out.println(a);
		
		System.out.println("--정규식--");
		String str = "5. 저희 회사는 2007년에 설립되었습니다.";
		// "\S+ [가-힣]*\s\d+.*\."
		System.out.println(Pattern.matches("\\S+ [가-힣]*\\s\\d+.*\\.", str));
		
		boolean flag = true;
		try {
			Integer.parseInt("g");
		}catch(Exception e) {
			flag = false;
		}
		System.out.println("flag : " + flag);
	}

}

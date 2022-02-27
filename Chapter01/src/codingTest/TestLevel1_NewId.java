package codingTest;

public class TestLevel1_NewId {
	public String solution(String new_id) {
        String answer = "";
        answer = step1(new_id);
        answer = step2(answer);
        answer = step3(answer);
        answer = step4(answer);
        answer = step5(answer);
        answer = step6(answer);
        answer = step7(answer);
        return answer;
    }
	
	private String step1(String s) { // 대문자->소문자
		String result;
		StringBuilder sb = new StringBuilder();
		char buf;
		for(int i = 0; i < s.length(); i++) {
			buf = s.charAt(i);
			if(buf >= 'A' && buf <= 'Z') {
				buf += 32;
			}
			sb.append(buf);
		}
		result = sb.toString();
		return result;
	}
	
	private String step2(String s) {
		String result;
		StringBuilder sb = new StringBuilder();
		char buf;
		for(int i = 0; i < s.length(); i++) {
			buf = s.charAt(i);
			if(((buf>='0')&&(buf<='9')) || ((buf>='a')&&(buf<='z')) || (buf=='-')||(buf=='_')||(buf=='.')) {
				sb.append(buf);
			}else {
				continue;
			}
		}
		result = sb.toString();
		return result;
	}
	
	private String step3(String s) {
		String result = "";
		StringBuilder sb = new StringBuilder();
		char buf;		
		int dotCount = 0;
		for(int i = 0; i < s.length(); i++) {
			buf = s.charAt(i);
			
			if(buf == '.') {
				dotCount += 1;
			}
			else {
				dotCount = 0;
			}
			
			if(dotCount > 1) {
				continue;
			}
			sb.append(buf);
		}
		result = sb.toString();
		return result;
	}
	
	private String step4(String s) { // 문자열 처음이나 맨마지막이 '.' 이면 제거
		String result;
		StringBuilder sb = new StringBuilder();
		char buf;
		for(int i = 0; i < s.length(); i++) {
			buf = s.charAt(i);
			if( ((i == 0)||(i == s.length() - 1)) && (buf == '.') ) {
				continue;
			}
			else {
				sb.append(buf);
			}
		}
		result = sb.toString();
		return result;
	}
	
	private String step5(String s) {
		String result = "";
		StringBuilder sb = new StringBuilder(s);
		if( s.equals("")) {
			sb.append('a');
		}
//		for(char c: chArray) {
//			if( c == '\u0000') {
//				sb.append('a');
//			}
//			else {
//				sb.append(c);
//			}
//		}
		result = sb.toString();
		return result;
	}
	
	private String step6(String s) {
		String result = "";
		char[] chArray = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		if(s.length() > 15) {
			for(int i = 0; i < 15; i++) {
				if((i == 14) && (chArray[14] == '.')) {
					break;
				}
				else
				{
					sb.append(chArray[i]);
				}
			}
			result = sb.toString();
		}
		else {
			result = s;
		}
		
		return result;
	}
	
	private String step7(String s) { // 입력받은 문자열의 길이가 2 이하면 마지막 문자를 길이가 3이 될떄까지 반복해서 뒤에 붙임
		String result = "";
		StringBuilder sb = new StringBuilder(s);
//		char buf;
//		while(sb.length() <= 2) {
//			buf = s.charAt(s.length() - 1);
//			sb.append(buf);
//		}
		while(sb.length() <= 2) {
			sb.append(sb.charAt(sb.length() - 1));
		}
		result = sb.toString();
		return result;
	}
}

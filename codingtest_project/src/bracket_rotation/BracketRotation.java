package bracket_rotation;

public class BracketRotation {
	
	public BracketRotation() {
	}
	
	public int solution(String s) {
        int answer = 0;
        String buf;
        for(int i = 0; i<s.length(); i++) {
        	System.out.println("결과 : " + leftRotation(s, i));
        	buf = leftRotation(s, i);
        	if(bracketDecsion02(buf)) {
        		answer += 1;
        	}
        }
        
        return answer;
    }
	
	public String leftRotation(String str, int num) {
		
		StringBuffer sb = new StringBuffer(str);
		
		if(num == 0) {
			return str;
		}else {
			String buf;
			buf = sb.substring(0, num);
			sb.delete(0, num);
			sb.append(buf);
			
			return sb.toString();
		}
	}
	
	public boolean bracketDecsion(String str) {
		// 2번 검사해야함
		char[] charArr = str.toCharArray();
		int[] bracketDecNum = new int[3];
		
		for(int i = 0; i<str.length(); i++) {
			char ch = charArr[i];
			
			switch(ch) {
			case '[':
				bracketDecNum[0] += 1;
				break;
			case '(':
				bracketDecNum[1] += 1;
				break;
			case '{':
				bracketDecNum[2] += 1;
				break;
			case ']':
				bracketDecNum[0] -= 1;
				break;
			case ')':
				bracketDecNum[1] -= 1;
				break;
			case '}':
				bracketDecNum[2] -= 1;
				break;
			default:
				break;
			}
			
			for(int num : bracketDecNum) {
				if(num < 0) {
					return false;
				}
			}
		}
		
		for(int num : bracketDecNum) {
			if(num != 0) {
				return false;
			}
		}
		
		return true;
	}
	
	public boolean bracketDecsion02(String str) {
		StringBuffer sb = new StringBuffer(str);
		int num = 0;
		String[] bracketArr = {"{}", "[]", "()"};
		boolean bool = false;
		while(true) {
			bool = false;
			for(String bracket : bracketArr) {
				if((num = sb.indexOf(bracket)) != -1) {
					sb.replace(num, num + 2, "");
					bool = true;
				}
			}
			
			if(!bool) {
				break;
			}
			
//			if((num = sb.indexOf("{}")) != -1) {
//				//sb.delete(num, num + 2);
//				sb.replace(num, num + 2, "");
//			}else if((num = sb.indexOf("[]")) != -1) {
//				//sb.delete(num, num + 2);
//				sb.replace(num, num + 2, "");
//			}else if((num = sb.indexOf("()")) != -1) {
//				//sb.delete(num, num + 2);
//				sb.replace(num, num + 2, "");
//			}else {
//				break;
//			}
		}
		
		if(sb.toString().equals("")) {
			return true;
		}else {
			return false;
		}
	}
}

package correct_bracket;

import java.util.Stack;

public class CorrectBracket {
	
	// "()"를 ""로 바꿈
	// "" 혹은 "(" 혹은 ")" 가 남을 떄 까지 => 이 방법 안됨
	// 1개씩 조회해가면서 따져야함
	boolean solution(String s) {
        // 특수문자일 경우 정규식으로 써야함
//		 s = s.replaceAll("[()]", "");
		
//        while( !(s.equals("") || s.equals("(") || s.equals(")") || s.equals(")("))) {
////        	s = s.replace("()", "");
//        	s = s.replaceAll("[(][)]", "");
//        }
//        
//        if(s.equals("")) {
//        	return true;
//        }
		char[] bracketArr = s.toCharArray();
		int sum = 0;
		int bufInt;
		char bufChar;
		for(int i=0; i<bracketArr.length; i++) {
			bufChar = bracketArr[i];
			if( (i == 0 && bufChar == ')') || sum < 0) {
				return false;
			}
			bufInt = (bufChar == '(') ? 1 : -1;
			sum += bufInt;
		}
		
		if(sum != 0) return false;
		
        return true;
    }
	
	// Stack으로 풀기
	public boolean solution02(String s) {
		// '('일 경우 push, ')'일 경우 pop
		// 최종적으로 비어있지 않으면 false
		Stack<Character> stack = new Stack<Character>();
		char[] bracketArr = s.toCharArray();
		
		for(char bracket : bracketArr) {
			if(bracket == '(') {
				stack.push('(');
			}else {
				try {
					stack.pop();
				}catch(Exception e) { // 이미 비어있는데 pop을 할 경우가 발생할 수 있어서
					return false;
				}
			}
		}
		if(stack.isEmpty()) return true;
		return false;
	}
}

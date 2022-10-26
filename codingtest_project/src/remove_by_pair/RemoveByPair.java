package remove_by_pair;

import java.util.Stack;

public class RemoveByPair {
	public int solution(String s)
    {
        StringBuilder sb = new StringBuilder(s);
        int pos = 0;
        while(true) {
        	if(sb.length() == 0) {
        		return 1;
        	}
        	
        	if(pos < sb.length() - 1) {
	        	if(sb.charAt(pos) == sb.charAt(pos + 1)) {
	        		sb.delete(pos, pos + 2);
	        		if(pos != 0) {
	        			pos -= 1;
	        		}
	        		continue;
	        	}
	        	pos += 1;
        	}
        	else {
        		return 0;
        	}
        }
    }
	
	public int solution02(String s) {
		
		Stack<Character> stack = new Stack<Character>();
		//stack.push(s.charAt(0));
		
		for(int i = 0; i<s.length(); i++) {
			if(stack.isEmpty()) {
				stack.push(s.charAt(i));
				continue;
			}
			
			if(stack.peek() == s.charAt(i)) {
				stack.pop();
			}else {
				stack.push(s.charAt(i));
			}
		}
		
		if(stack.isEmpty()) {
			return 1;
		}else {
			return 0;
		}
	}
}

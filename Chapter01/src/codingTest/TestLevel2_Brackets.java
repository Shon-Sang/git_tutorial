package codingTest;

public class TestLevel2_Brackets {
	
	public String solution(String p) {
        String answer = solprac(p);
        
        return answer;
    }
	
	private String solprac(String s) {
		String input = s;
		String output = "";
		String u = "";
		String v = "";
		String recul = "";
		int rightnum = 0;
		StringBuilder sb = new StringBuilder();
		boolean rightcheck = true;
		
		if(input.equals("")) {
			output = input;
			return output;
		}
		else {
			
			for(int i = 0; i<input.length(); i++) {
				
				if(input.charAt(i) == '(') {
					rightnum += 1;
				}
				else if(input.charAt(i) == ')') {
					rightnum -= 1;
				}
				
				if(rightnum == 0 && rightcheck) { // 올바른 괄호 문자열
					u = input.substring(0, i+1);
					v = input.substring(i+1);
					recul = solprac(v); // 재귀
					sb.append(u);
					sb.append(recul);
					break;
				}
				else if(rightnum == 0 && !rightcheck) { // 올바른 괄호 문자열이 아님
					u = input.substring(0, i+1);
					sb.append("(");
					v = input.substring(i+1);
					recul = solprac(v); // 재귀
					sb.append(recul);
					sb.append(")");
					String tempstr = u.substring(1, u.length()-1);
					
//					String temprestr = "";
//					for(int j = tempstr.length() - 1; j >= 0; j--) {
//						temprestr += tempstr.charAt(j);
//					}
//					sb.append(temprestr);
					
					StringBuilder tempsb = new StringBuilder(tempstr);
					sb.append(tempsb.reverse().toString());
					
					break;
				}
				
				if(rightnum < 0) {
					rightcheck = false;
				}
				
			}
			
		}
		
		output = sb.toString();		
		return output;
	}
}

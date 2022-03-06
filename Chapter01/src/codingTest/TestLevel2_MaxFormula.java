package codingTest;

import java.util.ArrayList;

public class TestLevel2_MaxFormula {
	public long solution(String expression) {
        long answer = 0;
        answer = maxmaker(expression);
        return answer;
    }
	
	
	
	
	public String strTovalue(String formula, char oper) { // 수식, 우선순위연산자
		String result = "";
		String input = formula;
		StringBuilder numberSb = new StringBuilder();
		StringBuilder resultSb = new StringBuilder();
		int front = -1;
		int back = -1;
		
		for(int i = 0; i<input.length(); i++) {
			char c = input.charAt(i);
			
			if(c >= '0' && c <='9') { // 만약 숫자면
				numberSb.append(c);
			}
			else { // 숫자가 아니면
				// 우선순위 연산자인데 front에 값이 없을경우
				if(c == oper && front == -1) {
					front = Integer.parseInt(numberSb.toString());
					numberSb.setLength(0);
				}
				 // 우선순위 연산자가 아니고(혹은 우선순위문자이고) front에 값이 있을경우
				else if(front != -1) {
					String tempstr = numberSb.toString();
					if(!tempstr.equals("")) { //*-같은경우 제외하기위해
						back = Integer.parseInt(tempstr);
						int temp = 0;
						
						switch(oper) {
							case '+':
								temp = front + back;
								break;
							case '-':
								temp = front - back;
								break;
							case '*':
								temp = front * back;
								break;
							default:
								break;						
						}					
						if(c == oper) { // 우선순위 연산자일 경우
							front = temp;
						}else { // 우선순위 연산자가 아닐 경우
							front = -1;
							resultSb.append(temp);
							resultSb.append(c);
						}
						
						numberSb.setLength(0);
						back = -1;
					}
//					else {
//						resultSb.append(c);
//						numberSb.append(c);
//					}
//					back = -1;
					
				}
				// front에 값이 없고 우선순위 문자가 아님
				else {
					resultSb.append(numberSb.toString());
					resultSb.append(c);
					numberSb.setLength(0);
				}
			}
			
			if(i == input.length() - 1) { // 만약 마지막이면
				//그전에 front값이 존재하는지
				if(front != -1) { // front가 존재한다면
					back = Integer.parseInt(numberSb.toString());
					int temp = 0;
					
					switch(oper) {
						case '+':
							temp = front + back;
							break;
						case '-':
							temp = front - back;
							break;
						case '*':
							temp = front * back;
							break;
						default:
							break;						
					}
					resultSb.append(temp);
				}
				else {
					resultSb.append(numberSb.toString());
				}
			}
			
		}
		result = resultSb.toString();
		return result;
	}
	
	public int fomularesult(String formula, char[] operArr) { // 우선순위 연산자 배열을 넣어서 수식에서 값을 계산
		int result = 0;
		int arrNum = operArr.length;
		
		switch(arrNum) { // 연산자 배열
		case 1:
			result = Math.abs(Integer.parseInt(strTovalue(formula, operArr[0])));
			break;
		case 2:
			String temp1;
			temp1 = strTovalue(strTovalue(formula, operArr[0]), operArr[1]);
			result = Math.abs(Integer.parseInt(temp1));
			break;
		case 3:
			String temp2;
			temp2 = strTovalue(strTovalue(strTovalue(formula, operArr[0]), operArr[1]), operArr[2]);
			result = Math.abs(Integer.parseInt(temp2));
			break;
		default:
			break;
		}
		
		
		return result;
	}
	
	public char[][] operarrmaker(String formula){ // 연산자들의 우선순위의 모든경우의수 2차원배열 반환
		ArrayList<Character> charList = new ArrayList<Character>();
		char[][] result = null;
		if(formula.contains("+")) {
			charList.add('+');
		}
		if(formula.contains("-")) {
			charList.add('-');
		}
		if(formula.contains("*")) {
			charList.add('*');
		}
		
		int listNum = charList.size();
		switch(listNum) { // 팩토리얼 1!, 2!, 3!
			case 1:
				result = new char[1][1];
				result[0][0] = charList.get(0);
				break;
			case 2:
				result = new char[2][2];
				for(int i = 0; i<charList.size(); i++) {
					result[0][i] = charList.get(i);
					result[1][charList.size() - 1 - i] = charList.get(i);
				}
				break;
			case 3:
				result = new char[6][3];
				for(int i =0; i<result.length; i++) {
	
					int getnum;
					if(i<=2) {
						getnum = i;
						while(getnum >= charList.size()) {
							getnum -= charList.size();
						}
						result[i][0] = charList.get(getnum);
						
						getnum = i+1;
						while(getnum >= charList.size()) {
							getnum -= charList.size();
						}
						result[i][1] = charList.get(getnum);
						
						getnum = i+2;
						while(getnum >= charList.size()) {
							getnum -= charList.size();
						}
						result[i][2] = charList.get(getnum);
					}
					else { // i>2
						getnum = i;
						while(getnum >= charList.size()) {
							getnum -= charList.size();
						}
						result[i][0] = charList.get(getnum);
						
						getnum = i+1;
						while(getnum >= charList.size()) {
							getnum -= charList.size();
						}
						result[i][2] = charList.get(getnum);
						
						getnum = i+2;
						while(getnum >= charList.size()) {
							getnum -= charList.size();
						}
						result[i][1] = charList.get(getnum);
					}
				}
				break;
			default:
				break;
		}
		
		return result;
	}
	
	public int maxmaker(String formula) { // 최종 가장 큰값을 리턴
		int max = 0;
		char[][] operarr = operarrmaker(formula);
		for(char[] charr: operarr) {
			int temp;
			temp = fomularesult(formula, charr);
			if(max<temp) {
				max = temp;
			}
		}
		return max;
	}
}

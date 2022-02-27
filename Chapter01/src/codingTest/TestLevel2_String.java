package codingTest;

public class TestLevel2_String {
	
	private String[] resultArray;
	
	public int solution(String s) {
		int strLength = s.length() / 2; // 문자길이 모두 검사할 필요가 없음 100글자라 치면 50글자까지 겹치는거만 찾으면됨 51글자부턴 필요X
		String[] resultArr = new String[strLength];
		resultArray = resultArr;
		int min = 10001;
		int answer = 0;
		
		for(int i = 0; i < strLength; i++) { // 검색해서 만든 문자열들을 배열에 모두 넣음
			resultArr[i] = searchletter(s, i + 1);
			if(min > resultArr[i].length()) { // 문자열 length는 함수, 배열 length는 필드
				min = resultArr[i].length();
			}
		}
		// 문자열의 길이들을 비교해야함
		
        answer = min;
        return answer;
    }
	
	public String[] getResultArray() {
		return resultArray;
	}
	
	private String searchletter(String str, int cutNum) {
		String output ="";
		int len = str.length();
		StringBuilder sb = new StringBuilder(); // 문자열 잘라서 확인한 후 매칭된 숫자까지 합한 문자열
		int iter = 0;
		int matchNum = 1;
		String back = "";
		

		while(true) { // 자르기시작
			
			String front = str.substring(iter, iter + cutNum);
			len -= front.length(); // 마지막 비교를 위해
			
			if(len >= front.length()) { // 마지막에 자를수 있는 개수인지 확인해야함
				back = str.substring(iter + cutNum , iter + cutNum*2);
			}
			else {
				if(matchNum > 1) { // 계속 겹쳐왔으면서 마지막에는 글자수가 달라서 못겹치는 경우
					sb.append(Integer.toString(matchNum));
				}
				sb.append(front);
				sb.append(str.substring(iter + cutNum, str.length())); // 여기서 딱떨어질 경우도 해줌 즉 substring(10,10)같은경우 아무것도 없음
				break;
			}

			
			if(front.equals(back)) {
				matchNum += 1;				
			}
			else {
				
				if(matchNum < 2) {
					sb.append(front);
				}
				else {
					sb.append(Integer.toString(matchNum));
					sb.append(front);
				}
				matchNum = 1;
			}
			
			iter += cutNum;
			
//			if(iter >= str.length()) { // 딱 떨어질때
//				if(matchNum > 1) { // 마지막에 겹칠경우 2개씩 자를경우 "aaaaaa" 같은경우
//					sb.append(Integer.toString(matchNum));
//					sb.append(front);
//				}
//				break;
//			}
			
		}
		

		output = sb.toString();
		
		return output;
	}
}

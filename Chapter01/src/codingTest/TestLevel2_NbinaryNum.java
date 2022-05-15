package codingTest;

public class TestLevel2_NbinaryNum {
	
	public String solution(int n, int t, int m, int p) {
        String answer = "";
        int cntNum = 0; // 실제 늘어나는 수
        int peoNum = 0; // 사람의 차례
        int pointNum = 0;
        String digitNum;
        boolean check = false;
        StringBuffer sb = new StringBuffer();
        
        while(true) {
        	digitNum = convertDigit(cntNum, n);
        	for(int i = 0; i<digitNum.length(); i++) {
        		if(p == peoNum%m + 1) {
        			sb.append(digitNum.charAt(i));
        			pointNum++;
        		}
        		if(pointNum == t) {
        			check = true;
        			break;
        		}
        		
        		peoNum++;
        	}
        	if(check) {
        		break;
        	}
        	cntNum++;
        	
        }
        answer = sb.toString();
        return answer;
    }
	
	public String convertDigit(int input, int num) { // input 받은 수, num진수(num은 2이상 17미만)
		StringBuffer sb = new StringBuffer();
		char[] digits = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		int mok = input;
		int remain;
		if(mok == 0) {
			return "0";
		}
		
		while(mok != 0) {
			remain = mok%num;
			sb.append(digits[remain]);
			mok = mok/num;
		}
		
		return sb.reverse().toString();
	}
}

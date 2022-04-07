package codingTest;

public class TestLevel2_BinaryTransfer {
	public int[] solution(String s) {
        int[] answer = new int[2];
        int zeroCnt = 0;
        int binaryCnt = 0;
        String binaryNum = s;
        StringBuilder sb = new StringBuilder();
        
        while(!binaryNum.equals("1")) {
	        sb.append(binaryNum);
	        for(int i = 0; i<sb.length(); i++) {
	        	char c = sb.charAt(i);
	        	if(c == '0') {
	        		sb.deleteCharAt(i);
	        		zeroCnt += 1;
	        		i -= 1;
	        	}
	        }
	        
	        int number = sb.length();
	        binaryNum = binarymaker(number);
	        binaryCnt += 1;
	        sb.setLength(0);
        }
        answer[0] = binaryCnt;
        answer[1] = zeroCnt;
        return answer;
    }
	
	private String binarymaker(int number) {
		String result;
		int mok = number;
		int namu;
		char[] binaryChar = {'0', '1'};
		StringBuilder sbtemp = new StringBuilder();
		while(mok != 0) {
			
			namu = mok % 2;
			mok = mok / 2;
			sbtemp.append(binaryChar[namu]);
		}
		//String strTemp = sbtemp.toString();
//		char[] resultArr = new char[sbtemp.length()];
//		for(int i = 0, j = resultArr.length - 1; i<resultArr.length; i++) {
//			resultArr[i] = sbtemp.charAt(j);
//			j -= 1;
//		}
//		result = String.valueOf(resultArr);
		
		sbtemp.reverse();
		result = sbtemp.toString();
		
		return result;
	}
}

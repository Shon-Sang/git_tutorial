package binary_trans_repeat;

public class BinaryTransRepeat {
	private StringBuilder sb = new StringBuilder();
	private String[] hexaArr = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
	
	public int[] solution(String s) {
        int[] answer = new int[2];
        int bufLength;
        String str = s;
        int zeroCnt = 0;
        int whileCnt = 0;
        
        while(!str.equals("1")) {
	        for(char c : str.toCharArray()) {
	        	if(c == '1') {
	        		sb.append(c);
	        	}else {
	        		zeroCnt += 1;
	        	}
	        }
	        bufLength = sb.length();
	        sb.setLength(0);
	        str = makeBinary(bufLength);
	        whileCnt += 1;
        }
        
        answer[0] = whileCnt;
        answer[1] = zeroCnt;
        return answer;
    }
	
	// 2진수 만들어 주는 함수
	public String makeBinary(int number) {
		
		String ans;
		sb.append(number % 2);
		int mok = number / 2;
		
		while(mok != 0) {
			sb.append(mok % 2);
			mok = mok / 2;
		}
		sb.reverse();
		ans = sb.toString();
		sb.setLength(0);
		
		return ans;
	}
	
	// 16진수 만들어 주는 함수
	public String makeHexa(int number) {
		String ans;
		sb.append(hexaArr[number % 16]);
		int mok = number / 16;
		while(mok != 0 ) {
			sb.append(hexaArr[mok % 16]);
			mok = mok / 16;
		}
		sb.reverse();
		ans = sb.toString();
		sb.setLength(0);
		
		return ans;
	}
	
	// 엄청 짧음, 있는 함수 다 갖다 씀
	public int[] solution03(String s) {
        int[] answer = new int[2];
        int temp;
        while( !s.equals("1") ) {
            answer[1] += s.length();
            s = s.replaceAll("0", "");
            temp = s.length();
            s = Integer.toBinaryString(temp);
            //System.out.println("s : " + s ); 
            answer[0]++;
            answer[1] -= temp;
        }
        return answer;  
    }
}

package codingTest;

import java.util.ArrayList;

public class TestLevel2_NDigitPrimeNumber {
	public int solution(int n, int k) {
        int answer = -1;
        String[] digitChar = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
        StringBuffer sb = new StringBuffer();
        ArrayList<Integer> primeNumList = new ArrayList<Integer>();
        String kDigit;
        int mok = n;
        int remain = 0;
        while(mok != 0) {
        	remain = mok%k;
        	sb.append(remain);
        	mok /= k;
        }
        kDigit = sb.reverse().toString();
        System.out.println(kDigit);
        String[] dataArr = kDigit.split("0");
        for(String data: dataArr) {
        	if(data.equals("")) {
        		continue;
        	}
        	int num = Integer.parseInt(data);
        	if(primenumchek(num)) {
        		primeNumList.add(num);
        	}
        }
        answer = primeNumList.size();
        return answer;
    }
	
	public boolean primenumchek(int num) {
		if(num == 1) {
			return false;
		}
		for(int i = 2; i*i<= num; i++) {
			if(num%i == 0) {
				return false;
			}
		}
		return true;
	}
	
}

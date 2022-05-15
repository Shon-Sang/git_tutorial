package codingTest;

public class TestLevel2_MaximumMinmum {
	public String solution(String s) {
        String answer = "";
        
        String[] data = s.split(" ");
        int max = -999999;
        int min = 999999;
        
        for(String str: data) {
        	int num = Integer.parseInt(str);
        	if(max < num) {
        		max = num;
        	}
        	
        	if(min > num) {
        		min = num;
        	}
        }
        
        answer = String.format("%d %d", min, max);
        
        return answer;
    }
}

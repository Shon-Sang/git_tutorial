package codingTest;
import java.util.Stack;

public class TestLevel2_124Country {
    public String solution(int n) {
    	String[] matchNum = {"1", "2", "4"};
    	Stack<Integer> stack = new Stack<Integer>();
    	String answer = "";
    	//int input = n;
    	int q = n; // 몫
    	int r = 0; // 나머지
    	StringBuilder sb =new StringBuilder();
    	
    	while(q > 3) {
    		r = q % 3;
    		if(r == 0) { // 딱 나누어 떨어질때
    			q -= 3;
    			r = 3;
    			stack.push(r);
    		}
    		else 
    		{
    			stack.push(r);
    		}
    		q /= 3;
    	}
    	stack.push(q);
    	
    	while(!stack.empty()) {
    		sb.append(matchNum[stack.pop() - 1]);
    	}
    	
    	answer = sb.toString();
        // 반대로 10진수로 변환
    	int a = 1;
    	int b = 0;
    	int strNum = 0;
    	int sum = 0;
    	for(int i = answer.length() - 1; i >= 0; i--) { // 역순 곱하는 수(지수, 왼쪽으로 갈수록 많아짐 즉 인덱스가 낮을수록 많이곱함)
    		for(int j = 0; j < i; j++) {
    			a *= 3;
    		}
    		b = answer.charAt(strNum) - '0'; // 잘생각해야함 잘알아야하고 문자char는 단 1글자임 
    		if(b == 4) {
    			b = 3;
    		}
    		sum += a*b;
    		a = 1;
    		strNum += 1; // 위의 포문 지수때문에 정순으로 증가하는 변수필요 문자조회해야함
    	}
    	
    	System.out.println(sum);
        
        return answer;
    }
}

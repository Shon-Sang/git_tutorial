package codingTest;

public class TestLevel2_DeleteTwin {
	
	public int solution(String s)
    {
        int answer = -1;
        
        StringBuilder sb = new StringBuilder();
        String str = s;
        char front;
        char back;
        boolean check = true;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        //System.out.println("Hello Java");
        
        while(check) {
        	check = false;
        	for(int i = 0; i < str.length() - 1; i++) {
        		
        		front = str.charAt(i);
        		back = str.charAt(i+1);
        		
        		if(front == back) { // 일치할때
        			i += 1;
        			check = true; // 한번이라도 같은적이있으면 다음번에도 확인
        		}
        		else if(front != back) { //일치하지 않을때
        			sb.append(front);
        		}
        		else if((front != back) && (i == str.length() - 2)) { // 일치하지않는데 가장 마지막일때
        			sb.append(front);
        			sb.append(back);
        		}       		
        	}
        	str = sb.toString(); // 바뀐걸로 확인해야함
        	sb.setLength(0); // sb 객체 초기화
        }
        
        if(str.equals("")) {
        	answer = 1;
        }
        else {
        	answer = 0;
        }
        
        return answer;
    }
}

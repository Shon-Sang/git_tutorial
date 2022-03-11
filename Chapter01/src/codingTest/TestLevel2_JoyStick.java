package codingTest;

public class TestLevel2_JoyStick {
	
	
	public int solution(String name) {
        int answer = 0;
        
        String okName = name;
        StringBuilder sb = new StringBuilder();
        String compName = "";
        
        for(int i = 0; i<okName.length(); i++) {
        	sb.append('A');
        }
        
        compName = sb.toString();
        
        int result1 = makeResult(sb, okName, compName, '-');
        
        sb.setLength(0);
        sb.append(compName);        
        int result2 = makeResult(sb, okName, compName, '+');
        
        if(result1 < result2) {
        	answer = result1;
        	return answer;
        }
        
        answer = result2;       
        return answer;
    }
	
	private int makeResult(StringBuilder sb, String okName, String compName, char direct) {
		String compNametemp = compName;
		
		if(direct == '+') {
			int letterPos = 0;
	        int count = 0;
	        
	        while(!okName.equals(compNametemp)) {
	        	char ok = okName.charAt(letterPos); 
	        	char comp = compNametemp.charAt(letterPos); // 'A'
	        	if(!(ok == comp)) {
	        		int dif = ok - comp;
	        		if(dif <= 13) {
	        			count += dif;
	        		}
	        		else if(dif > 13) {
	        			count += (26 - dif);
	        		}
	        		sb.setCharAt(letterPos, (char)(comp + dif));
	        		
	        	}
	        	letterPos += 1;
	        	count += 1;
	        	
	        	compNametemp = sb.toString();
	        }
	        count -= 1; // letterPos에서 1번 증가해서
	        
	        return count;
		}
		else if(direct == '-') {
			int letterPos = 0;
	        int count = 0;
	        
	        while(!okName.equals(compNametemp)) {
	        	if(letterPos < 0) {
	        		letterPos = okName.length() + letterPos; // 우항의 letterPos는 음수임
	        	}
	        	char ok = okName.charAt(letterPos); 
	        	char comp = compNametemp.charAt(letterPos); // 'A'
	        	if(!(ok == comp)) {
	        		int dif = ok - comp;
	        		if(dif <= 13) {
	        			count += dif;
	        		}
	        		else if(dif > 13) {
	        			count += (26 - dif);
	        		}
	        		sb.setCharAt(letterPos, (char)(comp + dif));
	        		
	        	}
	        	letterPos -= 1;
	        	count += 1;
	        	
	        	compNametemp = sb.toString();
	        }
	        count -= 1; // letterPos에서 1번 증가해서
	        
	        return count;
		}
		
		return 0;
	}
}

package codingTest;

public class TestLevel2_SkillTree {
	public int solution(String skill, String[] skill_trees) {
        int answer;
        int count = 0;
        
        for(String skt: skill_trees) {
        	int index = 0;
        	boolean check = true; // true면 해당스킬트리는 안되는거임
        	
        	for(int i = 0; i<skill.length(); i++) { // skill의 문자 길이만큼
        		char skillChar = skill.charAt(i);
        		for(int j = 0; j<skt.length(); j++) { // skt의 문자 길이만큼
        			char sktChar = skt.charAt(j);
        			
        			if(skillChar == sktChar) {
        				if(index <= j) { // '=' 붙인이유는 index의 초기값이 0이기때문
        					index = j;
        					check = false;
        					break;
        				}
        				else {
        					check = true;
        					break;
        				}
        			}
        			
        		}
        		if(check) { // 한번도 같은게 없었을 경우, 선행스킬을 안배우고 후행스킬을 배우려고 했을경우
        			break;
        		}        		
        	}
        	
        	if(!check) {
        		count += 1;
        	}
        }
        answer = count;
        return answer;
    }
}

package codingTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestLevel2_Openchat {
	
    public String[] solution(String[] record) {
        String[] answer;
        Map<String, String> idnameMap = new HashMap<>();
        List<String[]> kelcList = new ArrayList<>();
        
        
        answer = new String[mapset_listmaker(record, idnameMap, kelcList)];
        
        make_result(kelcList, idnameMap, answer);
        
        
        
        return answer;
        
    }
    
    private int mapset_listmaker(String[] input, Map<String, String> map, List<String[]> list) {
    	int resultarrNum = 0;
    	String[] tempstr;
    	String[] setlist; // 여기다가 new String[2] 하면 안됨 모두 같은주소에 값넣고 다시 리스트에넣기에 리스트는 다 이 주소만 가리키는거
    	for(String s: input) {
    		tempstr = s.split(" ");
    		
    		switch(tempstr[0]) {
    		
    		case "Enter":
    			map.put(tempstr[1], tempstr[2]); // Key, Value
    			setlist = new String[2];
    			setlist[0] = "Enter";
    			setlist[1] = tempstr[1];
    			list.add(setlist); // "Enter", Key
    			resultarrNum += 1;
    			break;
    			
    		case "Leave":
    			if(map.containsKey(tempstr[1])) { // 해당 키가 있다면
    				setlist = new String[2];
    				setlist[0] = "Leave";
    				setlist[1] = tempstr[1];
    				list.add(setlist);
    				resultarrNum += 1;
    			}
    			break;
    			
    		case "Change": // 키값만 바꾸는거
    			if(map.containsKey(tempstr[1])) { //키가 없다면 바꿀필요가 없음
    				map.put(tempstr[1], tempstr[2]);
    			}
    			break;
    			
    		default:
    			break;
    		}
    	}
    	
    	
    	return resultarrNum;
    }
    
    private void make_result(List<String[]> list, Map<String,String> map, String[] arr) {
    	String temp;
    	for(int i =0; i<list.size(); i++) {
    		if(list.get(i)[0] == "Enter"){
    			temp = String.format("\"%s님이 들어왔습니다.\"", map.get(list.get(i)[1]) );
    			arr[i] = temp;
    		}
    		else // "Leave"
    		{
    			temp = String.format("\"%s님이 나갔습니다.\"", map.get(list.get(i)[1]) );
    			arr[i] = temp;
    		}
    	}
    }
}

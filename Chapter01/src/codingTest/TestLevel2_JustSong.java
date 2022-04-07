package codingTest;

import java.util.HashMap;
import java.util.Map.Entry;

public class TestLevel2_JustSong {
	public String solution(String m, String[] musicinfos) {
        String answer = "";
        StringBuffer sb = new StringBuffer();
     // Map을 이용해서 key(가중치 Integer) value(제목 String)
        HashMap<Integer, String> ansproMap = new HashMap<Integer, String>();
        boolean keyChk = false;
        for(String info: musicinfos) {
        	String[] infoArr = info.split(",");
        	String music = infoArr[3];
        	for(int i = 0, j = 0; i<replaytime(infoArr[0], infoArr[1]); i++) {
        		if((i % music.length() == 0) && (i != 0)) {
        			j -= music.length();
        		}
        		sb.append(music.charAt(j));
        		j += 1;
        	}
        	if(sb.toString().contains(m)) {
        		if(music.contains(m)) {
        			ansproMap.put(2, infoArr[2]);
        			keyChk = true;
        		}
        		else {
        			ansproMap.put(1, infoArr[2]);
        		}
        	}
        	sb.setLength(0);
        }
        
        if(keyChk) {
        	answer = ansproMap.get(2);
        }else {
        	answer = ansproMap.get(1);
        }
        
        return answer;
        
        
        // Map을 이용해서 key(제목 String) value(가중치 int)
//        HashMap<String, Integer> ansproMap = new HashMap<String, Integer>();
//        for(String info: musicinfos) {
//        	String[] infoArr = info.split(",");
//        	String music = infoArr[3];
//        	for(int i = 0, j = 0; i<replaytime(infoArr[0], infoArr[1]); i++) {
//        		if((i % music.length() == 0) && (i != 0)) {
//        			j -= music.length();
//        		}
//        		sb.append(music.charAt(j));
//        		j += 1;
//        	}
//        	if(sb.toString().contains(m)) {
//        		if(music.contains(m)) {
//        			ansproMap.put(infoArr[2], 2);
//        		}
//        		else {
//        			ansproMap.put(infoArr[2], 1);
//        		}
//        	}
//        	sb.setLength(0);
//        }
//        
//        String ansKey = "";
//        for(Entry<String, Integer> entry : ansproMap.entrySet()) {
//        	if(entry.getValue() == 2) {
//        		answer = entry.getKey();
//        		return answer;
//        	}
//        	
//        	if(entry.getValue() == 1) {
//        		ansKey = entry.getKey();
//        	}
//        }
//        
//        answer = ansKey;
//        return answer;
    }
	
	public int replaytime(String sTime, String eTime) {
		int startTime, endTime;
		String[] temp;
		temp = sTime.split(":");
		startTime = Integer.parseInt(temp[0])*60 + Integer.parseInt(temp[1]);
		
		temp = eTime.split(":");
		endTime = Integer.parseInt(temp[0])*60 + Integer.parseInt(temp[1]);
		
		return endTime - startTime;
	}
}

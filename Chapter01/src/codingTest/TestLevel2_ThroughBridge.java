package codingTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TestLevel2_ThroughBridge {
	public int solution(int bridge_length, int weight, int[] truck_weights) {
		
        int answer = 0;
        int bridgeMaxWeight = weight;
        int bridgeMaxTruck = bridge_length;
        int[][] truckInfo = new int[truck_weights.length][2]; // 무게,시간
        Queue<int[]> infoQue = new LinkedList<int[]>();
        ArrayList<int[]> onBridgeList = new ArrayList<int[]>(); // 다리위에 있는중 리스트
        ArrayList<int[]> offBridgeList = new ArrayList<int[]>(); // 다리 벗어난 결과리스트
        int count = 0;
        
        for(int i = 0; i<truckInfo.length; i++) {
        	truckInfo[i][0] = truck_weights[i]; // 무게
        	truckInfo[i][1] = 0; // 거리
        	infoQue.offer(truckInfo[i]);
        }
        
        while(offBridgeList.size() < truck_weights.length) {
        	
        	// 다리위에 있는 트럭들의 건너는 시간 추가
        	for(int i = 0; i<onBridgeList.size(); i++) {
        		int[] info = onBridgeList.get(i);
        		info[1] += 1;
        		onBridgeList.set(i, info);
        	}
        	
        	// 다리위에 트럭을 추가하는 코드
        	if(!infoQue.isEmpty()) { // 큐가 비어있지 않다면
	        	if(onBridgeList.size() <= bridgeMaxTruck) { // 다리위의 다리의 최대 수량 트럭보다 낮거나 같다면
	        		int nowBridgeWeight = 0;
	        		for(int[] info: onBridgeList) {
	        			nowBridgeWeight += info[0];
	        		}
	        		if(nowBridgeWeight <= bridgeMaxWeight) { // 최대 무게보다 낮다면
	        			onBridgeList.add(infoQue.poll()); // 큐에서 값을 꺼냄
	        		}
	        	}
        	}
        	
//        	// 다리위에 있는 트럭들의 건너는 시간 추가
//        	for(int i = 0; i<onBridgeList.size(); i++) {
//        		int[] info = onBridgeList.get(i);
//        		info[1] += 1;
//        		onBridgeList.set(i, info);
//        	}
        	
        	// 다리를 다건넜을때 1대씩 추가       	
    		if(onBridgeList.get(0)[1] == bridgeMaxTruck) {
    			offBridgeList.add(onBridgeList.get(0));
    			onBridgeList.remove(0);
    		}
        	
        	count += 1;
        }
        
        answer = count;
        return answer;
    }
}

package install_base_station;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InstallBaseStation {
	// https://school.programmers.co.kr/learn/courses/30/lessons/12979
	// 1. 현재 기지국 상태 배열을 만듬 (boolean[] stationArr) 실제로 해보니 생각좀 해야함
	// -전파 닿는 곳은 true, 안 닿는 곳은 false
	
	// 2. 전파 안 닿는곳의 연속하는 곳의 개수를 담은 리스트 생성(ArrayList<Integer> noSingalNumList)
	// -stationArr을 처음부터 조회하면서 false면 cnt(초기값 0) 1 증가
	// -true면 그냥 넘어감
	// -true이고 cnt가 0이 아니라면 리스트에 값 저장 후 cnt 0으로 초기화
	
	// 3. noSingalNumList를 모두 조회하면서 각 엘리먼트의 몫을 계속 합해줌(이 합한 값이 최종 리턴값)
	// -나머지가 0(나누어 떨어진다)이면 몫 값 그대로 합
	// -나머지가 존재하면 몫 값 + 1 을 합
	
	public int solution(int n, int[] stations, int w) {
        int answer = 0;
        boolean[] stationArr = new boolean[n];
        List<Integer> noSignalNumList = new ArrayList<Integer>();
        
        transStateStaitionArr(stationArr, stations, noSignalNumList, w);
//        System.out.println(noSignalNumList);
        
        makeNoSignalNumList(noSignalNumList, stationArr);
        answer = buildStationNumber(noSignalNumList, w);
        
//        System.out.println(Arrays.toString(stationArr));
//        
//        System.out.println(0%10);

        return answer;
    }
	
	public void transStateStaitionArr(boolean[] arr, int[] stations, List<Integer> list, int w) {
		int buf = 0;
//		int cnt = 0;
//		int stationFInalNumber = stations[stations.length - 1];
		
		for(int station : stations) {
			buf = station - 1;
			
			for(int i = buf - w; i<=buf + w; i++) {
				try {
					arr[i] = true;
				}catch(Exception e) {
					continue;
				}
			}
			
		}
	}
	
	public void makeNoSignalNumList(List<Integer> list, boolean[] arr) {
		int cnt = 0;
		boolean chk = false;
		
		for(int i = 0; i<arr.length; i++) {
			chk = arr[i];
			
			if(!chk) { // i == arr.length - 1 else if로 하면 여기서 걸려서 끝남
				cnt += 1;
			}else if(chk && cnt != 0) {
				list.add(cnt);
				cnt = 0;
			}
		}
		list.add(cnt);
		
	}
	
	public int buildStationNumber(List<Integer> list, int w) {
		int cnt = 0;
		int len = w*2 + 1;
		
		for(int n : list) {
			if(n % len == 0) {
				cnt += n/len;
			}else {
				cnt += n/len + 1;
			}
		}
		return cnt;
	}
	
	public int solution02(int n, int[] stations, int w) {
		int start = 1; // 시작 좌표
		int length = 0; // 전파가 닿지 않는 길이(기지국이 필요한 곳들)
		int stationCNT = 0; // 설치해야할 기지국 개수
		int stationLength = w*2 + 1; // 기지국의 범위
		int finalLength = 0; // 마지막 길이 확인용
		
		for(int station : stations) {
			// start가 그냥 stations의 범위보다 작을 때
			// w 부분이 겹칠 경우, 첫 기지국 전파가 초과할 때 start 가 더 큰 경우임
			if(start < station - w) {
				length = station - w - start;
				if(length % stationLength == 0) {
					stationCNT += length/stationLength;
				}else {
					stationCNT += length/stationLength + 1;
				}
			}
			
			// 너무 복잡하고 제대로 동작안함 특히 w부분이 겹칠 떄 안됨
//			length = station - w - start;
//			// 처음음 음수이면 안됨, 그 이후 음수인건 겹친다는 뜻이라서 음수여도 ㄱㅊ음 어차피 0나옴
//			if(length < 0 && start == 1) {
//				continue;
//			}
//			else {
//				if(length % stationLength > 0) { // 나머지 존재
//					stationCNT += length / stationLength + 1;
//				}else {
//					stationCNT += length / stationLength;
//				}
//			}
//			start = station + w + 1;
		}
		
		//만약 마지막 station에서 오른쪽도 기지국이 필요할 경우
		finalLength = n - start + 1;// 오른쪽 길이
		if(finalLength > 0) {
			if(finalLength % stationLength > 0) {
				stationCNT += finalLength / stationLength + 1;
			}else {
				stationCNT += finalLength / stationLength;
			}
		}
		return stationCNT;
	}
}

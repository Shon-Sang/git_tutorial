package install_base_station;

public class InstallBaseStation {
	// 1. 현재 기지국 상태 배열을 만듬 (boolean[] stationArr)
	// -전파 닿는 곳은 false, 안 닿는 곳은 true
	
	// 2. 전파 안 닿는곳의 연속하는 곳의 개수를 같은 리스트 생성(ArrayList<Integer> noSingalNumList)
	// -stationArr을 처음부터 조회하면서 true면 cnt(초기값 0) 1 증가
	// -false면 그냥 넘어감
	// -false이고 cnt가 0이 아니라면 리스트에 값저장 후 cnt 0으로 초기화
	
	// 3. noSingalNumList를 모두 조회하면서 각 엘리먼트의 몫을 계속 합해줌(이 합한 값이 최종 리턴값)
	// -나머지가 0(나누어 떨어진다)이면 몫 값 그대로 합
	// -나머지가 존재하면 몫 값 + 1 을 합
	
	public int solution(int n, int[] stations, int w) {
        int answer = 0;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}

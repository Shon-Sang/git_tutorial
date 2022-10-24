package hanoi_tower;

import java.util.ArrayList;
import java.util.Arrays;

public class HanoiTower {
	// 원반개수, 시작기둥, 보조기등, 도착기둥
	// 시작기둥의 원반개수가 1개면 바로 도착기둥으로 옮길 수 있음
	// 원반개수가 2개 이상일 때
	// 시작기둥 -> 보조기둥 (그 전 원반을 이동)
	// 시작기둥 -> 도착기둥 (재귀 X, 실제 움직임)
	// 보조기둥 -> 도착기둥 (그 전 원반을 이동)
	public int[][] solution(int n) {
        
        ArrayList<Integer[]> list = new ArrayList<Integer[]>();
        hanoi(n, 1, 2, 3, list);
        int[][] answer = new int[list.size()][2];
        int idx = 0;
        for(Integer[] arr : list) {
        	System.out.printf("%s ", Arrays.toString(arr));
        	answer[idx][0] = arr[0];
        	answer[idx][1] = arr[1];
        	idx += 1;
        }
//        System.out.println();
//        for(int[] arr : answer) {
//        	System.out.print(Arrays.toString(arr) + " ");
//        }
        return answer;
    }
	
	public void moveDiscus(int n, int start, int end, ArrayList<Integer[]> list) {
		Integer[] buf = new Integer[2];
		buf[0] = start;
		buf[1] = end;
		list.add(buf);
		//System.out.printf("%d번 원반을 %d에서 %d으로 옮깁니다.\n", n, start, end);
	}
	
	public void hanoi(int n, int start, int step, int end, ArrayList<Integer[]> list) {
		
		if(n <= 1) {
			moveDiscus(1, start, end, list);
			return;
		}
		
		hanoi(n - 1, start, end, step, list);
		
		moveDiscus(n, start, end, list);
		
		hanoi(n - 1, step, start, end, list);
	}
}

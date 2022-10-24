package carpet;

import java.util.ArrayList;

public class Carpet {
	// 1. yellow의 약수 집합을 구함 (2차원 리스트[배열] 사용)
	// 24의 경우 (1,2,3,4,6,8,12,24) 이므로 (1,24) , (2,12) , (3,8) , (4,6) 이런식으로
	// 2. list를 모두 순회 하면서 각 원소의 ((0 idx + 2)*(1 idx + 2) - yellow 값이 brown 값이랑 일치하면 해당 배열이 정답
	// 카펫의 가로 세로 크기를 반환(가로가 더 길거나 같음)
	public int[] solution(int brown, int yellow) {
		int[] answer = {};
		ArrayList<int[]> list = new ArrayList<int[]>();
		for(int i = 1; i*i <= yellow; i++) {
			if(yellow % i == 0) {
				int[] buf = new int[2];
				if(i*i == yellow) {
					buf[0] = i;
					buf[1] = i;
				}else {
					buf[0] = yellow/i;
					buf[1] = i;
				}
				list.add(buf);
			}
		}
		
		for(int[] arr: list) {
			if((arr[0]+2)*(arr[1]+2) - yellow == brown) {
				arr[0] += 2;
				arr[1] += 2;
				answer = arr;
				break;
			}
		}
        
        return answer;
    }
}

package codingTest;

public class TestLevel2_TargetNumber {
	private int count;
	//모두 더해서 그거보다 낮거나 같은지 계속 확인
	public int solution(int[] numbers, int target) {
        int answer = 0;
        
        int[] arr = numbers.clone();
        count = 0;
        int comparision = 0;
        
        comparision = arr[0];
        
        solfunc(arr, target, count, comparision, ' ', 1);
        solfunc(arr, target, count, comparision* -1, ' ', 1);
        
        comparision = arr[arr.length - 1];
        solfuncreverse(arr, target, count, comparision, ' ', arr.length - 2);
        solfuncreverse(arr, target, count, comparision* -1, ' ', arr.length - 2);
        
//        for(int i = 1; i<=arr.length; i++) {
//        	if((comparision == target) && (i == arr.length)) {
//        		count += 1;
//        	}
//        	else if(comparision > target) {
//        		comparision -= arr[i];
//        	}
//        	else if(comparision < target) {
//        		comparision += arr[i];
//        	}
//        	else if(comparision == target) {
//        		solfunc(arr, target, count, comparision, '-', i);
//        		solfunc(arr, target, count, comparision, '+', i);
//        	}
//        }
        
        answer = count;
               
        return answer;
    }
	
	private void solfunc(int[] arr, int tgt, int cnt, int comp, char si, int now_idx) {
		int target = tgt;
		count = cnt;
		int comparision = comp;
		char sign = si;
		
		
		for(int i = now_idx; i<=arr.length; i++) {
        	if((comparision == target) && (i == arr.length)) {
        		count += 1;
        	}
        	else if(i == arr.length) {
        		break;
        	}
        	else if(comparision > target || sign == '-') {
        		comparision -= arr[i];
        		sign = ' ';
        	}
        	else if(comparision < target || sign == '+') {
        		comparision += arr[i];
        		sign = ' ';
        	}
        	else if(comparision == target) {
        		solfunc(arr, target, count, comparision, '-', i);
        		solfunc(arr, target, count, comparision, '+', i);
        		break;
        	}
        }
		
	}
	
	private void solfuncreverse(int[] arr, int tgt, int cnt, int comp, char si, int now_idx) {
		int target = tgt;
		count = cnt;
		int comparision = comp;
		char sign = si;
		
		for(int i = now_idx; i >= -1; i--) {
        	if((comparision == target) && (i == -1)) {
        		count += 1;
        	}
        	else if(i == -1) {
        		break;
        	}
        	else if(comparision > target || sign == '-') {
        		comparision -= arr[i];
        		sign = ' ';
        	}
        	else if(comparision < target || sign == '+') {
        		comparision += arr[i];
        		sign = ' ';
        	}
        	else if(comparision == target) {
        		solfuncreverse(arr, target, count, comparision, '-', i);
        		solfuncreverse(arr, target, count, comparision, '+', i);
        		break;
        	}
        }
	}

	
}

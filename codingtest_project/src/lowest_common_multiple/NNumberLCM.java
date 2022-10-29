package lowest_common_multiple;

import java.util.Arrays;
import java.util.Stack;

public class NNumberLCM {
	public int solution(int[] arr) {
        int answer = 1;
        int len = arr.length;
        boolean chk = true;
        int trueCnt = 0;
        Arrays.sort(arr);
        
        while(chk) {
        	int[] copyArr = new int[len];
        	
        	for(int i = 2; i*i<=arr[len - 1]; i++) {
        		trueCnt = 0;
        		for(int j = 0; j<len; j++) {
        			if(arr[j] % i == 0) {
        				copyArr[j] = arr[j] / i;
        				trueCnt += 1;
        			}else {
        				copyArr[j] = arr[j];
        			}
        		}
        		if(trueCnt > 1) {
        			answer *= i;
        			arr = copyArr;
        			Arrays.sort(arr);
        			chk = true;
        			break;
        		}
        		chk = false;
        	}
        	
        	if(!chk) {
        		for(int p = len - 1; p >= 0; p--) {
        			if(arr[p] == 1) {
        				continue;
        			}
        			trueCnt = 0;
        			for(int q = 0; q < len; q++) {
        				if(arr[q] == 1) {
            				continue;
            			}
        				
        				if(arr[q] % arr[p] == 0) {
        					copyArr[q] = arr[q] / arr[p];
        					trueCnt += 1;
        				}
        				else {
        					copyArr[q] = arr[q];
        				}
        			}
        			if(trueCnt > 1) {
        				answer *= arr[p];
        				arr = copyArr;
        				Arrays.sort(arr);
        				chk = true;
        				break;
        			}
        		}
        	}
        	
        	if(!chk || arr[len - 1] < 4) {
        		for(int e : arr) {
        			answer *= e;
        		}
        		break;
        	}
        }
        
        return answer;
    }
	
	
	public int solution02(int[] arr) {
		int num1 = 0;
		int num2 = 0;
		Stack<Integer> stack = new Stack<Integer>();
		for(int e : arr) {
			stack.push(e);
		}
		while(stack.size() >= 2) {
			num1 = stack.pop();
			num2 = stack.pop();
			stack.push(getLCM(num1, num2));
		}
		return stack.pop();
	}
	
	public int getGCD(int num1, int num2) {
		
		int ans = 1;
		boolean chk = true;
		int[] arr = {num1, num2};
		Arrays.sort(arr);
		
		while(chk) {
			
			if(arr[1] % arr[0] == 0) {
				ans *= arr[0];
				break;
			}
			
			for(int i = 2; i * i <= arr[1]; i++) {
				if(arr[0] % i == 0 && arr[1] % i == 0) {
					arr[0] = arr[0] / i;
					arr[1] = arr[1] / i;
					ans *= i;
					Arrays.sort(arr);
					chk = true;
					break;
				}
				chk = false;
			}
			
			if(arr[1] < 4) {
				if(arr[0] == arr[1]) {
					if(arr[0] == 2) {
						ans *= 2;
					}else if(arr[0] == 3) {
						ans *= 3;
					}
				}
				break;
			}
		}
		return ans;
	}
	
	public int getLCM(int num1, int num2) {
		return (num1 * num2) / getGCD(num1, num2);
	}
}

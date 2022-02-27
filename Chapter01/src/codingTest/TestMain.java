package codingTest;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String str = "ABCDEFG"; 
//		String result1 = str.substring(str.length()-3, str.length());
//		System.out.println("str: " + str);
//		System.out.println("strCut: " + (str.substring(str.length()-3, str.length())) );
		
		
//		TestLevel1_Lotto test = new TestLevel1_Lotto();
//		
//		int[] lottos = {20, 9, 3, 45, 4, 35};
//		int[] win_nums = {20, 9, 3, 45, 4, 35};
//		int[] result;
//		result = test.Solution(lottos, win_nums);
//		System.out.print("[");
//		for(int r: result) {
//			System.out.print(r + " ");
//		}
//		System.out.print("]");
		
//		TestLevel2_String test2 = new TestLevel2_String();
//		int minLength = 0;
//		minLength = test2.solution("cccccc"); // 2a2ba3c
//		
//		System.out.println("result : " + minLength);
//		
//		int num = 1;
//		for(String st : test2.getResultArray()) {
//			System.out.println(num + "개씩 잘랐을 때 " +"[" + st + "], 길이 : " + st.length());
//			num += 1;
//		}
		
//		TestLevel1_NewId test3 = new TestLevel1_NewId();
//		System.out.println(test3.solution("abcdefghijklmn.p"));
		
//		TestLevel2_Progress test4 = new TestLevel2_Progress();
//		int[] progress = {95, 90, 99, 99, 80, 99};
//		int[] speeds = {1, 1, 1, 1, 1, 1};
//		int[] result = test4.solution(progress, speeds);
//		System.out.print("[");
//		for(int n: result) {
//			System.out.print(n+" ");
//		}
//		System.out.print("]");
//		System.out.println();
//		System.out.print("[");
//		for(int i: progress) {
//			System.out.print(i+" ");
//		}
//		System.out.print("]");
		
//		TestLevel2_124Country test5 = new TestLevel2_124Country();
//		int input;
//		input = 568501001;
//		String result;
//		result = test5.solution(input);
//		System.out.println(input + " -> " + result);
		
//		TestLevel2_Openchat test6 = new TestLevel2_Openchat();
//		String[] input = {"Enter uid1234 Muzi", "Enter uid4567 Prodo",
//				"Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
//		String[] result = test6.solution(input);
//		System.out.print("[");
//		for(int i = 0; i<result.length; i++) {
//			System.out.print(result[i]);
//			if(!(i == result.length - 1)) {
//				System.out.print(", ");
//			}
//		}
//		System.out.print("]");
		
//		int[] input = {1, 2, 3, 9, 10, 12};
//		int result;
//		TestLevel2_Hot test7 = new TestLevel2_Hot();
//		result = test7.solution(input, 1000);
//		System.out.println(result);
		
		
		int[] input = {4, 1, 2, 1};
		TestLevel2_TargetNumber test8 = new TestLevel2_TargetNumber();
		System.out.println(test8.solution(input, 4));
	}

}

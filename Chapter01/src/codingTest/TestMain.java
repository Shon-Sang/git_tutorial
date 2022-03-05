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
		
		
//		int[] input = {4, 1, 2, 1};
//		TestLevel2_TargetNumber test8 = new TestLevel2_TargetNumber();
//		System.out.println(test8.solution(input, 4));
		
//		TestLevel2_DeleteTwin test9 = new TestLevel2_DeleteTwin();
//		String input = "dccdcddc";
//		System.out.println(test9.solution(input));
		
//		//int[][] queries = {{2,2,5,4},{3,3,6,6},{5,1,6,3}};
//		int[][] queries = {{1,1,2,2},{1,2,2,3},{2,1,3,2},{2,2,3,3}};
//		//int[][] queries = {{1, 1, 100, 97}};
//		int[] result;
//		TestLevel2_EdgeRotation test10 = new TestLevel2_EdgeRotation();
//		result = test10.solution(3, 3, queries);
//		
//		for(int r : result) {
//			System.out.print(r + " ");
//		}
		
//		TestLevel2_MenuRenewal test11 = new TestLevel2_MenuRenewal();
//		String[] orders = {"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"};
//		int[] course = {2, 3, 5};
//		String[] result;
//		result = test11.solution(orders, course);
//		for(String s: result) {
//			System.out.print(s + " ");
//		}
		
//		TestLevel2_PhoneNumberList test12 = new TestLevel2_PhoneNumberList();
//		String[] input = {"12","123","1235","567","88"};
//		System.out.println(test12.solution(input));
		
//		TestLevel2_Brackets test13 = new TestLevel2_Brackets();
//		String input = "()))((()";
//		System.out.println(test13.solution(input));
		
//		TestLevel2_NewClustering test14 = new TestLevel2_NewClustering();
//		String str1 = "aa1+aa2"; // => aa a1 1+ +a aa a2 => aa  aa 
//		String str2 = "AAAA12"; // =? aa aa aa
//		// => 교집합 aa aa , 합집합 aa aa aa
//		System.out.println(test14.solution(str1, str2));
		
//		TestLevel2_Easy_NewClustering test14Easy = new TestLevel2_Easy_NewClustering();
//		String str1 = "E=M*C^2";
//		String str2 = "e=m*c^2";
//		System.out.println(test14Easy.solution(str1, str2));
		
		TestLevel2_DistancingConfirm test15 = new TestLevel2_DistancingConfirm();
		String[][] input = {{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"}, 
				{"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"}, 
				{"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"}, 
				{"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"}, 
				{"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};
		
		int[] output = test15.solution(input);
		
		System.out.print("[");
		for(int i: output) {
			System.out.print(i +" ");
		}
		System.out.print("]");
	}

}

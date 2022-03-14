package prac1;

public class StrigFuncPrac {

	public static void main(String[] args) {
		
		String number1 = "1234";
		String number2 = "24";
		int k;
		//첫글자부터 같으면 인덱스 0
		k = number1.indexOf(number2);
		
		String[] strArr2 = {"java and backend and junior and pizza 100",
		                    "python and frontend and senior and chicken 200",
		                    "cpp and - and senior and pizza 250",
		                    "- and backend and senior and - 150",
		                    "- and - and - and chicken 100",
		                    "- and - and - and - 150"};
		String[][] strArr22 = new String[strArr2.length][];
		for(int i = 0; i<strArr2.length; i++) {
			strArr22[i] = strArr2[i].split("and");
		}
		
		for(String[] stra : strArr22) {
			for(int i = 0; i< stra.length; i++) {
				stra[i] = stra[i].trim();
				System.out.print(stra[i] + " ");
			}
			System.out.println();
		}
		
		System.out.println(k);
	}

}

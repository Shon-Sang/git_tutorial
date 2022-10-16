package pinary_number;

public class PinaryNumber {

	private int count;
	
	public PinaryNumber() {
		
	}
	
	public void getAllNumber(int startNum, StringBuffer startStr, int endNum) {
		
		if(startNum == endNum) {
			System.out.println("실행됨");
			System.out.println(startStr.toString());
			startStr.setLength(0);
			return;
		}
		
		startNum += 1;
		
		getAllNumber(startNum, startStr.append("0"), endNum);
		getAllNumber(startNum, startStr.append("1"), endNum);
	}
	
	public void getAllNumber02(int startNum, String startStr, int endNum) {
		
		if(startNum == endNum) {
			System.out.println(startStr);
			if(startStr.indexOf("11") == -1 && startStr.charAt(0) != '0') {
				count += 1;
			}
			return;
		}
		
		startNum += 1;
		
		getAllNumber02(startNum, startStr.concat("0"), endNum);
		getAllNumber02(startNum, startStr + "1", endNum);
	}
	
	
	public int getCount() {
		return count;
	}
}

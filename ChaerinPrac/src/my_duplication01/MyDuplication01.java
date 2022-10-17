package my_duplication01;

public class MyDuplication01 {

	private String word;
	
	public MyDuplication01(String word) {
		this.word = word;
	}
	
	public String getDupl() {
		StringBuffer sb = new StringBuffer();
		char bufChar;
		for(int i = 0; i<word.length(); i++) {
			bufChar = word.charAt(i);
			if(word.indexOf(bufChar) == i) {
				sb.append(bufChar);
			}
		}
		
		
		return sb.toString();
	}
}

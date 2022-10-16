package mysort01;

public class MySort01 {

	private int[] sortArr;
	
	public MySort01(int[] sortArr) {
		this.sortArr = sortArr;
	}
	
	public void makeSort() {
		
		int temp = 0;
		
		// 오름차순(점점 커지는거)
		for(int i = 0; i<sortArr.length; i++) {
			for(int j = i + 1; j<sortArr.length; j++) {
				if(sortArr[i] > sortArr[j]) {
					temp = sortArr[i];
					sortArr[i] = sortArr[j];
					sortArr[j] = temp;
				}
			}
		}
	}
	
	public int[] getsortArr() {
		return sortArr;
	}
	
	public void sortArrSysout() {
		makeSort();
		StringBuffer sb = new StringBuffer();
		sb.append('{');
		for(int i : sortArr) {
			sb.append(i);
			sb.append(' ');
		}
		sb.deleteCharAt(sb.length() - 1);
		sb.append('}');
		System.out.println(sb.toString());
	}
	
	
}

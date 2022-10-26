package next_bignumber;

public class NextBigNumberMain {

	public static void main(String[] args) {
		NextBigNumber nbn = new NextBigNumber();
		System.out.println(nbn.solution(15));


		int n = 10; // 0000 1010 => 1111 0110
		int postPattern = n & -n;
		System.out.println(postPattern);
	}

}

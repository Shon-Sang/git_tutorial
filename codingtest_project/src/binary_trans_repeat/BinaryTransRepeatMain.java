package binary_trans_repeat;

import java.util.Arrays;

public class BinaryTransRepeatMain {

	public static void main(String[] args) {
		BinaryTransRepeat btr = new BinaryTransRepeat();
		
		System.out.println(btr.makeBinary(4));
		System.out.println(btr.makeHexa(26));
		System.out.println(Arrays.toString(btr.solution("110010101001")));
	}

}

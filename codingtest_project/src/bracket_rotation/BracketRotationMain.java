package bracket_rotation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BracketRotationMain {
	
	public static void main(String[] args) throws IOException {
		
		BracketRotation bracketRotation = new BracketRotation();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("문자열 입력");
		System.out.println("result : " + bracketRotation.solution(br.readLine()));
	}
}

package gitPractice;

import java.util.Scanner;

public class Ex20 {

   public static void main(String[] args) {
	   
//	  int i = 1;
//	  boolean flag = true;
//	  while(flag) {
//		  if(i>=5) {
//			  flag = false;
//		  }
//		  System.out.println(i);
//		  i = i + 1;
//	  }
      
      String repeat = "0"; // 종료할지 반복할지
      int perpose = 50;
      int input;
      boolean flag = true;
      Scanner sc = new Scanner(System.in);
      Scanner scString = new Scanner(System.in);
      
      System.out.println("================================");
      System.out.println("\t[숫자맞추기게임 시작]");
      System.out.println("================================");
      
      
      while(!repeat.equals("y")) {
         input = sc.nextInt();
         

         if(input > perpose) {
            System.out.println("더 낮게");
         }
         else if(input < perpose) {
            System.out.println("더 높게");
         }
         else {
	    	System.out.println("맞았습니다.");
	        System.out.println("게임을 종료하시겠습니까?(y/n)");
	        repeat = scString.nextLine();
            while(!repeat.equals("n") && !repeat.equals("y")) {
            	System.out.println("y 혹은 n만 입력하세요.");
            	repeat = scString.nextLine();
            }
            if(repeat.equals("n")) {
            	System.out.println("n입력 다시 시작힙니다.");
            }
         }

      }
      System.out.println("종료");
   }
   
}

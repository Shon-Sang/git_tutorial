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
      
      String repeat = "0"; // �������� �ݺ�����
      int perpose = 50;
      int input;
      boolean flag = true;
      Scanner sc = new Scanner(System.in);
      Scanner scString = new Scanner(System.in);
      
      System.out.println("================================");
      System.out.println("\t[���ڸ��߱���� ����]");
      System.out.println("================================");
      
      
      while(!repeat.equals("y")) {
         input = sc.nextInt();
         

         if(input > perpose) {
            System.out.println("�� ����");
         }
         else if(input < perpose) {
            System.out.println("�� ����");
         }
         else {
	    	System.out.println("�¾ҽ��ϴ�.");
	        System.out.println("������ �����Ͻðڽ��ϱ�?(y/n)");
	        repeat = scString.nextLine();
            while(!repeat.equals("n") && !repeat.equals("y")) {
            	System.out.println("y Ȥ�� n�� �Է��ϼ���.");
            	repeat = scString.nextLine();
            }
            if(repeat.equals("n")) {
            	System.out.println("n�Է� �ٽ� �������ϴ�.");
            }
         }

      }
      System.out.println("����");
   }
   
}

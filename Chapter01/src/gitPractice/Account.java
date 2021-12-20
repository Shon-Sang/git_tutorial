package gitPractice;

public class Account {
	
	//필드
    private String accountNo;
    private int balance;
    
    //생성자 작성
    public Account() {
       
    }
    
    public Account(String accountNo) {
       this.accountNo=accountNo;
    }
    
    //필요한 메소드 작성

   public void deposit(int money) {
      
      balance += money;
   }
   
   public void withdraw(int money) {
      
	   balance -= money;
   }  
   
   public void showBalance() {
      System.out.println("현재 계좌의 금액은 " + balance + "원 입니다.");
   }
   
   
   public void showInfo() {
      System.out.println(accountNo+"계좌가 개설되었습니다.");
      
   }

}

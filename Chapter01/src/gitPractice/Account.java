package gitPractice;

public class Account {
	
	//�ʵ�
    private String accountNo;
    private int balance;
    
    //������ �ۼ�
    public Account() {
       
    }
    
    public Account(String accountNo) {
       this.accountNo=accountNo;
    }
    
    //�ʿ��� �޼ҵ� �ۼ�

   public void deposit(int money) {
      
      balance += money;
   }
   
   public void withdraw(int money) {
      
	   balance -= money;
   }  
   
   public void showBalance() {
      System.out.println("���� ������ �ݾ��� " + balance + "�� �Դϴ�.");
   }
   
   
   public void showInfo() {
      System.out.println(accountNo+"���°� �����Ǿ����ϴ�.");
      
   }

}

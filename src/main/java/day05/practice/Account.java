package day05.practice;


class Account  {
	String accNo;
	double balance;
	
	public Account() {
		
	}
      public Account(String accNo,double balance) {
    	  
    	  this.accNo = accNo;
    	  this.balance = balance;
	}
      
      public String getAccNo() {
    	  return accNo;
      }
      
      public void setAccNo(String accNo) {
    	  this.accNo = accNo;
      }
      public double getBalance() {
    	  return balance;
      }
      
      public void setBalance(double balance) {
    	  this.balance = balance;
      }
	
	
}

//Create an implementation of the below Interface
public interface ATM {
    boolean deposit(Account account, double amount);
    boolean withdraw(Account account,double amount) throws Exception;
    double getBalance();
}


public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

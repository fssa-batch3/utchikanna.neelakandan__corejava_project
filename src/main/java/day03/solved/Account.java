package day03.solved;

public class Account {
	 
    public String accNo;
 
    public String name;
 
    public double balance;
 
   

    public Account(String accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }
    
    public String getAccNo(){
    	return accNo;
    }
    
    public String getAccName(){
    	return name;
    }
    
    public double getBalance(){
    	return balance;
    }
     
    public static void main(String[] args) {
    	Account acc = new Account("A0133", "utchi", 2000);
    	
    	System.out.println(acc.accNo+"-"+acc.name+"-"+acc.balance);
    }
}

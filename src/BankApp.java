/**
 * Created by SeleniumGuru.com on 4/6/18.
 */
class BankAccount {
    private double balance; //account balance

    public BankAccount(double openingBalance){
        this.balance = openingBalance;
    }

    public void deposit(double amount) {
        this.balance = balance + amount;
    }

    public void withdraw(double amount){
        this.balance = balance - amount;
    }

    public void display(){
        System.out.println("Balance" + balance);
    }

}

public class BankApp{
    public static void main(String args[]){
        BankAccount ba1 = new BankAccount(100.00);
        System.out.println("Before transactions: ");
        ba1.display();

        ba1.deposit(450.12);
        ba1.withdraw(20.00);
        System.out.println("After transactions: ");
        ba1.display();
    }
}

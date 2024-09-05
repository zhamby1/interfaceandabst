import java.util.ArrayList;

public class Teller extends Employee{


    String tellerid;


    public Teller(String name, int employeeID, String tellerid) {
        super(name, employeeID);
        this.tellerid = tellerid;
    }


    @Override
    public void deposit(double amount, Account account) {
        account.balance += amount;
        System.out.println("Deposit " + amount + " to " + account.acctName);

    }
}

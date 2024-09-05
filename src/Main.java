
public class Main {
    public static void main(String[] args) {

        Teller newteller = new Teller("Zach",45541,"zachhamby");
        Account newaccount = new Account(500.00,"zachsaccount");
        LoanOfficer newloanofficer = new LoanOfficer("Tim Jones", 546345);

        newloanofficer.deposit(400,newaccount);
        System.out.println(newaccount.balance);

        newteller.deposit(800.00,newaccount);
        System.out.println(newaccount.balance);





    }
}
public class LoanOfficer extends Employee {

    public LoanOfficer(String name, int employeeID) {
        super(name, employeeID);

    }

    Account loanAcct = null;

    @Override
    public void deposit(double deposit_amount, Account account) {
        account.balance += deposit_amount;
        System.out.println("Loan Approved");


    }
}

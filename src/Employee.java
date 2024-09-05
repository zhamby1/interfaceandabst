abstract class Employee {

    public Employee(String name, int employeeID) {
        this.name = name;
        this.employeeID = employeeID;
    }

    String name;
    int employeeID;

    public abstract void deposit(double amount, Account account);


}

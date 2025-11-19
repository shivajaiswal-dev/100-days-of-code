package java123.OOPS.abstraction;

public class CurrentAccount extends BankAccount{

    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        System.out.println("deposited " + amount);
    }

    @Override
    public void withdraw(double amount) {
System.out.println("withdraw " + amount);
    }
}

package java123.OOPS.abstraction;

  public class SavingsAccount extends BankAccount {

      public SavingsAccount(String accountNumber, double balance) {
          super(accountNumber, balance);
      }

      @Override
      public void deposit(double amount) {
          System.out.println("deposited " + amount);
      }

      @Override
      public void withdraw(double amount) {
System.out.println("withdrawn " + amount);
      }
  }

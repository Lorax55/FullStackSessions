package Session10;
// Code is used to deposit or withdraw some money from the account
// create class to deposit, (number is >0)
// create class to withdraw, (number is <= balance)
public class BankAccount {
    private double balance;
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
public void deposit (double amount) {
     if (amount > 0) {
            setBalance(amount);
         System.out.println("Desposited: " + amount);
        } else {
         System.out.println("Amount must be greater than 0");
     }
}
public void withdraw (double amount) {
    if (amount <= balance && amount > 0) {
        setBalance(getBalance() - amount);
        System.out.println("Withdrawn: " + amount + "   new balance: " + getBalance());
    } else {
        System.out.println("Not enough funds or amount is incorrect");
    }

}


    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.deposit( 500);
        ba.withdraw(200);
    }
}

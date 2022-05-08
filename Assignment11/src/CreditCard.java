public class CreditCard {
    private double balance = 5000.00;

    public double getBalance() {
        return balance;
    }
    public void withdraw(double take){
        balance = balance-take;
    }

}

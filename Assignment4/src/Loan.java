public class Loan {
    private String customerName;
    private int accountNumber;
    private double loanBalance;
    private double interestRate;
    private double montlyPayment;
    private int numberOfMonthlyPayments;
    static private int numberOfLoans;

    Loan(String name, double amount, double rate, int months){
        customerName = name;
        loanBalance = amount;
        interestRate = rate;
        numberOfMonthlyPayments = months;
        ++numberOfLoans;

    }
    public static int getNumberOfLoans(){
        return numberOfLoans;
    }
    public void setCustomerName(String name){
        customerName = name;
    }
    public void setLoanBalance(double balance){
        loanBalance = balance;
    }
    public void setAccountNumber(int number){
        accountNumber = number;
    }
    public void setInterestRate(double rate){
        interestRate = rate;
    }
    public void setMontlyPayment(double payment){
        montlyPayment = payment;
    }
    public void setNumberOfMonthlyPayments(int payment){
        numberOfMonthlyPayments = payment;
    }
    public String getCustomerName(){
        return customerName;
    }
    public double getLoanBalance(){
        return loanBalance;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public double getInterestRate(){
        return interestRate;
    }
    public double getMontlyPayment(){
        return montlyPayment;
    }
    public int getNumberOfMonthlyPayments(){
        return numberOfMonthlyPayments;
    }
    public static void decreaseNumberOfLoans(){
        numberOfLoans--;
    }
    public void calculateMonthlyPayment(){
        double payment;

        //should the last part be number of payments or number of monthly payments?
       payment= (getInterestRate()*getLoanBalance())/1-Math.pow(1+interestRate,-1*numberOfMonthlyPayments);
       montlyPayment = payment;
    }
    public String toString(){
        return "Customer Name: " + getCustomerName()+ ", Account Number: " + getAccountNumber() + ", Loan Balance: " + getLoanBalance() + ", NUmber of Monthly Payment: " + getMontlyPayment();
    }
}

public class AutoLoan extends Loan{
    private double downPayment;
    AutoLoan(String name, double amount, double rate, int months, double downPayment){
        super(name, amount, rate, months);
        this.downPayment = downPayment;
    }
    public void setDownPayment(double payment){
        downPayment = payment;
    }
    public double getDownPayment(){
        return downPayment;
    }
    @Override
    public void calculateMonthlyPayment(){
        double amount;
        amount = (getInterestRate()*(getLoanBalance()-getDownPayment()))/1-Math.pow(1+getInterestRate(),-1*getNumberOfMonthlyPayments());
        setMontlyPayment(amount);
    }
    public String toString(){
        return "Customer Name: " + getCustomerName() + ", Account Number: "+ getAccountNumber() + ", Loan Balance: "+ getLoanBalance() + ", Monthly Payment: " + getMontlyPayment() + ", Interest Rate: " + getInterestRate() + ", Number of Monthly Payments: "+ getMontlyPayment() +", Down Payment: " + getDownPayment();
    }
}

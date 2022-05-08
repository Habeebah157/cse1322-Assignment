public class StudentsLoan extends Loan{
    private boolean isDeferered;
    StudentsLoan(String name, double amount, double rate, int months, boolean isDeferered){
        super(name, amount, rate, months);
        this.isDeferered = isDeferered;
    }
    public void setDeferred(boolean deferered){
        isDeferered = deferered;
    }
    public boolean getDeferred(){
        return isDeferered;
    }
    @Override
    public void calculateMonthlyPayment(){
        double payment;
        if (isDeferered == true){
            setMontlyPayment(0);
        }else{
            payment =(getInterestRate()*getLoanBalance())/1-Math.pow(1+getInterestRate(),-1*getNumberOfMonthlyPayments());
            setMontlyPayment(payment);
        }
    }
    @Override
    public String toString(){
      return "Customer Name: " + getCustomerName() + ", Account Number: "+ getAccountNumber() + ", Loan Balance: "+ getLoanBalance() + ", Monthly Payment: " + getMontlyPayment() + ", Interest Rate: " + getInterestRate() + ", Number of Monthly Payments: "+ getMontlyPayment() + " Deferment: "+ getDeferred();
    }

}

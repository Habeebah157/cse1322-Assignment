public class HealthInsurancePolicy extends InsurancePolicy implements Deductible{
    private double deductibleLimit;
    private double totalDeductiblePaid;
    private double coPayment;
    private double totalOutOfPocket;
    HealthInsurancePolicy(String policyHolder, double deductibleLimit, double coPayment, double totalOutOfPocket){
        super(policyHolder);
        this.deductibleLimit = deductibleLimit;
        this.coPayment = coPayment;
        this.totalOutOfPocket = totalOutOfPocket;
    }
    public void setTotalDeductiblePaid(double totalDeductiblePaid){
        this.totalDeductiblePaid = totalDeductiblePaid;
    }
    public void setDeductibleLimit(double deductibleLimit){
        this.deductibleLimit = deductibleLimit;
    }
    public void setCoPayment(double coPayment){
        this.coPayment = coPayment;
    }
    public void setTotalOutOfPocket(double totalOutOfPocket){
        this.totalOutOfPocket = totalOutOfPocket;
    }
    public double getDeductibleLimit(){
        return deductibleLimit;
    }
    public double getCoPayment(){
        return coPayment;
    }
    public double getTotalOutOfPocket(){
        return totalOutOfPocket;
    }
    public double getTotalDeductiblePaid(){
        return totalDeductiblePaid;
    }
    @Override
    public void calculatePremium() {
        System.out.println("calculating and updating premium");
    }

    @Override
    public void selectPolicyCoverage() {
        System.out.println("selecting policy coverages");

    }

    public boolean hasMetDeductible(){
        if (getTotalDeductiblePaid()>=getDeductibleLimit()){
            return true;
        }else{
            return false;
        }
    }

    public boolean hasMetTotalOutOfPocket(){
        if(getTotalDeductiblePaid()+getCoPayment()>=getTotalOutOfPocket()){
            return true;
        }else {
            return false;
        }

    }
    public String toString(){
        return getPolicyHolder() + ", " + getPolicyNumber()+ "Met Deductible: "+ hasMetDeductible() + ", Met Total OUt-Of-Pocket: " + hasMetTotalOutOfPocket() ;
    }
}

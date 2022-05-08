abstract class InsurancePolicy {
    private String policyHolder;
    private int policyNumber;
    private static int numberOfPolicies = 0;
    private double premium = 0;
    InsurancePolicy(){
        policyHolder = "";
       policyNumber = numberOfPolicies++ ;
    }
    InsurancePolicy(String name){
        policyHolder = name;
        policyNumber = numberOfPolicies++;
    }
    public void setPolicyHolder(String policyHolder){
        this.policyHolder = policyHolder;
    }
    public void setPolicyNumber(int policyNumber){
        this.policyNumber = policyNumber;
    }
//    public static void setNumberOfPolicies(int numberOfPolicies){
//        this.numberOfPolicies = numberOfPolicies;
//    }
    public void setPremium(double premium){
        this.premium = premium;
    }
    public String getPolicyHolder(){
        return policyHolder;
    }
    public int getPolicyNumber(){
        return policyNumber;
    }

    public double getPremium() {
        return premium;
    }
    abstract public void calculatePremium();
    abstract public void selectPolicyCoverage();
    @Override
    public String toString(){
        return getPolicyHolder() + " " + getPolicyNumber() + " " + getPremium();
    }
}

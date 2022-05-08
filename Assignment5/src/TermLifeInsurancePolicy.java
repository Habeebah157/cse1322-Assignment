public class TermLifeInsurancePolicy extends InsurancePolicy{
 private String beneficiary;
 private int term;
 private double termPayout;
 TermLifeInsurancePolicy(String holder, String beneficiary, int term, double termPayout){
  super(holder);
  this.beneficiary = beneficiary;
  this.term = term;
  this.termPayout = termPayout;
 }
 public void setBeneficiary(String beneficiary){
  this.beneficiary = beneficiary;
 }
 public void setTerm(int term){
  this.term = term;
 }
 public void setTermPayout(double termPayout){
  this.termPayout = termPayout;
 }
 public String getBeneficiary(){
  return beneficiary;
 }
 public int getTerm(){
  return term;
 }
 public double getTermPayout(){
  return termPayout;
 }
 public void calculatePremium(){
  System.out.println("calculating and updating premium");
 }
 @Override
public void selectPolicyCoverage(){
  System.out.println("selecting policy coverages");
 }
@Override
 public String toString(){
 return getPolicyHolder() + ", " + getPolicyNumber() ;
}



}

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment5 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int flag = 0;
        ArrayList<InsurancePolicy> insurancePolicies = new ArrayList<>();
        do{
            System.out.println("1 – Create Health Insurance Policy");
            System.out.println("2 – Create Term-Life Insurance Policy");
            System.out.println("3 - Exit");
            int choice = in.nextInt();
            in.nextLine();
            switch (choice){
                case 1:

                    System.out.println("Enter name of policy holder: ");
                    String owner = in.nextLine();
                    System.out.println("Enter deductible amount: ");
                    double amount = in.nextDouble();
                    in.nextLine();
                    System.out.println("Enter co-payment amount: ");
                    double copay = in.nextDouble();
                    in.nextLine();
                    System.out.println("Enter total out-of-pocket amount: ");
                    double outofpock = in.nextDouble();
                    in.nextLine();
                    HealthInsurancePolicy one = new HealthInsurancePolicy(owner, amount, copay, outofpock);
                    insurancePolicies.add(one);
                break;
                case 2:
                    System.out.println("Enter name of policy holder: ");
                    String name = in.nextLine();
                    System.out.println("Enter name of beneficiary: ");
                    String benefit = in.nextLine();
                    System.out.println("Enter number of years in term:");
                    int noy = in.nextInt();
                    in.nextLine();
                    System.out.println("Enter amount of payout: ");
                    double payout = in.nextDouble();
                    in.nextLine();
                    TermLifeInsurancePolicy one2 = new TermLifeInsurancePolicy(name, benefit, noy, payout);
                    insurancePolicies.add(one2);
                break;
                case 3:
                    flag = 1;
                    break;

            }

        }while(flag !=1);
        for(int i = 0; i<insurancePolicies.size();i++){
            if(insurancePolicies.get(i) instanceof TermLifeInsurancePolicy){
                System.out.println(insurancePolicies.get(i).getPolicyHolder() + ", " + insurancePolicies.get(i).getPolicyNumber());

            }
            if(insurancePolicies.get(i) instanceof  HealthInsurancePolicy){
                System.out.println(insurancePolicies.get(i).getPolicyHolder() + ", " + insurancePolicies.get(i).getPolicyNumber() + " Met Deductible: " + ((HealthInsurancePolicy) insurancePolicies.get(i)).hasMetDeductible() + ", Met Total Out-of-Pocket: " + ((HealthInsurancePolicy) insurancePolicies.get(i)).hasMetTotalOutOfPocket());
            }
        }

    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment4 {

    public static void main(String[] args){
        ArrayList<Loan> loan = new ArrayList<Loan>();
        Scanner in = new Scanner(System.in);
        int flag = 0;

        do{
            System.out.println("1 - Add Loan");
            System.out.println("2 - Delete Loan");
            System.out.println("3 - Calculate Monthly Payments");
            System.out.println("4 - Print Loans");
            System.out.println("5 - Exit");
            System.out.print("Enter Choice: ");
            int choice = in.nextInt();
            switch (choice){
                case 1:
                    addLoan(loan);
                break;
                case 2:
                    deleteLoan(loan);
                break;
                case 3:
                    calculateMonthlyPayment(loan);
                break;
                case 4:
                    printLoans(loan);
                break;
                case 5:
                    flag = 1;
                    break;
                default:
                    System.out.println("Error: Please Enter Valid Input");

            }
        }while(flag != 1);



    }
    public static void addLoan(ArrayList<Loan> x) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Loan Type (1 - Students, 2 - Auto):");
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                in.nextLine();
                System.out.println("Enter Customer Name: ");
                String name = in.nextLine();
                System.out.println("Enter Loan Amount: ");
                float amount = in.nextFloat();
                System.out.println("Enter Interest Rate: ");
                float interest = in.nextFloat();
                System.out.println("Enter Number of Monthly Payments: ");
                int monthly = in.nextInt();
                System.out.println("Is Loan Deferred? (Y or N):");
                char ans = in.next().charAt(0);
                boolean ans2;
                if(ans == 'Y' || ans == 'y'){
                    ans2 = true;
                }
                else {
                    ans2 = false;
                }
                Loan loans = new StudentsLoan(name, amount, interest, monthly, ans2);
                x.add(loans);
                break;
            case 2:
                in.nextLine();
                System.out.println("Enter Customer Name: ");
                String name2 = in.nextLine();
                System.out.println("Enter Loan Amount: ");
                float amount2 = in.nextFloat();
                System.out.println("Enter Interest Rate: ");
                float interest2 = in.nextFloat();
                System.out.println("Enter Number of Monthly Payments: ");
                int monthly2 = in.nextInt();
                System.out.println("Enter Amount of Down payment: ");
                float down = in.nextFloat();
                Loan loans2 = new AutoLoan(name2, amount2,interest2,monthly2,down);
                x.add(loans2);

                break;
            default:
                System.out.println("Error: Please Enter Valid Input");


        }
    }
    public static void deleteLoan(ArrayList<Loan> x){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Customer Name");
        String customer = in.nextLine();
        for(int i = 0; i< x.size();i++){
            if(x.get(i).getCustomerName().equals(customer)) {
                x.remove(i);
            }
        }
    }
    public static void calculateMonthlyPayment(ArrayList<Loan> x){
        for(int i = 0; i< x.size(); i++){
            x.get(i).calculateMonthlyPayment();
        }
    }
    public static void printLoans(ArrayList<Loan> x){
        for(int i = 0; i< x.size();i++){
            System.out.println(x.get(i));
        }
    }

    }


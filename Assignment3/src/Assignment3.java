import java.util.ArrayList;
import java.util.Scanner;

public class Assignment3 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        ArrayList<Faculty> list = new ArrayList<>();
        int flag = 0;
        do{
            System.out.println("1 – Add Faculty");
            System.out.println("2 – Delete Faculty");
            System.out.println("3 – Calculate Faculty Pay");
            System.out.println("4 – Print Faculty");
            System.out.println("5 – Exit");
            System.out.println("Enter: ");
            int choice = in.nextInt();
            switch (choice){
                case 1:
                    addFaculty(list);
                    break;
                case 2:

                    removeFaculty(list);
                break;
                case 3:

                    calculateFacultyPay(list);
                break;
                case 4:
                    printFacutly(list);
                break;
                case 5:
                    flag = 1;
                    break;
            }


        }while(flag == 0);
    }
    public static void addFaculty(ArrayList<Faculty> list){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Employee Name");
        String name = in.nextLine();
        System.out.println("Enter Weekly Salary: ");
        float salary = in.nextFloat();
        System.out.println("Enter Weekly Stipend: ");
        float stipend = in.nextFloat();
        Faculty person = new Faculty(name, salary,stipend);

        list.add(person);
    }
    public static void removeFaculty(ArrayList<Faculty> list){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Employee Name: ");
        String name = in.nextLine();
        for(int i = 0; i< list.size(); i++){
           if(list.get(i).getName().equals(name)){
//               list.remove(list.get(i));
               list.remove(i);
               Employee.decreaseNumberOfEmployee();
           }

        }

    }
    public static void calculateFacultyPay(ArrayList<Faculty> list){
        for(int i = 0; i<list.size();i++){
            list.get(i).calculateWeeklyPay();
        }

    }
    public static void printFacutly(ArrayList<Faculty> list){
        for(int i = 0;i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }



}
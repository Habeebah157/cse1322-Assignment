import java.util.Scanner;


public class Assignment12 {
    public static void main(String args[]){
        JobLeadsList job = new JobLeadsList();
        Scanner in = new Scanner(System.in);
        boolean flag = false;
        do{
            System.out.println("1 – Add lead to head of list");
            System.out.println("2 – Add lead to tail of list");
            System.out.println("3 – Delete a lead");
            System.out.println("4 – Print list from head to tail");
            System.out.println("5 –  Print list from tail to head");
            System.out.println("6 – Exit");
            int choice = in.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter Company Name: ");
                    String company_name = in.next();
                    System.out.println("Enter Contact Person Name: ");
                    String contact_person = in.next();
                    System.out.println("Enter Contact Person Phone");
                    String contact_phone = in.next();
                    System.out.println("Enter Job Title: ");
                    String job_title = in.next();
                    System.out.println("Enter Job Description: ");
                    String job_description = in.next();
                    job.add_to_front(company_name,contact_person,contact_phone,job_title, job_description);
                    break;
                case 2:
                    System.out.println("Enter Company Name: ");
                    String company_name2 = in.next();
                    System.out.println("Enter Contact Person Name: ");
                    String contact_person2 = in.next();
                    System.out.println("Enter Contact Person Phone");
                    String contact_phone2 = in.next();
                    System.out.println("Enter Job Title: ");
                    String job_title2 = in.next();
                    System.out.println("Enter Job Description: ");
                    String job_description2 = in.next();
                    job.add_to_tail(company_name2,contact_person2,contact_phone2,job_title2, job_description2);

                    break;
                case 3:
                    System.out.println("Enter Company Name: ");
                    String company_name3 = in.next();
                    System.out.println("Enter Job Title: ");
                    String job_title3 = in.next();
                    job.remove_lead(company_name3,job_title3);
                    break;
                case 4:
                    job.print_head_to_tail();
                    break;
                case 5:
                    job.print_tail_to_head();
                    break;
                case 6:
                    flag = true;
                    break;
                default:
                    System.out.println("Error: Please enter a valid choice (1 thru 6)");
                    break;
            }
        }while(flag == false);

    }
}

public class JobLeadsList {
    private Node head;
    private Node tail;
    JobLeadsList(){
        head = null;
        tail = null;

    }
    public void add_to_front(String company_name, String contact_name, String contact_phone,String job_title, String job_description){

        JobLead job = new JobLead(company_name, contact_name, contact_phone, job_title, job_description);
        Node newNode = new Node();
        newNode.job = job;
        if(head == null){
            head = newNode;
            tail = newNode;
        }else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        System.out.println("Successful");
    }
    public void add_to_tail(String company_name, String contact_name, String contact_phone,String job_title, String job_description){
        JobLead job = new JobLead(company_name, contact_name, contact_phone, job_title, job_description);
        Node newNode = new Node();
        newNode.job = job;
//        newNode.prev = tail;
        if(tail == null){
            tail = newNode;
            head = newNode;
        }else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
//        if(tail!=null){
//            tail.next = newNode;
//        }
//        tail = newNode;
        System.out.println("Successful");


    }
    public void remove_lead(String company_name, String job_title ){
        Node temp = head;
        boolean flag = false;
        if(head == null && tail == null){
            System.out.println("List is empty");
            return;
        }

        while (temp != null){
            if(temp.job.getCompany_name().equals(company_name)&&temp.job.getJob_title().equals(job_title)) {
                if (temp == head) {
                    head = head.next;
                    head.prev = null;
                    flag = true;
                    break;
                } else if (temp == tail) {
                    tail = tail.prev;
                    tail.next = null;
                    flag = true;
                    break;

                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                    flag = true;
                    break;

                }
            }
            else {
                temp = temp.next;
            }

        }
        if(flag == true){
            System.out.println("Job Lead Deleted");
        }else {
            System.out.println("Not found");
        }


    }
    public void print_head_to_tail(){
        Node temp = head;
        if(head == null && tail == null){
            System.out.println("List is empty");
            return;
        }
        while (temp !=  null){
            System.out.println(temp.job.toString());
            temp = temp.next;

        }

    }
    public void print_tail_to_head(){
       Node temp = tail;

//        System.out.println(temp.job);
       while(temp != null){
           System.out.println(temp.job.toString());
           temp = temp.prev;
       }
//        System.out.println(temp.prev);

    }
}

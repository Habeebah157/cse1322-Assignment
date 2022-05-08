public class Employee {
    private String name;
    private int id;
    private static int numberofemployees = 0;
    Employee(){
        name = "new employee";
        id = numberofemployees++;

    }
    Employee(String employee){
        name = employee;
        id = numberofemployees++;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public static int getNumberofemployees(){
        return numberofemployees;
    }
    public static void decreaseNumberOfEmployee(){
        numberofemployees--;
    }
}


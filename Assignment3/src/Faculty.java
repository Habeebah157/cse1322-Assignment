public class Faculty extends Employee{
    private double salary;
    private double stipend;
    private double weekly_pay;

    Faculty(String name, double salary, double stipend){
        super(name);
//        Employee(name);
        this.salary = salary;
        this.stipend = stipend;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public void setStipend(double stipend){
        this.stipend = stipend;
    }
    public void setWeekly_pay(double weekly_pay){
        this.weekly_pay = weekly_pay;
    }
    public double getSalary(){
        return salary;
    }
    public double getStipend(){
        return stipend;
    }
    public double getWeekly_pay(){
        return weekly_pay;
    }
    public void calculateWeeklyPay(){
        weekly_pay= salary+stipend;
    }
    @Override
    public String toString(){
        //Is this correct?
        return "Name: " + getName() + ", Salary: " + getSalary() + ", Stipend:"+ getStipend() + ", Weekly Pay: "+ getWeekly_pay();
    }
}

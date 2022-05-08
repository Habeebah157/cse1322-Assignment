public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double s, double s2, double s3){
        this.side1 = s;
        this.side2 = s2;
        this.side3 = s3;
    }
    public Triangle(){
        this.side1 = 3;
        this.side2 = 4;
        this.side3 = 5;
    }
    public double perimeter(){
        return side1+side2+side3;
    }
    public double area(){
        //come back
        double p = (side1+side2+side3)/2;
        double square =Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
        return square;
    }
    public double height(){
        double smallest;
        //come back
        if ((side1 < side2)&& (side1 < side3)){
            smallest = side1;
        }else if ((side2<side1)&& (side2<side3)){
            smallest = side2;
        }else {
            smallest = side3;
        }
        return (area()*2)/smallest;
    }
    @Override
    public String toString(){
        String change = "Triangle has sides "+ side1 + ", " + side2 + ", and " + side3 + " It has an area of "+ area() + " and perimeter of " + perimeter();
        return change;
    }


}

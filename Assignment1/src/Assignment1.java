public class Assignment1 {
    public static void main(String args[]){

        Circle[] carray = new Circle[10];
        Rectangle[][] rarray = new Rectangle[3][3];
//
        Triangle tri1 = new Triangle(18,30,24);
        Triangle tri2 = new Triangle();

    for (int i = 0; i<10; i++){
        Circle c1 = new Circle((i+1));
        carray[i] = c1;
    }
    for(int i = 0; i<10;i++){
        System.out.println("Area of circle with radius "+(i+1)+ " is "+carray[i].area()+ " circumference is "+ carray[i].circumfrence());
    }
        System.out.println();
    for(int i =0; i<3; i++){
        for(int j = 0; j<3; j++){
            Rectangle t1 = new Rectangle((i+1),(j+1));
            rarray[i][j] = t1;
        }
    }
    for (int i = 0; i<3; i++){
        for(int j = 0; j<3; j++){
            System.out.println("Area of a rectangle "+(i+1) + " by "+ Math.round((j+1)) + " is " + Math.round(rarray[i][j].area()) + " it's perimeter is "+ Math.round(rarray[i][j].perimeter()));
        }
    }
        System.out.println();
        System.out.println("Area of triangle 18x30x24 is "+ tri1.area() + " it's perimeter is "+ tri1.perimeter() + " and it's height is "+ tri1.height() );
        System.out.println("Area of triangle 3x4x5 is " + tri2.area() + " it's perimeter is "+ tri2.perimeter()+ " and it's height is "+ tri2.height());



    }
}
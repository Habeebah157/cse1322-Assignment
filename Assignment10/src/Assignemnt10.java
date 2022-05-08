import java.io.*;
import java.io.FileNotFoundException;
import java.util.*;
public class Assignemnt10 {
    public static void main(String args[]){
        PrintWriter finalgrade;
        PrintWriter errorgrade;

        try{
            Scanner in = new Scanner(System.in);

            System.out.println("Enter name of input file:");
            String input = in.nextLine();


            File ErrorGradesFile = new File("src\\ErrorGradesFile.txt");
            File FinalGradesFile = new File("src\\FinalGradesFile.txt");

            File RawGradesFile = new File("src\\"+input);
            Scanner in2 = new Scanner(RawGradesFile);


            finalgrade = new PrintWriter(FinalGradesFile);
            errorgrade = new PrintWriter(ErrorGradesFile);



            while(in2.hasNextLine()){

                String student = in2.nextLine();
                String[] one = student.split(",");


                if(one[1].equals(" ")){
                    errorgrade.println(student);
                }
                else {

                    double finalg = testclassgrade(one) + averagequizgrade(one);
                    finalgrade.println(one[0]+ " "+ one[1] + " "+ finalg + " " + lettergrade(finalg));

                }



            }
            finalgrade.close();
            errorgrade.close();


        }catch (FileNotFoundException e){
            System.out.println("Error: System.IO.FileNotFoundException: Could not find file...");

        }catch(NumberFormatException e){
            System.out.println("Error: System.IO.FormatException: Input string was not in correct format…");

        }catch (IndexOutOfBoundsException e){
            System.out.println("Error: System.IndexOutOfRangeException: Index was outside the bounds of the array…");

        }

    }
    public static double testclassgrade(String[] x){

        boolean cheated = false;


        double firstg = Double.parseDouble(x[12]);
        double secondg = Double.parseDouble(x[13]);
        double thirdg = Double.parseDouble(x[14]);
        if(firstg == -1.00|| secondg == -1.00 || thirdg == -1.00){
            if(firstg == -1.00 ){
                firstg = 0;
            }else if(secondg == -1.00){
                secondg = 0;
            }else if(thirdg == -1.00){
                thirdg = 0;
            }
        }else {

            if (thirdg > firstg || thirdg > secondg) {
                if (secondg > firstg) {
                    secondg = thirdg;
                } else {
                    firstg = thirdg;
                }
            }
        }
        double final_test_grade = ((firstg*0.25)+(secondg*0.25)+(thirdg*0.25));
        return final_test_grade;



    }
    public static double averagequizgrade(String[] x){{
        double total = 0;
        double min = Double.parseDouble(x[2]);
        for(int i = 2; i< x.length-3; i++){
            double currentNumber = Double.parseDouble(x[i]);
            if(currentNumber<min){
                min = currentNumber;
            }
            total += currentNumber;
        }
        total -= min;
        double avg = total/9;
        return avg*0.25;
    }


    }
    public static char lettergrade(double g){
        char lettergrade = 'a';

        if(g >= 89.5){
           return lettergrade =  'A';
        }else if(g >= 79.5){
           return lettergrade = 'B';
        }else if(g >= 69.5){
             return lettergrade = 'C';
        }else if(g >= 59.5){
            return lettergrade = 'D';
        }else {
           return lettergrade = 'F';
        }
    }

}
class FileNotFoundException extends Exception{
    FileNotFoundException(){}
    FileNotFoundException(String message){
        super(message);
    }
}

class FormatException extends Exception{
    FormatException(){}
    FormatException(String message){
        super(message);
    }
}
class IOException extends Exception{
    IOException(){}
    IOException(String message){
        super(message);
    }
}
class IndexOutOfRangeException extends Exception{
    IndexOutOfRangeException(){}
    IndexOutOfRangeException(String message){
        super(message);
    }
}




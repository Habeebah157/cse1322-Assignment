import java.util.Scanner;

public class Assignment8 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int flag = 0;
        do {
            System.out.println("1 – Convert Decimal Number to Binary Number");
            System.out.println("2 – Convert Decimal Number to Hexadecimal Number");
            System.out.println("3 – Convert Decimal IP Address to Binary IP Address");
            System.out.println("4 – Convert Decimal MAC Address to Hexadecimal MAC Address");
            System.out.println("5 – Exit");
            System.out.print("Enter Choice: ");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Decimal Integer: ");
                    int dec = in.nextInt();
                    System.out.println("Decimal Number: "+dec);
                    System.out.println("Binary Number: "+ decimal2Binary(dec));

                    break;
                case 2:
                    System.out.println("Enter Decimal Integer: ");
                    int dec2 = in.nextInt();
                    System.out.println("Decimal Number: " + dec2);
                    System.out.println("Binary Number: "+ decimal2Hexadecimal(dec2));
                    break;
                case 3:
                    System.out.println("Enter Decimal IP Address(i.e 192.168.35.10): ");
                    String address = in.next();
                    System.out.println("Decimal IP Address: "+ address);
                    String[] mynew = address.split("\\.");
                    System.out.println("Binary IP Address: " + convertIpAddress(mynew,0));

                    break;
                case 4:
                    String ad = in.next();
                    String[] mynew2 = ad.split("\\:");
                    System.out.println(convertMacAddress(mynew2, 0));
                    break;
                case 5:
                    flag = 1;
                    break;
                default:
                    System.out.println("Error: Please Enter Valid Input");
                    break;
            }
        }while (flag == 0);
        System.out.println(decimal2Binary(25));
        System.out.println(decimal2Hexadecimal(207));
        System.out.println("Enter Decimal IP Address(i.e 192.168.35.10): ");

    }
    public static String decimal2Binary(int x){
        if(x == 0){
            return "";
        }
        else if(x%2 == 0 ){

            return ( decimal2Binary(x/2)+"0");
        }else{
            return ( decimal2Binary(x/2)+"1");
        }

    }
    public static String decimal2Hexadecimal(int x){

        if(x == 0){
            return "";
        }
        int ans = x % 16;
        switch (ans){
        case 10:
            return decimal2Hexadecimal(x/16)+"A";
            case 11:
                return decimal2Hexadecimal(x/16)+"B";
            case 12:
                return decimal2Hexadecimal(x/16)+"C";
            case 13:
                return decimal2Hexadecimal(x/16)+"D";
            case 14:
                return decimal2Hexadecimal(x/16)+"E";
            case 15:
                return decimal2Hexadecimal(x/16)+"F";
            default:
                return decimal2Hexadecimal(x/16)+Integer.toString(ans);

        }

    }
    public static String convertIpAddress(String[] array,int index){
        if (index==3){
            return decimal2Binary(Integer.parseInt(array[index]));
        }else {
            return decimal2Binary(Integer.parseInt(array[index]))+"."+convertIpAddress(array,index+1);
        }

    }
    public static String convertMacAddress(String[] array,int index ){
        if(index == 5){
            return decimal2Hexadecimal(Integer.parseInt(array[index]));
        }else{
            return decimal2Hexadecimal(Integer.parseInt(array[index]))+"."+convertMacAddress(array,index+1);
        }
    }
//    public static String decimal2Hexadecimal(int integer){
//        return 3;
//    }
//    public static int convertIpAdress(int integer){
//        return 3;
//    }
//    public static int convertMacAddress(int integer){
//        return 3;
//    }
}

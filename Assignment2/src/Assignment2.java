import java.util.*;
public class Assignment2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Encryption encrypt = new Encryption();
        System.out.println(encrypt.encrypt_message("HEllo"));
        System.out.println(encrypt.decrypt_message("$:!*]"));

        int num =0;
        do{
            System.out.println("1 Encrypt a message");
            System.out.println("2 Decrypt a message");
            System.out.println("3 Quit");
            System.out.println("Enter Choice");
            int choice = in.nextInt();
            if (choice == 3){
                num = 3;
            }
            switch (choice){
                case 1:
                    System.out.println("Enter the plain text message: ");
                    String enter = in.next();

                    System.out.println("Encrypted Msg: "+encrypt.encrypt_message(enter));
                break;
                case 2:
                    System.out.println("Enter the encrypted message: ");
                    String enter2 = in.next();
                    System.out.println("Decrypted Msg: " + encrypt.decrypt_message(enter2));
                break;
            }
        }while(num != 3);
    }
}

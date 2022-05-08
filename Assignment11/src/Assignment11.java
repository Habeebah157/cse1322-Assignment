
public class Assignment11 {
    public static void main(String args[]){
        CreditCard credit = new CreditCard();
        CardHolder holder = new CardHolder(credit);
        Thread t1 = new Thread(holder);
        Thread t2 = new Thread(holder);
        t1.setName("John");
        t2.setName("Mary");
        t1.start();
        t2.start();

    }
}

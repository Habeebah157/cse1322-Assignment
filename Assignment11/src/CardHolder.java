public class CardHolder implements Runnable{
    private CreditCard card;
    public CardHolder(CreditCard x){
        card=x;
    }

    @Override
    public void run() {
        for(int i = 1; i<=6; i++){
            makeWithdrawal(500);
        }

    }
    private synchronized void makeWithdrawal(double withdraw){
        if(card.getBalance() < withdraw){
            System.out.println("Not enough in thread "+Thread.currentThread().getName()+ " to withdraw: "+ withdraw+", Balance:"+ card.getBalance());

        }else{
            System.out.println( Thread.currentThread().getName()+ " before withdrawing "+ withdraw + " Balance: "+ card.getBalance());
            try {
                Thread.sleep(6000);
            }catch (Exception e){
                System.out.println(e);
            }
            card.withdraw(withdraw);
        }
        System.out.println(Thread.currentThread().getName()+ ", after withdrawing" + withdraw + ", Balance "+ card.getBalance());

    }
}

package OOP.Interfaces;

public class mainb {
    public static void main(String[] args) {

        Payment upi = new UPIPayment();
        Payment card = new CardPayment();

        upi.pay(500);
        card.pay(1200);
    }
}

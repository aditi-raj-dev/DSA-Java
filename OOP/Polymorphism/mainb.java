package OOP.Polymorphism;

public class mainb {

    public static void main(String[] args) {

        Payment payment;

        payment = new CreditCardPayment();
        payment.pay();

        payment = new UPIPayment();
        payment.pay();
    }
}

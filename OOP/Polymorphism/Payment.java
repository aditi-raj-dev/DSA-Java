package OOP.Polymorphism;

public class Payment {

    void pay() {
        System.out.println("Processing Payment");
    }
}

class CreditCardPayment extends Payment {

    @Override
    void pay() {
        System.out.println("Paid using Credit Card");
    }
}

class UPIPayment extends Payment {

    @Override
    void pay() {
        System.out.println("Paid using UPI");
    }
}

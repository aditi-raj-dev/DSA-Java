package OOP.Encapsulation;

public class maind {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.setAccountHolder("Aditi");
        account.setBalance(25000.75);

        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Balance: " + account.getBalance());
    }
}

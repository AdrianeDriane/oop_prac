package PaymentMethods;

public class Main {
    public static void main(String[] args) {
        PaymentMethod paymentMethod;

        paymentMethod = new GCash();
        paymentMethod.pay(500.25);

        paymentMethod = new CreditCard();
        paymentMethod.pay(654.8);
    }
}

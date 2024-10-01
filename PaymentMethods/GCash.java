package PaymentMethods;

class GCash extends PaymentMethod {
    @Override
    void pay(double amount) {
        System.out.println("Paid with an amount of " + amount + " using GCash.");
    }
}

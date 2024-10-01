package PaymentMethods;

class CreditCard extends PaymentMethod {
    @Override
    void pay(double amount) {
        System.out.println("Paid with an amount of " + amount + " using Credit Card.");
    }
}

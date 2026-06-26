public class StripeAdapter implements PaymentProcessor {

    private StripeGateway stripeGateway;

    public StripeAdapter() {
        this.stripeGateway = new StripeGateway();
    }
    public void processPayment(double amount) {
        stripeGateway.pay(amount);
    }
}
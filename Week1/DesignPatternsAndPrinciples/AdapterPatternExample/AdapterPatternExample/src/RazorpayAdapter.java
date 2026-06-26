public class RazorpayAdapter implements PaymentProcessor {

    private RazorpayGateway razorpayGateway;

    public RazorpayAdapter() {
        this.razorpayGateway = new RazorpayGateway();
    }

    public void processPayment(double amount) {
        razorpayGateway.completeTransaction(amount);
    }
}
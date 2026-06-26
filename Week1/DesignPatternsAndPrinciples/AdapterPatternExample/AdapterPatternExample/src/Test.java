//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Test {
    public static void main(String[] args) {
      PaymentProcessor paypal=new PayPalAdapter();
      paypal.processPayment(1000);
      PaymentProcessor stripe=new StripeAdapter();
      stripe.processPayment(2000);
      PaymentProcessor razorpay=new RazorpayAdapter();
      razorpay.processPayment(3000);
    }
}
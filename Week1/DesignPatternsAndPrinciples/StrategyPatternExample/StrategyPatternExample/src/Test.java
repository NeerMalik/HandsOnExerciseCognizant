//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Test {
    public static void main(String[] args) {
    PaymentContext context=new PaymentContext();
    context.setPaymentStrategy(new CreditCardPayment("ABC","1234567890123456"));
    System.out.println();
    context.setPaymentStrategy(new PayPalPayment("abc@example.com"));
    context.executePayment(1500);
    }
}
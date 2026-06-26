public class PayPalAdapter implements PaymentProcessor{
    private  PayPalGateway payPalGateway;
    public PayPalAdapter(){
        this.payPalGateway=new PayPalGateway();
    }
    public void processPayment(double amount){
        payPalGateway.makePayment(amount);
    }
}

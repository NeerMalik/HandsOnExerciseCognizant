public class CreditCardPayment implements PaymentStrategy {

    private String cardHolderName;
    private String cardNumber;

    public CreditCardPayment(String cardHolderName, String cardNumber) {
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
    }


    public void pay(double amount) {
        System.out.println("Paid rupees" + amount +
                " using Credit Card.");
        System.out.println("Card Holder: " + cardHolderName);
        System.out.println("Card Number: **** **** **** "
                + cardNumber.substring(cardNumber.length() - 4));
    }
}